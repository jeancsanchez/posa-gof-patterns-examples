package com.github.jeancsanchez.estrutural.facade.moda;

public class ModaFacade {

    public void decidirVestimenta(double fahrenheit) {
        double celsius = SistemaTemperatura.fahrenheitToCelsius(fahrenheit);
        Clima clima = SistemaClima.classificarClima(celsius);
        SistemaModa.pegarRoupa(clima);
    }
}
