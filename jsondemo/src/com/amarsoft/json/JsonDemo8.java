package com.amarsoft.json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonDemo8 {
    public static void main(String[] args) {
    	JSONObject container1=new JSONObject();
		System.out.println("//8json����Ƕ��(json����Ƕ��(json����))-------------------------------------------------//");
		//json����Ƕ��(json����Ƕ��(json����Ƕ��))
		JSONArray teachers= new JSONArray();
		JSONObject teacherOne=new JSONObject();
		teacherOne.put("name", "С��");
		teacherOne.put("introduction", "С����������ʦ");
		JSONObject teacherTwo=new JSONObject();
		teacherTwo.put("name", "С÷");
		teacherTwo.put("introduction", "С÷����ѧ��ʦ");
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
