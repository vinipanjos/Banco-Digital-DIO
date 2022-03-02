package Java;

public class ContaCorrente extends Banco {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return super.toString()  +
                " Limite da conta = " + limite + "\n" ;
    }
    public boolean sacar (double valor) {

        double saldoComLimite = this.getSaldo() + limite;

        if ((saldoComLimite - valor) >= 0){
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }
        return false;
    }
}
