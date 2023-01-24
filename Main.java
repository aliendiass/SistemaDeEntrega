class Main {
  public static void main(String[] args) {

    Cliente p1 = new Cliente ("Aline Dias", "alinedias@gmail.com", 51994817, "873.269.140-87");

    p1.info();
    p1.altera_endereco("av. jacui, 618", "90810-150");
    p1.info();
    //p1.altera_endereco();
    //p1.info();
  
    
    Entregador e1 = new Entregador ("José Cardoso", "876.345.234.99", 51777726, "express");

    e1.info();
    

    
    
  }
}
