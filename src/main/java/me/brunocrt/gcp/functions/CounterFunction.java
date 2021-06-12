package me.brunocrt.gcp.functions;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.io.BufferedWriter;
import java.io.IOException;

public class CounterFunction implements HttpFunction {

    public static int counter = 0;

    @Override
    public void service(HttpRequest request, HttpResponse response)
        throws IOException {

        // increment the counter
        counter++;

        BufferedWriter writer = response.getWriter();
        writer.write("My first counter function!\r\n");
        writer.write("counter: "+counter);

    }
}
