package com.amarsoft.json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonDemo3 {
    public static void main(String[] args) {
    	JSONObject container1=new JSONObject();
		System.out.println("//3json对象中嵌套json对象-------------------------------------------------//");
		//json对象中嵌套json对象
		JSONObject classInfo=new JSONObject();
		classInfo.put("stuCount", 50);
		classInfo.put("leader", "jiangshanwen");
		container1.put("classInfo", classInfo);
		System.out.println(container1.toString());
		JSONObject classInfo1 = container1.getJSONObject("classInfo");
        System.out.println("classInfo data is: " + classInfo1);
    }
}
