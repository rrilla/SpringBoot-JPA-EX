package com.cos.javaUrl;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ThreadTest {
	public static String 다운로드() {
		StringBuilder data = new StringBuilder();
		try {
			URL u = new URL("http://localhost:8000/person/1");
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String input = "";
			while((input = br.readLine()) != null) {
				data.append(input);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return data.toString();
	}
	
	static class download implements Runnable{

		@Override
		public void run() {
			String user = 다운로드();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("그림1");
		Thread.sleep(500);
		
		System.out.println("그림2");
		Thread.sleep(500);
		
		Thread t1 = new Thread(new download());
		t1.start();
		
		System.out.println("그림4");
		Thread.sleep(500);
	}
}
