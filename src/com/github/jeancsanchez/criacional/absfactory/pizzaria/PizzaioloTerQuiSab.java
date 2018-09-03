package com.github.jeancsanchez.criacional.absfactory.pizzaria;

import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.Pizza;
import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.PizzaPresunto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PizzaioloTerQuiSab extends Pizzaria {

    private Date data = new Date();

    public PizzaioloTerQuiSab(String data) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            this.data = dateFormat.parse(data);

        } catch (ParseException e) {
            System.out.println("Formato da data inválido");
        }
    }

    @Override
    boolean diaDeTrabalho() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);

        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY
                || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY
                || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY;
    }

    @Override
    Pizza mandarPizza() {
        return new PizzaPresunto();
    }
}
