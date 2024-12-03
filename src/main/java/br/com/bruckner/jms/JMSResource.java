package br.com.bruckner.jms;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("jms")
public class JMSResource {
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getMessage(){
        return "Message";
    }
}
