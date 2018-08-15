package com.github.jeancsanchez;

import com.github.jeancsanchez.tests.FacadeTest;
import com.github.jeancsanchez.tests.StateTest;

public class Main {

    public static void main(String args[]) {
        FacadeTest facadeTest = new FacadeTest();
        facadeTest.videoGameTest();
        facadeTest.modaTest();

        StateTest stateTest = new StateTest();
        stateTest.playerTest();
    }
}
