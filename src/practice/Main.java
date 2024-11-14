package practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // カレンダーを表示する年数（例: 5年分）
        int yearsToGenerate = 5;
        
        // 現在の日付から開始
        LocalDate now = LocalDate.now();
        LocalDate currentMonth = now.withDayOfMonth(1); // 今月の1日

        // 指定した年数分ループ
        for (int y = 0; y < yearsToGenerate * 12; y++) {  // 12ヶ月 × 年数
            List<List<LocalDate>> month = new ArrayList<>(); // 2次元表になるので、ListのListを用意
            List<LocalDate> week = new ArrayList<>();       // 1週間分のLocalDateを格納するListを用意

            // その月の初日
            LocalDate firstDayOfMonth = currentMonth;
            int lastDayOfMonth = firstDayOfMonth.lengthOfMonth(); // 月の最終日

            // 曜日を表すDayOfWeekを取得し、前月のLocalDateを求める
            DayOfWeek startWeek = firstDayOfMonth.getDayOfWeek();
            int weekValue = startWeek.getValue();
            LocalDate prevMonth = firstDayOfMonth.minusDays(weekValue); // 前月分の日付を埋める

            LocalDate day = prevMonth;

            // カレンダーに日付を追加していく処理
            while (!day.isAfter(firstDayOfMonth.plusDays(lastDayOfMonth - 1))) {
                week.add(day);
                day = day.plusDays(1);

                // 1週間分が埋まったらリストに追加し、次の週を準備
                if (week.size() == 7) {
                    month.add(new ArrayList<>(week));
                    week.clear();
                }
            }

            // 最終週の翌月分の日付を追加
            while (week.size() < 7) {
                week.add(day);
                day = day.plusDays(1);
            }
            month.add(new ArrayList<>(week)); // 最後の週を追加

            // カレンダーを表示 (ここでは月ごとにプリントします)
            System.out.println("カレンダー: " + firstDayOfMonth.getMonth() + " " + firstDayOfMonth.getYear());
            for (List<LocalDate> oneWeek : month) {
                System.out.println(oneWeek);
            }
            System.out.println("---------------");

            // 翌月に進める
            currentMonth = currentMonth.plusMonths(1);
        }
    }
}
