package co.edu.eafit.carritocompras.service;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import co.edu.eafit.carritocompras.data.Customer;
import co.edu.eafit.carritocompras.data.Product;
import co.edu.eafit.carritocompras.data.Purchase;


public class BillingCalculatorTest {


	
	@Test
	public void testCalculateTotalPurchase() {
		 Customer customer = Mockito.mock(Customer.class);
		Map<String, BigDecimal> mp= Product.getProductPricesBD();
		Mockito.when(customer.getPoints()).thenReturn(1000);
		Purchase p = BillingCalculator.calculateTotalPurchase(customer, "EL-001,FU-007");
		
		
		assertEquals("total",mp.get("EL-001").subtract(mp.get("EL-001").multiply(new BigDecimal(0.05))).add(mp.get("FU-007").subtract(mp.get("FU-007").multiply(new BigDecimal(0.1)))).subtract((mp.get("EL-001").subtract(mp.get("EL-001").multiply(new BigDecimal(0.05))).add(mp.get("FU-007").subtract(mp.get("FU-007").multiply(new BigDecimal(0.1))))).multiply(new BigDecimal(0.02))),p.getTotalPrice());
	}

}