package com.naver.Himart;

public class Computer extends Product
{
	// computer - cpu, (브랜드, 가격, point) - extends
	// 메서드: info -> 모든 정보 출력

	private String Cpu;

	public Computer()
	{		
		this.Cpu = "i5";
		this.setBrand("삼성");
		this.setPoint(100);
		this.setPrice(2000000);
	}

	public void info()
	{
		System.out.println("---컴퓨터 정보---");
		super.info(); // 부모의 info		
		System.out.println(this.Cpu);
	}

	public String getCpu()
	{
		return Cpu;
	}

	public void setCpu(String cpu)
	{
		Cpu = cpu;
	}
}
