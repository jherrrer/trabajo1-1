package co.edu.eafit.carritocompras.service;

import java.math.BigDecimal;

public class IvaCalculator {
	
	public BigDecimal CalculateIva(BigDecimal totalprice){
		
		return totalprice.multiply(new BigDecimal(0.16));
	}

}
