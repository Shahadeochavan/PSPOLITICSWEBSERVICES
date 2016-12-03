package com.mkyong.rest.client;

public class NetClientGetAboutNitin {
	private static  String url="http://192.168.0.100:8080/PSPolitics/json/aboutnitin/get";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetClientGet netClientGetRally=new NetClientGet();
		netClientGetRally.netCilentGet(url);

	}

}
