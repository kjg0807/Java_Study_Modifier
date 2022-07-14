package com.naver.animal;

public class Cat
{
	private int age; // public - 누구나 접근 가능 함 , private - 같은 class만 사용가능

	void sound()
	{
		age = 10;
		System.out.println("야옹");
	}

	Cat()
	{
		
	}
}
