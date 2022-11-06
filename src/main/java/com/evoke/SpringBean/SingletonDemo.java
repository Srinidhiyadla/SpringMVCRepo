package com.evoke.SpringBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonDemo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(ConfigBean.class);
		/*
		 * con.register(ConfigBean.class); con.refresh();
		 */

		BeanClass bc = con.getBean("beanClass",BeanClass.class);
		 System.out.println(bc.hashCode());

			/*
			 * BeanClass bc1 = con.getBean(BeanClass.class);
			 * System.out.println(bc1.hashCode());
			 */
		con.close();
	}
}
