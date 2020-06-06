package com.osa.junit.testing;

import org.junit.BeforeClass;
//import org.junit.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuintTesting {
@Test
public void test1() {
System.out.println("I am test 1");

}
@Test
public void test2() {
	
	
	System.out.println("I am test 2");
}
@BeforeEach
public void test3() {
	System.out.println("I am from test3");
	
}
@AfterEach
public void test4() {
	
	System.out.println("I am from test 4");
}
@BeforeAll
public static void test5 () {
	System.out.println("I am test 5");
	
}

}
