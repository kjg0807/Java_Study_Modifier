package com.naver.terran;

import com.naver.unit.Unit;

public class Scv extends Unit
{
	public Scv()
	{
		super(15);
		// TODO Auto-generated constructor stub
	}

	// over riding
	public void move()
	{
		System.out.println("부스터로 다님");
	}

	public void attack()
	{
		System.out.println("공격");
	}

	public void mineral()
	{
		System.out.println("미네랄캐기");
	}
}
