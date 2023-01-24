import java.util.Scanner;
import java.util.ArrayList;

public class Entregador extends Pessoa {

  protected String empresa;
  protected ArrayList<Entrega> lista_entrega;

  public Entregador(String nome, String cpf, int telefone, String empresa){
    super(nome, " -- ", telefone, cpf);
    this.empresa= empresa;
    this.email= nome_completo+"@"+this.empresa+".com.br";
    lista_entregas= new ArrayList<Entrega>();
    
  }

  public void info(){
  System.out.println(" ");
  System.out.println("Nome: " + this.nome_completo);// separar as infos
  System.out.println("CPF: " + this.cpf);
  System.out.println("Contato: " + this.telefone + " / " + this.email);
  System.out.println("Empresa: " + this.empresa);
  System.out.println(" ");
  }

  public void info_entregas(){
    if(lista_entregas.size() == 0) {
      System.out.println("nenhum pedido foi separado ainda");
    } 
      else {
        for(int i= 0; i < lista_entrega.size(); i++) {
          System.out.println(lista_entrega.get(i));
        }
      }
  }
  
  public void aloca_entrega(Entrega nova_entrega) {
    System.out.println("separando pedido para entregador " + this_completo);
    lista_entrega.add(nova_entrega);
  }
}
