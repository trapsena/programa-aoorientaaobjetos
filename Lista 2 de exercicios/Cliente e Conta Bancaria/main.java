public class main {
    public static void main(String[] args) {
        // Criando clientes e contas bancárias
        cliente cliente1 = new cliente("João", "123456789", "Rua A, 123");
        contabancaria conta1 = new contabancaria("001", 1000, cliente1);

        cliente cliente2 = new cliente("Maria", "987654321", "Rua B, 456");
        contabancaria conta2 = new contabancaria("002", 2000, cliente2);

       
        conta2.addSaldo(500);  
        
        conta2.exibirconta();

        conta1.transferir(conta2, 300);

        conta2.exibirconta();

    }
}