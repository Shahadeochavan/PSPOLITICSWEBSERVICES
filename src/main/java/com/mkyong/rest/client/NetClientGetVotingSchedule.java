package com.mkyong.rest.client;

public class NetClientGetVotingSchedule {
	private static  String url="http://192.168.2.102:8080/PSPolitics/json/votingschedule/get";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetClientGet netClientGetRally=new NetClientGet();
		netClientGetRally.netCilentGet(url);

	}

}
