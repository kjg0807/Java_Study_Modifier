package com.naver.unit;

public abstract class Unit
// abstract - 추상화한다(완성되지 않은 메서드) - 다른 객체를 생성못하게 설정(무조건 상속하여 사용 - extends (class name))
{
	// 클래스간의 공통 요소
	private int hp;
	private String color;
	private String name;
	private String weapon;

	public Unit(int hp)
	{
		System.out.println("Super 생성자");
		this.hp = hp;
	}

	public abstract void move();

	public void info()
	{
		System.out.println("Super Info");
	}

	public String getWeapon()
	{
		return weapon;
	}

	public void setWeapon(String weapon)
	{
		this.weapon = weapon;
	}

	public int getHp()
	{
		return hp;
	}

	public void setHp(int hp)
	{
		this.hp = hp;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
