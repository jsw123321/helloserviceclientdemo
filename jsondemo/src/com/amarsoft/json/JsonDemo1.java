package com.amarsoft.json;

import net.sf.json.JSONObject;

public class JsonDemo1 {
    public static void main(String[] args) {
    	System.out.println("//1json对象是key-value类型-------------------------------------------------//");
		//json对象是key-value类型
    	JSONObject container1=new JSONObject();
		container1.put("ClassName", "高三一班");
		System.out.println(container1.toString());
		
		String ClassName1 = (String) container1.get("ClassName");
        System.out.println("ClassName data is: " + ClassName1);
    }
}
