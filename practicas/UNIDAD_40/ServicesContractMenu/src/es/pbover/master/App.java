package es.pbover.master;

public class App {
  public static void main(String[] args) {
    new ServicesContractMenu(new ServicesContract(new Console().readInt("Introduzca el anyo(yyyy) :"))).interact();
  }
}
