package com.mkyong.rest.client;

public class NetClientGetParty {
	private static  String url="http://192.168.2.103:8080/PSPolitics/json/party/get";
	private static  String urlmr="http://192.168.2.103:8080/PSPolitics/json/party/mr/get";
	private static  String urlhn="http://192.168.2.103:8080/PSPolitics/json/party/mr/get";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetClientGet netClientGetRally=new NetClientGet();
		netClientGetRally.netCilentGet(url);
		netClientGetRally.netCilentGet(urlmr);
		netClientGetRally.netCilentGet(urlhn);

	}

}
