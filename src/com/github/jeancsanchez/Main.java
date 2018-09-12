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
        templateMethodTest.stringTest();

        AbsFactoryTest absFactoryTest = new AbsFactoryTest();
        absFactoryTest.carroTest();
        absFactoryTest.pizzariaTest();

        StateTest stateTest = new StateTest();
        stateTest.playerTest();

        DecoratorTest decoratorTest = new DecoratorTest();
        decoratorTest.playerTest();

        CompositeTest compositeTest = new CompositeTest();
        compositeTest.arquivosTest();
        compositeTest.congressoTest();

        BridgeTest bridgeTest = new BridgeTest();
        bridgeTest.janelasTest();

        MediatorTest mediatorTest = new MediatorTest();
        mediatorTest.mensagensTest();

        ChainTest chainTest = new ChainTest();
        chainTest.bancoTest();
    }
}
