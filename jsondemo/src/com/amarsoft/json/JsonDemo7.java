package com.amarsoft.json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonDemo7 {
    public static void main(String[] args) {
    	JSONObject container1=new JSONObject();
		System.out.println("//7json����Ƕ��(json����)-------------------------------------------------//");
		//json����Ƕ��(json����)
		JSONArray Teachers= new JSONArray();
		Teachers.add(0, "С��");
		Teachers.add(1, "С÷");
		container1.put("Teachers", Teachers);
		System.out.println(container1.toString());
		
		JSONArray teachers1 = container1.getJSONArray("Teachers");
        for(int i=0; i < teachers1.size(); i++){
            System.out.println("teahcer " + i + " is: "+ teachers1.get(i));
        }
    }
}
