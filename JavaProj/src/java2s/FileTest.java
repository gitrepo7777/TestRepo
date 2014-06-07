package java2s;

import java.io.File;

public class FileTest {

	public static void main(String[] args) throws Exception {
		File f = new File("Gen.java");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		System.out.println("Total Space" + f.getTotalSpace() + "usable space "+ f.getUsableSpace() + "Free space "+f.getFreeSpace()); 
	
		
	}
}
