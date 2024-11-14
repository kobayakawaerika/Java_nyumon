package practice;
public class javaEquals {
public static void main(String[] args) {
    String hoge = "Hello";
    String fuga = "Hello!";
    hoge += "!";
    fuga += "!";
    
    if(hoge == fuga) {
    	System.out.println("hogeとfugaは等しい");
    } else {
    	System.out.println("No");
    }
    
    if(hoge.contains("e")) {
    	System.out.println("OK");
    } else {
    	System.out.println("ちがうよーん");
    }
    
}
}

