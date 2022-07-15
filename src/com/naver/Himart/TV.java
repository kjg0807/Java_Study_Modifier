package com.naver.Himart;

public class TV extends Product
{
	// TV - 사이즈, 브랜드, 가격, point
	// 메서드: info -> 모든 정보 출력

	private String size;

	public TV()
	{		
		this.size = "100인치";
		this.setBrand("LG");
		this.setPrice(1500000);
		this.setPoint(80);
	}

	public void info()
	{
		System.out.println("---TV정보---");
		super.info();
		System.out.println(this.size);
	}
}
