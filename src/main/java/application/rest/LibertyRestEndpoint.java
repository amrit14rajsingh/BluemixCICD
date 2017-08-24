package application.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import application.domain.Employee;

@Path("/")
public class LibertyRestEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello from the REST endpoint!";
    }
    
    @GET
    @Path("/employee/{empid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("empid") String  empid) {
    	return new Employee("Amrit Raj",empid,"Computer");
    }
    
    //Post Operation.
    @POST
    @Path("/employee")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createEmployee(Employee employee) {
    	Employee emp = new Employee("Amrit Raj",employee.getId(),"Computer");
    	return Response.status(201).entity(emp).build();
    }

}
