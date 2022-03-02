package Java;

public class Cliente {
    public static void main(String[] args) {
        //Conta-poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Vinicius Pinheiro");
        contaPoupanca.setNumConta("12345");
        contaPoupanca.setDiaRendimento(2);

        //Extrato
        System.out.println(contaPoupanca);

        realizarDeposito(contaPoupanca, 100);
        realizarSaque(contaPoupanca, 50);

        //Taxa de retorno de 50%
        verificarInvestimento(contaPoupanca, contaPoupanca.calcularNovoSaldo(0.5));

        //Extrato
        System.out.println(contaPoupanca);

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();

        //Conta Corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNomeCliente("Victor Pinheiro");
        contaCorrente.setNumConta("12345");
        contaCorrente.setLimite(500);
        //Extrato
        System.out.println(contaCorrente);

        realizarDeposito(contaCorrente, 100);

        realizarSaque(contaCorrente, 50);

        realizarTransferencia(contaCorrente, contaPoupanca, 50);

        //Extrato
        System.out.println(contaCorrente);

        //Extrato
        System.out.println(contaPoupanca);

    }
    private static void verificarInvestimento(Banco conta, Boolean validar){
        if (validar) {
            System.out.println("Rendimento aplicado!\n" +
                    "Novo saldo de: "+ conta.getSaldo() + "\n");

        } else {
            System.out.println("Hoje não é dia de rendimento\n");

        }
    }


    private static void realizarSaque(Banco conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado, novo saldo é de : " + conta.getSaldo() + "\n");
        } else {
            System.out.println("Saldo insuficiente.\n");
        }
    }

    private static void realizarDeposito(Banco conta, double valor) {
        if (conta.depositar(valor)) {
            System.out.println("Deposito efetuado, novo saldo é de : " + conta.getSaldo()+"\n");
        }
    }

    private static void realizarTransferencia(Banco conta, Banco beneficiario, double valor) {
        if (conta.sacar(valor)) {
            beneficiario.depositar(valor);
            System.out.println("Transferencia efetuada para "+beneficiario.getNomeCliente()+", novo saldo é de : " + conta.getSaldo()+"\n");
        }
    }

}
