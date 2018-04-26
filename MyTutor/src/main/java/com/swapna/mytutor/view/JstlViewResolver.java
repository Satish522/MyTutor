package com.swapna.mytutor.view;

import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.InternalResourceView;


public class JstlViewResolver extends InternalResourceView  {

	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//dispatchPath obtained from prepareForRendering 
		String dispatcherPath = prepareForRendering(request, response);
		
		String page=dispatcherPath.substring(dispatcherPath.lastIndexOf("/") + 1);
		System.out.println(dispatcherPath.substring(dispatcherPath.lastIndexOf("/") + 1));
		// set original view being asked for as a request parameter
		request.setAttribute("content", dispatcherPath.substring(dispatcherPath.lastIndexOf("/") + 1));
		 
		// force everything to be template.jsp
		RequestDispatcher requestDispatcher =null;
		
		if(page.equals("login.jsp") || page.equals("lockscreen.jsp") || page.equals("register.jsp") || page.equals("forgotpassword.jsp")) {
			requestDispatcher=request.getRequestDispatcher("/WEB-INF/views/home.jsp");
		}else {
			requestDispatcher=request.getRequestDispatcher("/WEB-INF/views/main.jsp");
		}
				
		requestDispatcher.include(request, response);
		//super.renderMergedOutputModel(model, request, response);
	}

	
	
}
