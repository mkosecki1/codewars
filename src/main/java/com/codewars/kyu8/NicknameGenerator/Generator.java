package com.codewars.kyu8.NicknameGenerator;

public class Generator {
    public static String nickname (String name) {
        if (name.length()<4) {
            return "Error: Name too short";
        }
        char thirdLetter = name.charAt(2);
        return (thirdLetter == 'a' || thirdLetter == 'e' || thirdLetter == 'i' || thirdLetter == 'o' || thirdLetter == 'u')
            ? name.substring(0,4) : name.substring(0,3);
    }
}
