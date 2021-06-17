package com.mx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author smart哥
 * <p>
 * 码炫课堂java技术交流q群：963060292
 */

public class Test {
	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());

	}
}