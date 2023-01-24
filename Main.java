class Main {
  public static void main(String[] args) {

    Cliente c1 = new Cliente ("Aline Dias", "alinedias@gmail.com", 51994817, "873.269.140-87");
    Entregador e1 = new Entregador ("José Cardoso", "876.345.234.99", 51777726, "express");
    Entrega entre1 = new Entrega(6,c1, e1);
    
    c1.info();
    e1.info();
    e1.info_entregas();
    entre1.info();
    

    
    
  }
}
