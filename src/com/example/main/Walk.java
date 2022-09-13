package com.example.main;

import java.util.List;

public class Walk {
    char[] direction;

    public Walk(char[] direction) {
        this.direction = direction;
    }

    public String[] route(){
        return new String[]{"n","s","e","w"};
    }

    public char[] getDirection() {
        return direction;
    }

    public void setDirection(char[] direction) {
        this.direction = direction;
    }

    public boolean returnToStart() {
    }
}
