package com.naver.terran;

import com.naver.unit.SkyUnit;

public abstract class BattleCruiser extends SkyUnit
{
	public void Move()
	{
		System.out.println("움직이기");
	}

	public void shot()
	{
		System.out.println("퉤퉤");
	}
}
