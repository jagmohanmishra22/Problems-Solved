package com.jags;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception 
	{
		from("file:C:/inbox").split().tokenize("\n").to("jms:topic:jagsMQ");
	}

}
