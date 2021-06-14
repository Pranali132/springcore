package com.springcore.lifecycle;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;



public class Pepsi implements InitializingBean,DisposableBean {
	public double price;

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void afterPropertiesSet() throws Exception{
		//init
		System.out.print("taking pepsi:init");
	}
	public void destroy() throws Exception{
		//destroy
		System.out.println("Finished: destroy");
	}

	

}
