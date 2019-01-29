package com.example.rumpilstilstkin.lesson4;


public class MegaClassForTest {

    public int someWithNumber(String token){
        return token.indexOf("o") + 1;
    }

    public String someWithString(int number){
        String t = "";
        for(int i = 0; i < number; i++ ){
            t += "o";
        }
        return t;
    }
}
