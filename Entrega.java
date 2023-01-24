public class Entrega{

  private int codigo_entrega;
  private Entregador entregador;
  private Cliente cliente;
  private String situacao;

  public Entrega(int codigo_entrega, Cliente cliente, Entregador entregador){
    this.codigo_entrega= codigo_entrega;
    this.cliente= cliente;
    this.entregador= entregador;
    this.situacao= "Em transito";
    //this.entregador.aloca_entrega(this);
  }

 public void info(){
    System.out.println(" ");
    System.out.println("Entrega/Situação #" + this.codigo_entrega + " / " + this.situacao);
    System.out.println("Entregador/Empresa " + this.entregador.nome_completo + " / " + this.entregador.empresa);
    System.out.println("Endereço: " + this.cliente.endereco);
    System.out.println("Endereço: " + this.cliente.endereco + " CEP: " + this.cliente.cep);
    System.out.println("Cliente: " + this.cliente.nome_completo + " / " + this.cliente.cpf);
    System.out.println(" ");
  }

  public void altera_situacao(String nova_situacao){
    this.situacao= nova_situacao; 
  }
  public void info_para_entregador(){
    System.out.println(" ");
    System.out.println("Entrega/Situação #" + this.codigo_entrega + " / " + this.situacao);
    System.out.println("Endereço: " + this.cliente.endereco);
    System.out.println("Endereço: " + this.cliente.endereco + " CEP: " + this.cliente.cep);
    System.out.println("Cliente: " + this.cliente.nome_completo + " / " + this.cliente.cpf);
    System.out.println(" ");
  }
}