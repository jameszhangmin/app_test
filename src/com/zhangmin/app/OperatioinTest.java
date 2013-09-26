package com.zhangmin.app;

public class OperatioinTest {
	public static void main(String[] args) {
		Long configFlags = 391L;//110000111
		long res = configFlags & 512l;
		System.out.println("after b2:" + res);
	}

}
