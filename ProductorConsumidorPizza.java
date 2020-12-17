package evaluacion3;

public class ProductorConsumidorPizza {
  public static void main(String[] args) {
      Pizza pizza = new Pizza();
      (new Thread(new ProductorPizza(pizza))).start();
      (new Thread(new ConsumidorPizza(pizza))).start();
  }
}

