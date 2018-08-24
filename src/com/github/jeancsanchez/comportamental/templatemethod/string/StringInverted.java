package com.github.jeancsanchez.comportamental.templatemethod.string;

public class StringInverted extends StringTemplate {

    @Override
    protected String transformar(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
