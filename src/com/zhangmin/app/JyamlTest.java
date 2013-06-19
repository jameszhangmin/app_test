package com.zhangmin.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ho.yaml.Yaml;

public class JyamlTest {

	public static void main(String[] args) {
		String s = null;
		String result = "";
		try {
			File f = new File("/Users/zhangmin/temp/upload/apktool.yml");
			BufferedReader br = new BufferedReader(new FileReader(
					"/Users/zhangmin/temp/upload/apktool.yml"));

			while ((s = br.readLine()) != null) {
				System.out.println("s = " + s);
				if(s.indexOf("sdkInfo")>=0){
					s = br.readLine();
					if(s.indexOf("minSdkVersion")>=0){
						System.out.println("check this line:" + s);
						System.out.println("begin:" + s.indexOf("'"));
						System.out.println("end:" + s.lastIndexOf("'"));
						System.out.println("get version:" + s.substring(s.indexOf("'")+1, s.lastIndexOf("'")));
					}
				}
			}
			System.out.println("result=\n" + result);
//			Object o = (Object) Yaml.load(result);
//			System.out.println("This should print loyal: " + o);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		

		// String s =
		// "---\n  a: cat\n  dog:\n    - loyal\n    - friendly\n    - furry\n";
		// System.out.println(s);
		// Map a = (Map)Yaml.load(s);
		// System.out.println("This should print loyal: " +
		// ((List)a.get("dog")).get(0));
		//
		// String s2 = Yaml.dump(a);
		// System.out.println("Here is the object encoded back to a YAML string:");
		// System.out.println(s2);
		
		
		
		

		// //First load a YAML string into an object
		// String dog =
		// "---\n  animal: dog\n  qualities:\n    - loyal\n    - friendly\n    - furry\n";
		// Object test = Yaml.load(dog);
		// System.out.println("Dog: " + test);
		//
		// //Now spit the object back out as a YAML string
		// System.out.println("");
		// System.out.println(Yaml.dump(test, true));
		//
		// //We can also load YAML from a file
		// try {
		// File f = new File("/Users/zhangmin/temp/upload/apktool.yml");
		// Object mydata = Yaml.load(f);
		// System.out.println(mydata);
		// }
		// catch (FileNotFoundException e) {
		// System.out.println("Not found!");
		// }

	}
}
