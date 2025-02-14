package chapter04;

public class CustomerTest {

	public static void main(String[] args) {
		/*
		 * 객체 선언		클래스명 변수명;
		 * 객체 생성      	변수명 = new 클래스명([인자]); 
		 * 객체 접근		변수명, 속성명		  변수명, 함수명
		 * 
		 * 
		 * 선언 & 생성
		 * 클래스명 변수명 = new 클래스명([인자]);
		 * */
		
	
//		Customer cust1 = new Customer();
//		/*속성은 객체가 생성(new) 될때 기본값으로 초기화 된다
//		 * 정수 : 0
//		 * 실수 : 0.0
//		 * 논리 : false
//		 * 문자 : \u0000
//		 * 객체 : null
//		  -기본 값이 아닌 다른 값으로 설정할 때만 속성명 = 값; 으로 초기화 한다.
//		 * */
//		cust1.name = "Uplus";
//		cust1.age = 2;
//		cust1.address = "서초구 선릉역";
		
		Customer cust1 = new Customer("Uplus", "서초구", 2);
			
		
		System.out.println(cust1.toString());
		System.out.println(new Customer("kdg","성북구",37).toString());
		System.out.println(new Customer().toString());
		
		Customer cust2 = new Customer("1","1",1);
		System.out.println(cust2.toString());
		System.out.println(cust1.equals(cust2));
	}
}
