package com.naver.Himart;

public class Phone extends Product
{
	// 전화기 - 제조회사, 브랜드, 가격, point
	// 메서드: info -> 모든 정보 출력

	public String makeCompany;

	public Phone()
	{		
		this.makeCompany = "삼성";
		this.setBrand("Z플립");
		this.setPrice(100000);
		this.setPoint(10);
	}

	public void info()
	{
		System.out.println("---휴대폰 정보---");
		super.info();
		System.out.println(this.makeCompany);
	}
}
