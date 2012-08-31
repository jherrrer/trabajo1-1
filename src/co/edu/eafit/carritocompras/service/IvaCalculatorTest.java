package co.edu.eafit.carritocompras.service;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

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
		IvaCalculator iva = Mockito.mock(IvaCalculator.class);
		Purchase p = BillingCalculator.calculateTotalPurchase(customer, "EL-001,FU-007");
		
		//Mocking external service behavior
		Mockito.when(iva.CalculateIva(p.getTotalPrice())).thenReturn(p.getTotalPrice().multiply(new BigDecimal(0.16)));
		p.setTotalPriceWithIva(iva);
	 
	}

}
