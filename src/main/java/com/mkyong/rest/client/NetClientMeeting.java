package com.mkyong.rest.client;

public class NetClientMeeting {
	private static  String url="http://192.168.2.103:8080/PSPolitics/json/meeting/get";
	private static  String urlmr="http://192.168.2.103:8080/PSPolitics/json/meeting/mr/get";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetClientGet netClientGetRally=new NetClientGet();
		netClientGetRally.netCilentGet(url);
		netClientGetRally.netCilentGet(urlmr);

	}

}
