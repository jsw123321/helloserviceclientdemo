package com.amarsoft.hello;

public class App {
    public static void main(String[] args) {
    	//WSDL:<service name="HelloServiceService">
		HelloServiceService hss=new HelloServiceService();
		HelloService hs = hss.getHelloServicePort();
		String hello = hs.sayHello("С��");
		System.out.println(hello);
		System.out.println("���ʽ���....");
	}
}
