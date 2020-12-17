package evaluacion3;

public class Pizza {
  // Envia un mensaje con el tipo de Pizza del Productor al Consumidor
  private String tipoPizza;
  // True si el consumidor debe esperar a que el
  // productor envie un mensaje,
  // false si el productor debe esperar a que el 
  // consumidor lea el mensaje.
  private boolean noHayPizzas = true;

  public synchronized String repartirPizza() {
      // Espera hasta que haya pizzas que repartir (el mensaje esta disponible)
      while (noHayPizzas) {
          try {
              wait();
          } catch (InterruptedException e) {}
      }
      // una vez que se ha Consumnido la pizza (leido el mensaje)
      // Invierto el estado
      noHayPizzas = true;
      // Indico al Productor que el estado ha cambiado (no quedan pizzas)
      // para que produzca mas pizzas
      notifyAll();
      return tipoPizza;
  }

  public synchronized void hornearPizza(String tipoPizza) {
      // espero hasta que no queden más pizzas (se lean todos los mensajes)
      while (!noHayPizzas) {
          try { 
              wait();
          } catch (InterruptedException e) {}
      }
      // Cuando ya no quedan más pizzas
      // Produzco una nueva pizza 
      // Invierto el estado
      noHayPizzas = false;
      // cambio el tipo de pizza
      this.tipoPizza = tipoPizza;
      // Notifico al Consumidor que ya hay pizzas para comer
      notifyAll();
  }
}

