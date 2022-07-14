package com.naver.animal;

public class Zoo
{
	// 멤버 변수
	// 접근지정자 [그외 지정자] 데이터타입 변수명;
	// 클래스 변수
	public static String title = "사파리";
	// 인스턴수 변수
	public final int price = 50000; // final - 값을 변경하지 못함

	// 멤버 메서드 선언
	// 접근 지정자 [그외 지정자] 리턴타입 메서드명 ([매개변수 선언]){}
	// 클래스 매서드
	public static void info()
	{
		System.out.println("Static Method");
		System.out.println(Zoo.title);
		// System.out.println(price);
		//getPrice();
	}

	// 인스턴스 메서드
	public void getPrice()
	{
		System.out.println(price);
		System.out.println(Zoo.title);
		Zoo.info();
	}
}
