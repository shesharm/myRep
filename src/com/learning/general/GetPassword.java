package com.learning.general;

import org.apache.commons.codec.binary.Base64;
import org.testng.annotations.Test;

public class GetPassword {

	public static void main(String args[]){
		GeneratePwd("Shekhar");
	}

	public static String GeneratePwd(String strpwd){
		
		byte[] pwd = Base64.encodeBase64(strpwd.getBytes());

		//System.out.println(new String(pwd));
		byte[] decode  = Base64.decodeBase64(new String(pwd));
		//System.out.println(new String(decode));

		return new String(pwd);
		
		
	}
}
