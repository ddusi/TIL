package test;

import java.util.Scanner;

/*고객의 정보는 이름, 성별, 이메일, 출생년도 가 있습니다.​
 * 고객의 정보를 키보드로 입력받아 본인이 선택한 자료구조에 저장해야 합니다.​
​이름은 문자열 성별은 남자는 M 여자는 F 이메일은 문자열, 태어난 연도는 정수​
*/
public class main {
  public static void main(final String[] args) {
      Scanner s = new Scanner(System.in);
      
      System.out.println("이름을 입력해 주세요.");
      String name = s.next();
      System.out.println("성별을 입력해 주세요. M or F");
      String sex = s.next();
      System.out.println("이메일을 입력해 주세요.");
      String email = s.next();
      System.out.println("생년월일을 입력해 주세요.");
      int birthday = s.nextInt();
      
      
      System.out.println("name: "+ name);
      System.out.println("sex: "+ sex);
      System.out.println("email: "+ email);
      System.out.println("birthday: "+ birthday);
	
      	information p = new information();
		p.name = name;
		p.sex = sex;
		p.email = email;
		p.birthday = birthday;
		System.out.println(p);
	}

}

class information {
	String name;
	String sex;
	String email;
	int birthday;
  }




