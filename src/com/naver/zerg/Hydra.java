package com.naver.zerg;

import com.naver.unit.Unit;

public abstract class Hydra extends Unit
{
	// hp, color, name, 움직이고, 공격

	// over riding
	public void move()
	{
		System.out.println("기어다님");
	}

	public void shot()
	{
		System.out.println("퉤퉤");
	}
}
