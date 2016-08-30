package com.n2demos.pattonlabs.ShapeImpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ShapeService service = context.getBean(ShapeService.class);
		System.out.println("Area of Square");
		System.out.println(service.AreaOfSquare(5));
		System.out.println("Area of Triangle");
		System.out.println(service.AreaOfTriangle(10, 15));
		System.out.println("Area of Rectangle");
		System.out.println(service.AreaOfRectangle(10, 10));
		context.close();

	}

}
