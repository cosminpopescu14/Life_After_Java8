package com.company;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.applet.Applet;

public class Java9 {
    public static void main(String[] args) throws IOException, InterruptedException {


        List<String> languages = List.of("Java", "C#", "PHP", "Python", "Ruby");

        languages.stream().map(String::length).forEach(System.out::println);
        languages.stream().filter(elem -> elem.startsWith("P")).forEach(System.out::println);


        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(URI.create("https://advancedweb.hu/"))
                        .GET()
                        .build();

        HttpResponse<String> response =
                httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        response.headers().map().forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
