package com.naver.ex1;

public class Ex1Main
{
	public static void main(String[] args)
	{
		// 싱글 톤 (디자인 패턴)
		Iu iu = Iu.getInstance();

		iu.setName("IU");
		iu.setAge(30);

		String name = iu.getName();

		System.out.println(name);
		System.out.println(iu.getAge());
		System.out.println(iu);
		System.out.println("================");

		Iu iu2 = Iu.getInstance();
		System.out.println(iu2.getName());
		System.out.println(iu2.getAge());
		System.out.println(iu2);
	}
}
