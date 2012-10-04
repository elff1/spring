package com.helloweenvsfei.spring.example;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		IService hello = (IService) factory.getBean("service");
		
		hello.service("elf");
		factory.destroySingletons();
	}

}
