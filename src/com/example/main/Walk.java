package com.example.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Walk {
    char[] route;

    public Walk(char[] route) {
        this.route= route;
    }

    public Map<Character,Integer> createRouteMap() {
        Map<Character,Integer> points = new HashMap<>();

        if (validLength()){
            for (char key : route) {
                if (points.containsKey(key)) {
                    int value = points.get(key);
                    points.put(key, value + 1);
                } else {
                    points.put(key, 1);
                }
            }
        }
        return points;
    }

    public boolean validLength(){
        return route.length == 10;
    }

    public boolean validWalk() {
        if(validLength())
            return
                    Objects.equals(createRouteMap().get('n'), createRouteMap().get('s')) &&
                            Objects.equals(createRouteMap().get('w'), createRouteMap().get('e'));
        else {
            return false;
        }
    }


}
