package com.tts.weatherapp.model;

import lombok.NoArgsConstructor;
import lombok.Data;


import java.util.List;
import java.util.Map;
@Data
@NoArgsConstructor
public class Response {


/*below we are utilizing lombok to remove boilerplate code
    @data will ad getters setters toString, etc
    @NoArgsConstructor will add a default constructor */


    private Map<String, String> coord;
    private List<Map<String, String>> weather;
    private String base;
    private Map<String, String> main;
    private Map<String, String> wind;
    private Map<String, String> clouds;
    private String dt;
    private Map<String, String> sys;
    private String id;
    private String name;
    private String cod;
}