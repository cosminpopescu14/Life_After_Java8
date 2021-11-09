package com.company;

import jdk.jfr.Description;
import jdk.jfr.Event;
import jdk.jfr.Label;

import java.io.IOException;
import java.util.stream.IntStream;

public class Java11 {
    public static void main(String[] args) throws IOException {
        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter((var i) -> i % 3 == 0)
                .forEach(System.out::println);

        System.out.println("ADCES".repeat(3));

//        var event = new JFRDemo();
//        event.message = "ADCES - Life after JAVA 8 :) !";
//        event.commit();

//        var p = Paths.get("recording.jfr");
//        for (RecordedEvent e : RecordingFile.readAllEvents(p)) {
//            System.out.println(e.getStartTime() + " : " + e.getValue("message"));
//        }

    }
}

//@Label("Hello World")
//@Description("Helps the programmer getting started")
//class JFRDemo extends Event {
//    @Label("Message")
//    String message;
//}


