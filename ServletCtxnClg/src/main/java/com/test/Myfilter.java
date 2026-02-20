package com.test;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;


@WebFilter("/SessionExp")
public class Myfilter extends HttpFilter {
       
    
    public Myfilter() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
		
		System.out.println("destroy()");
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("BEFORE SERVLET PRE FILTER");
		chain.doFilter(request, response);
		System.out.println("AFTER SERVLET POST FILTER");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init()");
	}

}
