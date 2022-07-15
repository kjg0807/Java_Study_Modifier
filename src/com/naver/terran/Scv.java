package com.naver.terran;

import com.naver.unit.Unit;

public abstract class Scv extends Unit
{
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
