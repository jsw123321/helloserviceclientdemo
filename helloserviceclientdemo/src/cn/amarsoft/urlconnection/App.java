package cn.amarsoft.urlconnection;

import java.net.URL;
import java.net.URLConnection;

public class App {
	public static void main(String[] args) throws Exception {
		URL  url=new URL("http://192.168.1.13/hello");
		URLConnection conn=(URLConnection) url.getContent();
	}
}
