package com.zhangmin.app;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public void removeTest(){
		List<Integer> dataList = new ArrayList<Integer>();
		dataList.add(1);
		dataList.add(2);
		dataList.add(3);
		//do remove throws Exception
//		for (Integer content : dataList) {
//			if(content.equals(1)){
//				dataList.remove(content);
//			}
//		}
		//do remove will not throws Exception
		for (int i = 0; i < dataList.size(); i++) {
			if(dataList.get(i).equals(1)){
				dataList.remove(i);
			}
		}
		
		System.out.println(dataList);
	}
	
	public static void main(String[] args) {
		ListTest test = new ListTest();
		test.removeTest();
	}

}
