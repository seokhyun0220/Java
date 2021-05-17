package sub2;
/*
 * 날짜 : 2021/05/17
 * 이름 : 강석현
 * 내용 : 자바 변수의 자료형 실습하기
 */
public class DateTypeTest {
	public static void main(String[] args) {
		
		// 정수형 //각 숫자만큼만 저장할수있음
		byte  num1 = 127;  // 1바이트
		short num2 = 32767; // 2바이트 
		int   num3 = 2147483647; // 4바이트
		long  num4 = 1000L; // 8바이트 
		
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
		System.out.println("num3 :"+num3);
		System.out.println("num4 :"+num4);
		
		// 실수형
		float var1 = 1.123456789f; // 수소점 7자리까지 저장
		double var2 = 1.1234567890123456789; // 수소점 16자리까지 저장
		
		System.out.println("var1 :"+var1);
		System.out.println("var2 :"+var2);
		
		// 논리형
		boolean value1 = true;
		boolean value2 = false;
		
		System.out.println("value1 :"+value1);
		System.out.println("value2 :"+value2);
		
		// 문자형 문자하나만 저장
		char ch1 = 'A';
		char ch2 = '가';
		
		System.out.println("ch1 :"+ch1);
		System.out.println("ch2 :"+ch2);
		
		// 문자열 //문자열로 많이 사용함 
		String str1 = "Apple";
		String str2 = "가위";
		String str3 = "A";
		String str4 = "가";
		
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
		System.out.println("str3 :"+str3);
		System.out.println("str4 :"+str4);
	}

}
