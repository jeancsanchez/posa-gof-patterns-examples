package com.github.jeancsanchez.comportamental.templatemethod.string;

public class StringUpperCase extends StringTemplate {

    @Override
    protected String transformar(String string) {
        return string.toUpperCase();
    }
}
