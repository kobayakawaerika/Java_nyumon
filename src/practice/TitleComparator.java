package practice;

public class TitleComparator implements Comparable<Book>{
	public int Compare(Book x, Book y) {
		return x.getTitle().compareTo(y.getTitle());
	}

	@Override
	public int compareTo(Book o) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
}
