package chapter04;

import java.util.Calendar;

/**
 * modifier(제어자)
 * 
 * access modifier		public 	protected	생략(default)	private
 * usage  modifier		abstract	static	final
 * 
 * access modifier	: 클래스, 메서드, 속성에 대한 접근을 제한한다.
 * 		public 		: ***접근 제한이 전혀 없다. *** 수정안해! 이런 의미를 가지고 있다.
 * 		protected	: 상속 관계에서는 제한이 없다. 상속 관계가 아니면 같은 package가 아닌 경우 접근 불가. 엄마집 들락달락하는느낌
 * 		생략(default): 같은 package가 아닌 경우 접근 불가. 주방,거실 같이 이용 가능한거 
 * 		private		: 선언한 클래스 내에서만 접근 가능. 정말 수정될거같은거에 사용. 외부에서는 절대 수정할 일이 없게!
 * 		
 * usage  modifier	: 클래스, 메서드, 속성의 기능을 제한한다.
 * 
 * Encapsulation (캡슐화)
 * 	- 대부분의 속성과 일부 메소드, private, default(생략), protected를 애용해서 캡슐로 쌓는것 
 * ?purpose?
 * 1.보호
 * 2.은닉 ==> decouple 효과 및 유지보수를 높인다. ***목적이 더 크다.
 * 
 * -접근할 수 있는 public한 메서드(getter, setter) 를 제공해야한다.
 * 
 */
public class MyDate {
	String name;
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year<2024) {
			System.out.println("2024년 이후로 설정해주세요");
		} else {
		this.year = year;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int year, month, day;
}


















