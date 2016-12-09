package com.mkyong.rest.client;

public class NetClientGetGallery {
	private static  String url="http://192.168.0.100:8080/PSPolitics/json/gallery/get";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetClientGet netClientGetRally=new NetClientGet();
		netClientGetRally.netCilentGet(url);

	}

}
