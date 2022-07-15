package com.naver.terran;

import com.naver.unit.Unit;

public class Marine extends Unit
{
	private String weapon;

	public Marine()
	{
		super(30);
	}

	public String getWeapon()
	{
		return weapon;
	}

	public void setWeapon(String weapon)
	{
		this.weapon = weapon;
	}

	// 오버 라이딩
	public void info()
	{
		System.out.println("Marine Info");
	}

	public void shot()
	{
		System.out.println("탕탕");
	}

	// over riding
	public void move()
	{
		super.info();
		System.out.println("뛰어다님");
	}
}
