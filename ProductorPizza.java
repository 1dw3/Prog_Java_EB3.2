package evaluacion3;

import java.util.Random;

public class ProductorPizza implements Runnable {
    private Pizza pizza;
 
    public ProductorPizza(Pizza pizza) {
        this.pizza = pizza;
    }
 
    public void run() {
        String tiposDePizzas[] = {
            "Carbonara",
            "Cuatro Estaciones",
            "Hawaiana",
            "Queso"
        };
        Random random = new Random();
 
        for (int i = 0; i < tiposDePizzas.length; i++) {
            pizza.hornearPizza(tiposDePizzas[i]);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
        pizza.hornearPizza("fin");
    }
}
