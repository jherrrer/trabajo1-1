package co.edu.eafit.carritocompras.service;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;


import co.edu.eafit.carritocompras.data.Customer;
import co.edu.eafit.carritocompras.data.Purchase;

public class IvaCalculatorTest {
	private Customer customer;
	@Before
	public void setUp() {
		customer = new Customer("xx1", "xxName");
	}
	
	@Test
	public void testCalculateIva() {
		IvaCalculator iva = new IvaCalculator();
		Purchase p = BillingCalculator.calculateTotalPurchase(customer, "EL-001,FU-007");
	    BigDecimal totalLessIva=p.getTotalPrice();
		p.setTotalPriceWithIva(iva);
		assertEquals("total",totalLessIva.add(totalLessIva.multiply(new BigDecimal(0.16))),p.getTotalPrice());
	 
	}

}
