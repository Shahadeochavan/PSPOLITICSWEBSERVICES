package com.mkyong.rest.client;

public class NetClientMeeting {
	private static  String url="http://192.168.2.102:8080/PSPolitics/json/meeting/get";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetClientGet netClientGetRally=new NetClientGet();
		netClientGetRally.netCilentGet(url);

	}

}
