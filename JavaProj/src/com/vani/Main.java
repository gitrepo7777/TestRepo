package com.vani;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("I am in Main..");
		Thread t1 = new Thread(new Task());
		Thread t2 = new Thread(new Task());
		
		t1.start();
		t2.start();
	
	}

}

// ("{call foo(?)}")
//("begin proc(?,?); end;")
//("begin ? := func(?, ?); end;	")

//create or replace function foo(val1 char) { return char as begin char || "vani"; end;}
//

//remote debugging with java
//java -Xdebug -Xrunjdwp:transport=dt_socket, address=8001, server = y suspend=y -jar xyz.jar
//-Xml, -Xmx, -Xss, -verbose:gc -XX:+PrintGCDetails, -XX:+UseParallelGC -XX:-UseConcMarkSweepGC -XX:-UseSerialGC
//-Xprof, -Xrunhprof
//-XX:PermSize -XXMaxPermSize -XX:NewRatio=2 -XX:+TraceClassLoading 
//-XX:HeapDumpPath= ./java_pid_hprof 
//-XX:-PrintConcurrentLocks
//-XX:-PrintCommandLineFlags
