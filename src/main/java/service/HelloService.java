package service;

import database.Message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;
//import javax.ws.rs.core.MediaType;

@Path("/Hello")
public class HelloService {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Witaj, hello!";
    }

    @Path("/echo")
    @GET
    @Produces("text/plain")
    public String echo() {
        return "Witaj Echo";
    }

    @Path("/echo/{parametr}")
    @GET
    @Produces("text/plain")
    public String echo(@PathParam("parametr") String value) {
        return "Witaj Echo: " + value;
    }

    @Path("/messages/xml")
    @GET
    @Produces("application/xml")
    public List<Message> getMessagesXml() {
        return Message.getSampleMessages();
    }

    @Path("/messages/json")
    @GET
    @Produces("application/json")
    public List<Message> getMessagesJson() {
        return Message.getSampleMessages();
    }
}