package com.tpv.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	private String hello;
	
	
	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 7916772634564595947L;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		hello ="Chào mừng bạn đến struts framework!";
		return SUCCESS;
	}
	
	
}
