package com.amarsoft.json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonDemo5 {
    public static void main(String[] args) {
    	JSONObject container1=new JSONObject();
		System.out.println("//5json����Ƕ��(json����Ƕ��(json����))-------------------------------------------------//");
		// json����Ƕ��(json����Ƕ��(json����))
		JSONArray students=new JSONArray();
		JSONObject studentOne=new JSONObject();
		studentOne.put("name", "������");
		studentOne.put("sex", "��");
		studentOne.put("age", 23);
		studentOne.put("hobby", "java developer");
		JSONObject studentTwo=new JSONObject();
		studentTwo.put("name", "�˽���");
		studentTwo.put("sex", "Ů");
		studentTwo.put("age", 26);
		studentTwo.put("hobby", "c/c++ developer");
		students.add(studentOne);
		students.add(studentTwo);
		container1.put("students", students);
		System.out.println(container1.toString());
		
		JSONArray students1 = container1.getJSONArray("students");
        System.out.println("students data is�� " + students1);
		
    }
}
