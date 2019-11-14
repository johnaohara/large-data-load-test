package org.whedu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {


    private static final String dataSet;

    static {

        StringBuffer buffer = new StringBuffer();

        buffer.append("[{\"id\":1,\"name\":\"tom\",\"sex\":\"f\",\"testCode\":\"12345\"},");
        for(int i = 0 ;i <1000;i++ ) {
            buffer.append("{\"id\":1,\"name\":\"tom\",\"sex\":\"f\",\"testCode\":\"12345\"},");
        }
        buffer.append("{\"id\":1,\"name\":\"tom\",\"sex\":\"f\",\"testCode\":\"12345\"} ]");

        dataSet = buffer.toString();
    }


    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello";
    }

    @GET
    @Path("/data")
    @Produces(MediaType.TEXT_PLAIN)
    public String data() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return dataSet;
    }
}