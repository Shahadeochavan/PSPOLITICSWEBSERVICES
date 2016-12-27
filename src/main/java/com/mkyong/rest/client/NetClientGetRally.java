package com.mkyong.rest.client;

public class NetClientGetRally {
	private static  String url="http://192.168.2.103:8080/PSPolitics/json/rally/get";
	public static void main(String[] args){
		NetClientGet netClientGetRally=new NetClientGet();
		netClientGetRally.netCilentGet(url);
	}

}
