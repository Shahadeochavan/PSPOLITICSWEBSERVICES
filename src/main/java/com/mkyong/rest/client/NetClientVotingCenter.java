package com.mkyong.rest.client;

public class NetClientVotingCenter {
	private static  String url="http://192.168.2.103:8080/PSPolitics/json/votingcenter/get";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetClientGet netClientGetRally=new NetClientGet();
		netClientGetRally.netCilentGet(url);
	}

}
