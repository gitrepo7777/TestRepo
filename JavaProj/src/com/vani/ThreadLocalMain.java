package com.vani;

public class ThreadLocalMain {

	private static long serialNum = 0L;
	public static ThreadLocal<Long> tl = new ThreadLocal<Long>(){

		@Override
		public Long get() {
			// TODO Auto-generated method stub
			return serialNum++;
		}

		
		
	};
	
	public static ThreadLocal<Long> t2 = new ThreadLocal<Long>(){

		@Override
		protected Long initialValue() {
			// TODO Auto-generated method stub
			return serialNum++;
		}



		
		
	};
	
	public static void main(String[] args)
	{
		ThreadLocalMain tm = new ThreadLocalMain();
		tm.callThread();
		System.out.println("thread local " + t2.get());
		
	}
	
	private void callThread()
	{
	
		T1 t1 = new T1();
		t1.start();
		
		T1 t2 = new T1();
		t2.start();
	}
	class T1 extends Thread
	{
		
		public void run()
		{
			System.out.println(tl.get());
		}
	}
	
}
