package com.github.jeancsanchez.comportamental.templatemethod.string;

abstract public class StringTemplate {

    protected abstract String transformar(String string);

    public void exibir(String string) {
        String stringTransformada = transformar(string);
        System.out.println(stringTransformada);
    }
}
