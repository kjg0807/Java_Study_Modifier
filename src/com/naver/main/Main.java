package com.naver.main;

import com.naver.animal.Human;
import com.naver.animal.Zoo;

public class Main
{

	public static void main(String[] args)
	{
		// Cat cat = new Cat();
		// cat.sound();
		// cat.age = 5;
		Human human = new Human();
		human.setAge(300);
		human.info();
		// -----------------------------------
		System.out.println(Zoo.title);
		Zoo.info();

		Zoo zoo = new Zoo();
		//zoo.price = 10000;
	}
}
