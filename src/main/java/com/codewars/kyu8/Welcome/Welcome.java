package com.codewars.kyu8.Welcome;

public class Welcome {
    public static String greet(String language){
        switch (language){
            case "czech" : return "Vitejte";
            case "danish" : return "Velkomst";
            case "dutch" : return "Welkom";
            case "finnish" : return "Tervetuloa";
            case "estonian" : return "Tere tulemast";
            case "flemish" : return "Welgekomen";
            case "french" : return "Bienvenue";
            case "german" : return "Willkommen";
            case "irish" : return "Failte";
            case "italian" : return "Benvenuto";
            case "latvian" : return "Gaidits";
            case "lithuanian" : return "Laukiamas";
            case "polish" : return "Witamy";
            case "spanish" : return "Bienvenido";
            case "swedish" : return "Valkommen";
            case "welsh" : return "Croeso";
        }
        return "Welcome";
    }
}