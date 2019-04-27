package com.amarsoft.json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonDemo8 {
    public static void main(String[] args) {
    	JSONObject container1=new JSONObject();
		System.out.println("//8json对象嵌套(json数组嵌套(json对象))-------------------------------------------------//");
		//json对象嵌套(json数组嵌套(json对象嵌套))
		JSONArray teachers= new JSONArray();
		JSONObject teacherOne=new JSONObject();
		teacherOne.put("name", "小美");
		teacherOne.put("introduction", "小美是语文老师");
		JSONObject teacherTwo=new JSONObject();
		teacherTwo.put("name", "小梅");
		teacherTwo.put("introduction", "小梅是数学老师");
		teachers.add(0, teacherOne);
		teachers.add(1, teacherTwo);
		container1.put("teachers",teachers);
		System.out.println(container1.toString());
		
		 JSONArray Teachers1 = container1.getJSONArray("teachers");
	        for(int i=0; i < Teachers1.size(); i++){
	            System.out.println("Teachers " + i + " is: "+ Teachers1.get(i));
	        }
    }
}
