package ru.cwl.server;

import static spark.Spark.get;
import static spark.Spark.staticFiles;

/**
 * Created by admin on 02.08.2017.
 */

public class WebServer {
    public static void main(String[] args) {

        boolean localhost=true;
        if (localhost) {
            String projectDir = System.getProperty("user.dir");
            String staticDir = "/src/main/resources/public";
            staticFiles.externalLocation(projectDir + staticDir);
        } else {
            staticFiles.location("/public");
        }

        get("/hello", (req, res) -> "Hello World");

        System.out.println("http://localhost:4567/hello");
    }
}