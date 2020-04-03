package jump2java;

public class 연습문제3_9 {
	public static void main(String[] args) {
		 char ch = 'T';
		 char lowerCase = 
				(ch >= 'A' && ch <= 'Z') ? 
				( (char)( ch + 32 )) : ch;
		 System.out.println("ch : " + ch);
		 System.out.println("ch to lowerCase : " + lowerCase);
		 }

}
