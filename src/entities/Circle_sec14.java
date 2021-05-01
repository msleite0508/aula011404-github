package entities;

import entities.enums.Color;

public class Circle_sec14  extends Shape{

	private Double radius;
	
	public Circle_sec14() {
		super();
	}
	
	public Circle_sec14(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		return Math.PI * radius * radius;
	}
}
