package entities;

import entities.enums.Color;

public class Rectangle_sec14 extends Shape{
	
	private Double width;
	private Double height;
	
	public Rectangle_sec14() {
		super();
	}

	public Rectangle_sec14(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getwidth() {
		return width;
	}

	public void setwidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public Double area() {
		return height * width;
	}
	
	

}
