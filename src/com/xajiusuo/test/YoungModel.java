package com.xajiusuo.test;

public class YoungModel {
	
	public String young(String age){
		int ageNum = Integer.parseInt(age);
		String result;
		result = (ageNum<26)?"you are young":"you are old";
		
		return result;
	}
	
	

}
