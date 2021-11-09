package com.company;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java10 {
    public static void main(String[] args) throws IOException, InterruptedException {


        var languages = List.of("Java", "C#", "PHP", "Python", "Ruby");

        languages.stream().map(String::length).forEach(System.out::println);
        languages.stream().filter(elem -> elem.startsWith("P")).forEach(System.out::println);


        var httpClient = HttpClient.newBuilder().build();

        var request =
                HttpRequest.newBuilder()
                        .uri(URI.create("https://advancedweb.hu/"))
                        .GET()
                        .build();

        var response =
                httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        response.headers().map().forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
