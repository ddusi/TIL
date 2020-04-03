package jump2java;

public class JavaIf {
	public static void main(String[] args) {
		int money = 2000;
		boolean hasCard = false;
		
		if (money>=3000 || hasCard) {
			System.out.println("택시를 타고 가라");
		}
		else if(hasCard) {
			System.out.println("택시를 타고 가라");}
		else {
			System.out.println("걸어가라");
		}
	}	
}
