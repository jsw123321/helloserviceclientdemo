package com.amarsoft.json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonDemo5 {
    public static void main(String[] args) {
    	JSONObject container1=new JSONObject();
		System.out.println("//5json对象嵌套(json数组嵌套(json对象))-------------------------------------------------//");
		// json对象嵌套(json数组嵌套(json对象))
		JSONArray students=new JSONArray();
		JSONObject studentOne=new JSONObject();
		studentOne.put("name", "张麻子");
		studentOne.put("sex", "男");
		studentOne.put("age", 23);
		studentOne.put("hobby", "java developer");
		JSONObject studentTwo=new JSONObject();
		studentTwo.put("name", "潘金莲");
		studentTwo.put("sex", "女");
		studentTwo.put("age", 26);
		studentTwo.put("hobby", "c/c++ developer");
		students.add(studentOne);
		students.add(studentTwo);
		container1.put("students", students);
		System.out.println(container1.toString());
		
		JSONArray students1 = container1.getJSONArray("students");
        System.out.println("students data is： " + students1);
		
    }
}
