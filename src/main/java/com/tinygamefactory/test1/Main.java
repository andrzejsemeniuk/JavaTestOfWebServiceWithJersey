package com.tinygamefactory.test1;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Main {

    @GET
    @Path("{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String responseForHelloName(@PathParam("name") String name) 
    {
        StringBuilder s = new StringBuilder("Test1 | Hello ");
        s.append(name).append("!");
        return s.toString();
    }

}
