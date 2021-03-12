package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("‪./data/commondata.property");
		  Properties p=new Properties();
		  p.load(fis);
		 String url = p.getProperty("url");
		 System.out.println(url);
		 System.out.println(p.getProperty("username"));
		 System.out.println(p.getProperty("password"));
	}

}
