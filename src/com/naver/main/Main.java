package com.naver.main;

import com.naver.terran.Marine;
import com.naver.zerg.Hydra;
import com.naver.unit.Unit;

public class Main
{

	public static void main(String[] args)
	{
		Marine m1 = new Marine();
		// Marine is a Unit

		Unit unit = m1;
		System.out.println(unit.getHp());
		System.out.println(unit.getColor());
		System.out.println(unit.getName());		

		m1 = (Marine) unit;
		
		System.out.println(m1.getWeapon());
	}
}
