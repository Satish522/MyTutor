package com.swapna.mytutor.view;

import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.view.InternalResourceView;


public class JstlViewResolver extends InternalResourceView  {
	
	public static final Logger logger=LoggerFactory.getLogger(JstlViewResolver.class);
	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//dispatchPath obtained from prepareForRendering 
		String dispatcherPath = prepareForRendering(request, response);
		
		
		String page=dispatcherPath.substring(dispatcherPath.lastIndexOf("/") + 1);
		System.out.println(dispatcherPath+"    "+dispatcherPath.substring(dispatcherPath.lastIndexOf("/") + 1));
		// set original view being asked for as a request parameter
		request.setAttribute("content", dispatcherPath.substring(dispatcherPath.lastIndexOf("/") + 1));
		 
		// force everything to be template.jsp
		RequestDispatcher requestDispatcher =null;
		
		if(page.equals("login.jsp") || page.equals("lockscreen.jsp") || page.equals("register.jsp") || page.equals("forgotpassword.jsp")) {
			logger.info("Home Page including "+page+" page");
			
			requestDispatcher=request.getRequestDispatcher("/WEB-INF/views/home.jsp");
			
		}else {
			requestDispatcher=request.getRequestDispatcher("/WEB-INF/views/main.jsp");
		}
				
		//super.renderMergedOutputModel(model, request, response);
		super.exposeModelAsRequestAttributes(model, request); //Forwarding request and model from controller to requested controller
		requestDispatcher.include(request, response);
	}

	
	
}
