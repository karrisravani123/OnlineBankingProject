package seleniumproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperties {
@Test
public void readprop() throws IOException {
	FileInputStream fis=new FileInputStream(new File("./TestData/ev.properties"));
	//properties Option
	Properties p=new Properties();
	p.load(fis);
	//AdminURL
	System.out.println(p.getProperty("AdminURL"));
	System.out.println(p.getProperty("UserURL"));
//logout
}
}
