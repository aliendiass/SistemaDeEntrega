import java.util.Scanner;

public abstract class Pessoa {
  //essa classe precisa ser protegida (no diagrama isso é sinalizado por #), o que isso significa: que somente os filhos dessas  classes teram acesso a essas informaçoes.
  
  protected String nome_completo;  
  protected String cpf;
  protected int telefone;
  protected String email;


  //essa classe precisa ter dois metodos, aplicando o polimorfismo, que é ter dois metodos fazendo coisas diferentes, nesse caso esses metodos um está alterando as informacoes e o outro esta recebendo essas informaçoes...
  
  public void altera_contato(int novo_telefone, String novo_email){ //um tem parametros
    this.telefone = novo_telefone;
    this.email= novo_email;
  }

  public void altera_contato(){ //e esse não tem pq ele vai receber esses parametros...
    Scanner rs = new Scanner(System.in);
    
    System.out.println("Qual o novo número de telefone: ");
    this.telefone = rs.nextInt();
    System.out.println("Qual o novo email: ");
    this.email = rs.next();
    
  }

  public Pessoa (String nome, String email, int telefone, String cpf){
    this.nome_completo= nome;
    this.email= email;
    this.telefone= telefone;
    this.cpf= cpf;
  }
  
}
