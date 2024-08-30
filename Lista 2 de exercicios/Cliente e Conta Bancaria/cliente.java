public class cliente{
    String nome = "";
    String cpf = "";
    String endereco ="";

    //o contrutor 
    public cliente (String nome,String cpf,String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    //o metodo de exibir
    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Endereco: "+endereco);
        System.out.println("");
;    }
}
