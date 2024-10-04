package TestNg_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_general {
@BeforeSuite
public void bsuite() {
	System.out.println("Hi Before suite");
}
@AfterSuite
public void asuite() {
	System.out.println("Hi After test");
}
@BeforeTest
public void btest() {
	System.out.println("Hi Before test");
}
@AfterTest
public void atest() {
	System.out.println("Bye After test");
}
@BeforeClass
public void bClass() {
	System.out.println("Hi Before Class");
}
@AfterClass
public void aClass() {
	System.out.println("Bye After class");
}
@BeforeMethod
public void bMethod() {
	System.out.println("Hi Before method");
}
@AfterMethod
public void aMethod() {
	System.out.println("Bye After method");
}
@Test
public void mainMethod() {
	System.out.println("Hi main method");
}
}
