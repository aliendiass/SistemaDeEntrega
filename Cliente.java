import java.util.Scanner;

public class Cliente extends Pessoa{
  //no diagrama esta indicando pela seta que clientes é filho de pessoas, com informaçoes pretegidas..
  
  protected String cep;
  protected String endereco;

  public Cliente(String nome, String email, int telefone, String cpf){
    super(nome, email, telefone, cpf);
    this.cep= "----";
    this.endereco= "----";
  }

  public void info(){
  System.out.println(" ");
  System.out.println("Nome: " + this.nome_completo);
  System.out.println("CPF: " + this.cpf);
  System.out.println("Contato: " + this.telefone + " / " + this.email);
  System.out.println("Endereço: " + this.endereco + " CEP: " + this.cep);
  System.out.println(" ");
  }

  public void altera_endereco(String novo_endereco, String novo_cep){
    this.endereco= novo_endereco;
    this.cep= novo_cep;
  }
  
  public void altera_endereco(){
    Scanner rs = new Scanner(System.in);
    System.out.println("Qual o novo endereço: "); 
    this.endereco = rs.next();
    System.out.println("Qual o novo CEP: ");
    this.cep = rs.next();
  }
  
}
