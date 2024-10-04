package utilities;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropertyFile {

public static void main(String[] args) throws Throwable {
		
	FileReader fr = new FileReader("D:\\Qspider\\BigBasket_E-commerce_Web\\src\\test\\resources\\configfiles\\config.properties");
	
	Properties p = new Properties();
	p.load(fr);
	}
}
