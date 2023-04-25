package com.tpv.struts;



import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private LoginBean loginBean;
	
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
		
	}


	public LoginBean getLoginBean() {
		return loginBean;
	}


	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}


	

	
	
}
