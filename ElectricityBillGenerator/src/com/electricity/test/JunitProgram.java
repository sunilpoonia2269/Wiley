package com.electricity.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.electricity.Customer;
import com.electricity.CustomerUtility;

public class JunitProgram {
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void calculateBillTest() {
		
		CustomerUtility customerUtility = new CustomerUtility();
		assertEquals("Error in calculate bill method", 0.5, customerUtility.calculateTotalBill(1), 0.5);
		assertEquals("Error in calculate bill method", 50.75, customerUtility.calculateTotalBill(101), 0.5);
		assertEquals("Error in calculate bill method", 88.50, customerUtility.calculateTotalBill(151), 1);
		
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer(101, "Mohit", 105, "302012"));
		list.add(new Customer(102, "Moni", 91, "302012"));
		list.add(new Customer(103, "Manan", 1050, "302012"));
		list.add(new Customer(104, "Mister", 123, "302012"));
		list.add(new Customer(105, "Moht", 184, "302012"));
		list.add(new Customer(106, "Mohit1", 100, "302012"));
		
		
		
	}
	

	
	
	
	
	
//	@Test
//	public void calculateBillAbove100AndBelow150Test() {
//		
//		CustomerUtility customerUtility = new CustomerUtility();
//		assertEquals("Error in calculate bill method", 50.75, customerUtility.calculateTotalBill(101), 0.5);
//		assertEquals("Error in calculate bill method", 88.50, customerUtility.calculateTotalBill(151), 1);
//		
//	}
//	

}
