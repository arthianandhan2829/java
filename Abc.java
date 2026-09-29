import java.util.Scanner;
public class Abc{

	public static void main(String args[]) {
	    String str="a1";
	    System.out.println(str.matches("."));
	    System.out.println(str.matches("[abc]"));
	    System.out.println(str.matches("[abc][123]"));
	    System.out.println(str.matches("[^abc]"));
	    System.out.println(str.matches("[a-c1-4]"));
	    System.out.println(str.matches("a|b"));
	    System.out.println(str.matches("a"));
	    System.out.println(str.matches("\\d"));
	    System.out.println(str.matches("\\D"));
	    System.out.println(str.matches("\\s"));
	    System.out.println(str.matches("\\S"));
	    System.out.println(str.matches("\\w"));
	    System.out.println(str.matches("\\W"));


        String str1="010101";
		System.out.println(str1.matches("[01]*"));
		String str2 ="0123abce";
		System.out.println(str.matches("[0-9a-f]"));
		String str3="11/08/2026";
		System.out.println(str3.matches("[0-3][0-9][/][0-1][0-9][/][0-9]{4}"));
        String str4 = "Java@123#Hello!";
        String result = str4.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);
		String str5 = "Java    is    very    easy";
        String result1 = str5.replaceAll("\\s+", " ");
        System.out.println(result1);
		String str6 = "Java is very easy";
        String[] words = str6.split("\\s+");
        System.out.println(words.length);
    }
}
	
