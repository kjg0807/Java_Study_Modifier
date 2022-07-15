package com.naver.terran;

import com.naver.unit.Unit;

public abstract class Marine extends Unit
{
	private String weapon;

	public Marine()
	{
		System.out.println("Marine 생성자");
	}

	// over riding
	public void Move()
	{
		super.info();
		System.out.println("뛰어다님");
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
}
