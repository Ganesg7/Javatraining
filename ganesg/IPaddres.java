package com.ganesg;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPaddres {

	public static void main(String [] args) throws UnknownHostException {
		System.out.println(InetAddress.getLocalHost());
		
		Runtime rs= Runtime.getRuntime();
		
		try {
			rs.exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
