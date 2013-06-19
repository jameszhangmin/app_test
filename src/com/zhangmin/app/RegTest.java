package com.zhangmin.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {
	public static final String press = "([^\\s]+(\\.(?i)(jpg|jpeg|png|gif|bmp|doc|docx|pdf|xls|xlsx|txt|zip|rar))$)";
	public static final String routes = "/v/app/top/$appId<[^/]+>/hhh";

	public static boolean validateSuffix(String fileName){
		boolean f = false;
		String src="/tmp/123.pdf";
		Pattern regex = Pattern.compile(press);
		Matcher matcher = regex.matcher(src);
		f = matcher.matches();
		System.out.println("validateSuffix:" + fileName + " result:" + f);
		return f;
	}
	
	public static String findMatched(String path){
		String output = "";
		String pattenStr = routes.substring(routes.indexOf("$appId<")+1);
		Pattern pattern = Pattern.compile(routes);
		Matcher matcher = pattern.matcher(path);
		if (matcher.find()) {
			output = matcher.group(1);
			System.out.println("got one:" + output);
		}else{
			System.out.println("no matched!");
		}
		return output;
	}
	
	public static void main(String[] args) {
		
		String path = "/v/app/top/12000001/hhh";
		findMatched(path);
	}
}
