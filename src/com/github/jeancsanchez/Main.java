package com.github.jeancsanchez;

import com.github.jeancsanchez.tests.FacadeTest;
import com.github.jeancsanchez.tests.FactoryTest;
import com.github.jeancsanchez.tests.StrategyTest;

public class Main {

    public static void main(String args[]) {
        FacadeTest facadeTest = new FacadeTest();
        facadeTest.videoGameTest();
        facadeTest.modaTest();

        StrategyTest strategyTest = new StrategyTest();
        strategyTest.guerraTest();

        FactoryTest factoryTest = new FactoryTest();
        factoryTest.carroTest();

//        StateTest stateTest = new StateTest();
//        stateTest.playerTest();
    }
}
