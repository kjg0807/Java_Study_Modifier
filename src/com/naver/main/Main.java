package com.naver.main;

import com.naver.Himart.Client;
import com.naver.Himart.Computer;
import com.naver.Himart.Phone;
import com.naver.Himart.TV;

public class Main
{
	public static void main(String[] args)
	{
		Computer com = new Computer();
		Phone ph = new Phone();
		TV tv = new TV();

		com.info();
		ph.info();
		tv.info();

		Client client = new Client();

		client.buy(tv);
	}
}
