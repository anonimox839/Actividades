package com.cga.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {
    
    public static void invertir (ArrayList<String> arrString){

        Collections.reverse(arrString);

    }

    public static void main(String[] args) {
        
        ArrayList<String> arrListString = new ArrayList<>() {{ add("Hola"); add("Que"); add("Tal"); add("Pinche"); add("Pendejo");}};

        invertir(arrListString);

        System.out.println(arrListString.toString());
    }

}
