package com.naver.ex1;

public class Iu
{
	private String name;
	private int age;

	// Setter - public void set변수명(데이터 타입 변수명) { 내용 }
	// Getter - public 리턴타입 get변수명(데이터 타입 변수명) { 내용 }

	private static Iu iu = null;

	private Iu() // 기본 생성자 - Class 이름과 똑같이
	{

	}

	public static Iu getInstance()
	{
		if (Iu.iu == null)
		{
			Iu.iu = new Iu();
			// 처음 호출시 객체 생성 -> iu 주소 생성 완료 -> 생성 후 또 호출시 null이 아니므로 생성한 주소가 리턴된다
		}
		return Iu.iu;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

}
