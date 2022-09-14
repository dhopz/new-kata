package com.example.test;

import com.example.main.Walk;
import org.junit.Test;

import static org.junit.Assert.*;

public class WalkTest {

    @Test
    public void validWalkCharArrayShortRouteReturnFalse(){
        char[] route = new char[]{'n', 's', 'e', 'w'};
        Walk walk = new Walk(route);
        assertFalse(walk.validWalk());
    }

    @Test
    public void validWalkCharArrayWith10PointsReturnTrue(){
        char[] route = new char[] {'n','s','n','s','n','s','n','s','n','s'};
        Walk walk = new Walk(route);
        assertTrue(walk.validWalk());
    }

    @Test
    public void validWalkCharArrayWithCorrectRouteReturnTrue(){
        char[] route = new char[]{'w','s','e','e','n','n','e','s','w','w'};
        Walk walk = new Walk(route);
        assertTrue(walk.validWalk());
    }

    @Test
    public void validWalkCharArrayDoesNotReturnToStartReturnFalse(){
        char[] route = new char[]{'w','w','w','w','w','w','w','w','w','w'};
        Walk walk = new Walk(route);
        assertFalse(walk.validWalk());
    }




}
