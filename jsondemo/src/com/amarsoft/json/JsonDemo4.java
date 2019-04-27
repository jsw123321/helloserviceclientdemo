package com.amarsoft.json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonDemo4 {
    public static void main(String[] args) {
    	JSONObject container1=new JSONObject();
		System.out.println("//4json对象中嵌套(json对象中嵌套(json数组))-------------------------------------------------//");
		//json对象中嵌套(json对象中嵌套(json数组))
		JSONObject ClassInfo =new  JSONObject();
		JSONArray stuCount=new JSONArray();
		stuCount.add(50);
		JSONArray leader=new JSONArray();
		leader.add("jiangshanwen");
		ClassInfo.put("stuCount", stuCount);
		ClassInfo.put("leader", leader);
		container1.put("ClassInfo", ClassInfo);
		System.out.println(container1);
		
		 JSONObject ClassInfo1 = container1.getJSONObject("ClassInfo");
	        System.out.println("ClassInfo data is: " + ClassInfo1);
	        
		
    }
}
