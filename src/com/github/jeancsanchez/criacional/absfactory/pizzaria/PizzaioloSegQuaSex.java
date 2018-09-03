package com.github.jeancsanchez.criacional.absfactory.pizzaria;

import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.Pizza;
import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.PizzaCalabresa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PizzaioloSegQuaSex extends Pizzaria {

    private Date data = new Date();

    public PizzaioloSegQuaSex(String data) {
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
        calendar.setTime(this.data);

        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY
                || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY
                || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;
    }

    @Override
    Pizza mandarPizza() {
        return new PizzaCalabresa();
    }
}
