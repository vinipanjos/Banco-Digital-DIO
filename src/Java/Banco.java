package Java;

public class Banco {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria " + '\n' +
                "Nome do Cliente = " + nomeCliente + '\n' +
                "Numero da Conta = " + numConta + '\n' +
                "Saldo = " + saldo ;
    }

    public boolean depositar (double valor){
        saldo += valor;
        return true;
    }

    public boolean sacar (double valor){

        if (valor <= saldo){
            saldo -= valor;
            return true;
        }else{
            System.out.println("O saldo é insuficiente para efetuar o saque de " + valor);
            return false;
        }
    }
    public String consultarSaldo(){
        return "Seu saldo é: " + saldo;
    }
}
