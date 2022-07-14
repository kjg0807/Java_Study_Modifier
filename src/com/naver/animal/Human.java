package com.naver.animal;

import java.util.Scanner;

public class Human
{
	private int age;

	public int getAge() // get을 사용한 메서드 -> 값을 꺼내오려는 메서드
	{
		return this.age;
	}

	public void setAge(int age)// int age -> 매개변수 // set 을 사용한 메서드 -> 값을 대입하려는 메서드
	{
		// 0 ~ 150 사이 숫자면 출력 아니면 0으로 출력
		this.age = 0;
		if (age >= 0 && age < 150)
		{
			this.age = age;
		}
		else
		{
			this.age = 0;
		}
	}

	public void info()
	{
		System.out.println(this.age);
	}

	public void myPet()
	{
		// Cat cat = new Cat();
		// // cat.age = 10;
		// cat.sound();
	}
}
