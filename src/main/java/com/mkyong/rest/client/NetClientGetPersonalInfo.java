package com.mkyong.rest.client;

public class NetClientGetPersonalInfo {
	private static  String url="http://192.168.2.103:8080/PSPolitics/json/personalinfo/get";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetClientGet netClientGetRally=new NetClientGet();
		netClientGetRally.netCilentGet(url);

	}
}
