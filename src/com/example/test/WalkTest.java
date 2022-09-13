package com.example.test;

import com.example.main.Walk;
import org.junit.Test;

import static org.junit.Assert.*;

public class WalkTest {

    @Test
    public void returnsArray(){
        String[] direction = new String[]{"n", "s", "e", "w"};
        Walk walk = new Walk(direction);
        assertArrayEquals(direction,walk.route());
    }

    @Test
    public void returnsArrayWith10Blocks(){
        String[] direction = new String[]{"n", "s", "e", "w"};
        Walk walk = new Walk(direction);
        int steps = walk.getDirection().length;
        assertTrue(steps !=10);
    }

    @Test
    public void returnsTrue(){
        String[] direction = new String[]{"w", "s", "e", "e", "n", "n", "e", "s", "w", "w"};
        Walk walk = new Walk(direction);
        assertTrue(walk.returnToStart());

    }


}
