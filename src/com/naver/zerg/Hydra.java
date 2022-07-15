package com.naver.zerg;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import com.naver.unit.Attacker;
import com.naver.unit.Unit;

public class Hydra extends Unit implements Attacker
{

	public Hydra()
	{
		super(50);
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public void attack()
	{
		
	}
}
