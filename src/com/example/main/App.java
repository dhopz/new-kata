package com.example.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class App {
    public static void main(String[] args) {

//        char[] direction = new char[]{'w', 's', 'e', 'e', 'n', 'n', 'e', 's', 'w', 'w'}; //{s=2, e=3, w=3, n=2} true
//        char[] direction = new char[]{'w', 's', 'e', 'n', 'n', 'e', 's', 'w', 'w', 'w'}; //{s=2, e=2, w=4, n=2} false
//        char[] direction = new char[]{'w', 's', 'e', 's', 's', 'e', 's', 'w', 'n', 'n'}; //{s=4, e=2, w=2, n=2} false
//        char[] walk = new char[] {'n','n','n','s','n','s','n','s','n','s'}; //false
        char[] walk = new char[] {'n','s','n','s','n','s','n','s','n','s'}; //true
//        char[] walk = new char[]{'s','n','s'};
        Map<Character,Integer> points = new HashMap<>();

        if (walk.length == 10) {
            for (char key : walk) {
                if (points.containsKey(key)) {
                    int value = points.get(key);
                    points.put(key, value + 1);
                } else {
                    points.put(key, 1);
                }
            }
            System.out.println(points);


            if (Objects.equals(points.get('n'), points.get('s')) && Objects.equals(points.get('e'), points.get('w'))) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("not today son");
        }


        }



}
