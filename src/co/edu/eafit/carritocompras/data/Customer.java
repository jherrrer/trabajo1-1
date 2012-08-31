package co.edu.eafit.carritocompras.data;

import java.util.List;

public class Customer {

	private String code;
	private String name;
	private List<Purchase> purchases;
	private int points;

	public Customer(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void addPoints(int points){
		this.points=this.points+points;
	}
	public int getPoints(){
		return points;
	}
	public List<Purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<Purchase> purchases) {
		this.purchases = purchases;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
