package co.edu.eafit.carritocompras.service;

import java.math.BigDecimal;

public class PointsCalculator {
	public int calculatePoints(BigDecimal totalPrice){
		int points=totalPrice.intValue()/1000;
		return points;
	}
}
