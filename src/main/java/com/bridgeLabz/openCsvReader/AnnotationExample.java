package com.bridgeLabz.openCsvReader;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


public class AnnotationExample {
	
	@Override
	@MethodInfo(author = "Ajay", comments = "Main method", date = "Sept 20 2021", revision = 1)
	public String toString() {
		return "Overridden toString method";
	}
	
	@Deprecated
	@MethodInfo( comments = "depricated method", date = "Sept 20 2021", revision = 1)
	public static void oldMethod() {
		System.out.println("old method, dont use");
	}
	
	public static void main(String args[]) {
		try {
			
			for (Method method: AnnotationExample.class.getMethods()) {
				
				if (method.isAnnotationPresent(MethodInfo.class)) {
					try {
						
						for (Annotation anno: method.getDeclaredAnnotations()) {
							System.out.println("Annotation in method " + method + " : " + anno);
							
						}
						
						MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
						if (methodInfo.revision() == 1) {
							System.out.println("Method with revision no 1 " + method);
						}
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


}
