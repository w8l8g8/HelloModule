package com.xajiusuo.test;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class Dog
 *
 */
@WebListener
public class Dog implements HttpSessionBindingListener {

	private String breed;
	public String getBreed() {
		return breed;
	}
	public Dog(String breed) {
		super();
		this.breed = breed;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    }
	
}
