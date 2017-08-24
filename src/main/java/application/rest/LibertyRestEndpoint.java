package application.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import application.domain.Employee;

@Path("/")
public class LibertyRestEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello from the REST endpoint!";
    }
    
    @GET
    @Path("employee/{empid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("empid") String  empid) {
    	return new Employee("Amrit Raj",empid,"Computer");
    }

}
