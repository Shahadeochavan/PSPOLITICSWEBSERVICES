package com.mkyong.rest.client;

public class NetClientGetAboutNitin {
	private static  String url="http://192.168.2.103:8080/PSPolitics/json/aboutnitin/get";
	private static  String urlmr="http://192.168.2.103:8080/PSPolitics/json/aboutnitin/mr/get";
	private static  String urlhn="http://192.168.2.103:8080/PSPolitics/json/aboutnitin/hn/get";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetClientGet netClientGetRally=new NetClientGet();
		netClientGetRally.netCilentGet(url);
		netClientGetRally.netCilentGet(urlmr);
		netClientGetRally.netCilentGet(urlhn);
	}

}
