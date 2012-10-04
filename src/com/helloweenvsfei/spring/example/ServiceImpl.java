package com.helloweenvsfei.spring.example;

public class ServiceImpl implements IService {
	private IDao dao;

	@Override
	public void service(String name) {
		System.out.println(dao.sayHello(name));
	}
	
	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}
}
