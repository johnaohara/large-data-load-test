package org.whedu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        StringBuffer buffer = new StringBuffer();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        buffer.append("[{\"id\":1,\"name\":\"tom\",\"sex\":\"f\",\"testCode\":\"12345\"},");
        for(int i = 0 ;i <1000;i++ ) {
            buffer.append("{\"id\":1,\"name\":\"tom\",\"sex\":\"f\",\"testCode\":\"12345\"},");
        }
        buffer.append("{\"id\":1,\"name\":\"tom\",\"sex\":\"f\",\"testCode\":\"12345\"} ]");
        return buffer.toString();
    }
}