package com.naver.Himart;

public class Client extends Product // 구매자
{
	private int money;
	private int point;

	public Client()
	{
		this.money = 3000000;
		this.point = 10;
	}

	public void buy(TV tv) // 물건 값 계산
	{
		this.money = this.money - tv.getPrice();
		this.point = this.point + tv.getPoint();
		System.out.println("");
		System.out.println("잔액: " + this.money);
		System.out.println("Point: " + this.point);
	}

	public int getMoney()
	{
		return money;
	}

	public void setMoney(int money)
	{
		this.money = money;
	}

	public int getPoint()
	{
		return point;
	}

	public void setPoint(int point)
	{
		this.point = point;
	}
}
