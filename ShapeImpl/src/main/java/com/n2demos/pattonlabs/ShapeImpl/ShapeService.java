package com.n2demos.pattonlabs.ShapeImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeService {
	@Autowired
	@Qualifier("square")
	private IShape square;
	@Autowired
	@Qualifier("triangle")
	private IShape triangle;
	@Autowired
	@Qualifier("rectangle")
	private IShape rectangle;
	
	public int AreaOfRectangle(int length, int breath){
		return rectangle.area(length, breath);	
	}
	public int AreaOfSquare(int side){
		return square.area(side, side);	
	}
	public int AreaOfTriangle(int length, int breath){
		return triangle.area(length, breath);	
	}
}
