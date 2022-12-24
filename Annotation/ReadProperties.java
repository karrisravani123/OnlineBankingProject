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
	
	Properties p=new Properties();
	p.load(fis);
	System.out.println(p.getProperty("AdminURL"));
	System.out.println(p.getProperty("UserURL"));

}
}
