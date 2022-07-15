package com.naver.terran;

import com.naver.unit.SkyUnit;

public abstract class Wraith extends SkyUnit
{
	//비행기
	public void Move()
	{
		System.out.println("날아다니기");
	}

	public void shot()
	{
		System.out.println("퉤퉤");
	}
}
