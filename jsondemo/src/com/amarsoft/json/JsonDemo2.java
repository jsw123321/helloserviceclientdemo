package com.amarsoft.json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonDemo2 {
    public static void main(String[] args) {
    
		System.out.println("//2json�����Ǽ�������-------------------------------------------------//");
		//json�����Ǽ�������
		JSONObject container1=new JSONObject();
		JSONArray className=new JSONArray();
		className.add("����һ��");
		container1.put("className", className);
		System.out.println(container1.toString());
		
		 JSONArray className1 = container1.getJSONArray("className");
	        System.out.println("className data is: " + className1);
		
    }
}
