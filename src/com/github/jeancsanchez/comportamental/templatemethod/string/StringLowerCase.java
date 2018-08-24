package com.github.jeancsanchez.comportamental.templatemethod.string;

public class StringLowerCase extends StringTemplate {

    @Override
    protected String transformar(String string) {
        return string.toLowerCase();
    }
}
