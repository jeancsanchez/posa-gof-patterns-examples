package com.github.jeancsanchez;

import com.github.jeancsanchez.tests.*;

public class Main {

    public static void main(String args[]) {

        FacadeTest facadeTest = new FacadeTest();
        facadeTest.videoGameTest();
        facadeTest.modaTest();

        StrategyTest strategyTest = new StrategyTest();
        strategyTest.guerraTest();

        FactoryTest factoryTest = new FactoryTest();
        factoryTest.carroTest();

        TemplateMethodTest templateMethodTest = new TemplateMethodTest();
        templateMethodTest.playerTest();

        AbsFactoryTest absFactoryTest = new AbsFactoryTest();
        absFactoryTest.carroTest();

        StateTest stateTest = new StateTest();
        stateTest.playerTest();

        DecoratorTest decoratorTest = new DecoratorTest();
        decoratorTest.playerTest();

        CompositeTest compositeTest = new CompositeTest();
        compositeTest.arquivosTest();
    }
}
