package com.acme;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        from("stream:in?promptMessage=Enter something: ")
            .transform().simple("${body.toUpperCase()}")
            .to("stream:out");
    }
}
