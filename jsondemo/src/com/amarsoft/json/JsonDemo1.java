package com.amarsoft.json;

import net.sf.json.JSONObject;

public class JsonDemo1 {
    public static void main(String[] args) {
    	System.out.println("//1json������key-value����-------------------------------------------------//");
		//json������key-value����
    	JSONObject container1=new JSONObject();
		container1.put("ClassName", "����һ��");
		System.out.println(container1.toString());
		
		String ClassName1 = (String) container1.get("ClassName");
        System.out.println("ClassName data is: " + ClassName1);
    }
}
