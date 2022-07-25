package com.algaworks.algafood.core.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//@Component
public class ApiRetirementHandler extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if(request.getRequestURI().startsWith("/v1/")) {
			response.setStatus(HttpStatus.GONE.value());
			return false;
//			response.addHeader("X-AlgaFood-Deprecated", 
//					"Essa versão da API está depreciada e deixará de existir a partir de 01/01/2024. "
//					+ "Use a versão mais atual da API.");
		}
		
		return true;
	}
	
}
