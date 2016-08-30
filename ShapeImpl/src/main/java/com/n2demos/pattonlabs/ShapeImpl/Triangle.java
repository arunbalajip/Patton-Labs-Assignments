package com.n2demos.pattonlabs.ShapeImpl;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape{

	public int area(int a, int b) {
		return (a*b)/2;
	}

}
