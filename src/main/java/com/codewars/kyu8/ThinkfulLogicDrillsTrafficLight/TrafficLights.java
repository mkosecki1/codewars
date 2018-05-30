package com.codewars.kyu8.ThinkfulLogicDrillsTrafficLight;

public class TrafficLights {
    public static String updateLight(String current) {
        switch (current){
            case "red" : return "green";
            case "green" : return "yellow";
            case "yellow": return "red";
            default: throw new IllegalArgumentException();
        }
    }
}
