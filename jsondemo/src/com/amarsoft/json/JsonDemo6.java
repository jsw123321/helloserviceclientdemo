package com.amarsoft.json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonDemo6 {
    public static void main(String[] args) {
    	JSONObject container1=new JSONObject();
		System.out.println("//6-------------------------------------------------//");
		//json����Ƕ��(json����Ƕ��(json����Ƕ��(json����)))
		JSONArray Students = new JSONArray();
		JSONObject StudentOne=new JSONObject();
		JSONArray name1 = new JSONArray();
		name1.add("����");
		JSONArray sex1 = new JSONArray();
		sex1.add("��");
		JSONArray age1 = new JSONArray();
		age1.add(23);
		JSONArray hobby1 = new JSONArray();
		hobby1.add("java developer");
		StudentOne.put("name", name1);
		StudentOne.put("sex", sex1);
		StudentOne.put("age", age1);
		StudentOne.put("hobby", hobby1);
		
		JSONObject StudentTwo=new JSONObject();
		JSONArray name2 = new JSONArray();
		name2.add("����");
		JSONArray sex2 = new JSONArray();
		sex2.add("��");
		JSONArray age2 = new JSONArray();
		age2.add(28);
		JSONArray hobby2 = new JSONArray();
		hobby2.add("c++ developer");
		StudentTwo.put("name", name2);
		StudentTwo.put("sex", sex2);
		StudentTwo.put("age", age2);
		StudentTwo.put("hobby", hobby2);
		
		Students.add(StudentOne);
		Students.add(StudentTwo);
		container1.put("Students", Students);
		System.out.println(container1.toString());
		JSONArray Students1 = container1.getJSONArray("Students");
        System.out.println("Students data is: " + Students1);
    }
}
