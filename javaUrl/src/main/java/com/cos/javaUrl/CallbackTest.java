package com.cos.javaUrl;


interface MyCallback {
	void callback(int money);
}

class MoneyChange {
	int money = 10000;
	
	public void send(MyCallback myCallback) {
		
		// 새로운 스레드 실행
		new Thread(new Runnable() {	
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
					money = money + 20000;
					myCallback.callback(money);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}).start();
	}
}

public class CallbackTest{
	public static void main(String[] args) {
		System.out.println("그림1");
		System.out.println("그림2");
		MoneyChange m = new MoneyChange();
		m.send(new MyCallback() {
			
			@Override
			public void callback(int money) {
				System.out.println(money);
				System.out.println("그림 4 : "+money);
			}
		});
		System.out.println("그림3");
	}
}
