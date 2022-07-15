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
		Hydra hydra = new Hydra();

		m1.attack();
		hydra.attack();
	}
}
