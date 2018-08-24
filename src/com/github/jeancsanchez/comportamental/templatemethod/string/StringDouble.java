package com.github.jeancsanchez.comportamental.templatemethod.string;

public class StringDouble extends StringTemplate {

    @Override
    protected String transformar(String string) {
        return string + " " + string;
    }
}
