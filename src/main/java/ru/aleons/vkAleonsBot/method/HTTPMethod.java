package ru.aleons.vkAleonsBot.method;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HTTPMethod {
    HttpClient client;
    String request = null;

    public HTTPMethod(String request) {
        this.request = request;
        client = new DefaultHttpClient();
    }

    public String GET(){
        String response = "";
        HttpGet get = new HttpGet(request);
        try {
            HttpResponse httpResponse = client.execute(get);
            BufferedReader rd = new BufferedReader (new InputStreamReader(httpResponse.getEntity().getContent()));
            String line = "";
            while ((line = rd.readLine()) != null) {
                response=response+line;
            }
        }
        catch (IOException e) {
        e.printStackTrace();
        }
        finally {
            return response;
        }
    }
}
