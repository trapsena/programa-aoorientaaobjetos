public class contabancaria{
    String numeroConta = "";
    float saldo = 0;
    cliente cliente;

    //Construtor
    public contabancaria(String numeroConta,float saldo, cliente cliente){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    
    }
    //adiciona saldo pra uma conta
    public void addSaldo(float valor){
        saldo += valor;
    }
    //saca dinheiro da conta
    public void saque(float valor){
            saldo -= valor;
    }
    public void transferir(contabancaria contaDestino, float valor) {
        if (valor <= saldo) {
            this.saque(valor);  // Saca da conta atual (origem)
            contaDestino.addSaldo(valor);  // Adiciona à conta destino
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }

     public void exibirconta() {
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("");
        cliente.exibir();
    }
  
    
}