package com.ssafy.mini.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
	
	public String getEncrypt(String password) {
		
		String result = "";
		
		try {
			
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			
			md.update(password.getBytes());
			byte[] pwd = md.digest();
			
			StringBuffer sb = new StringBuffer();
			for(byte b : pwd) {
				sb.append(String.format("%02x", b));
			}
			
			result = sb.toString();
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}

}
