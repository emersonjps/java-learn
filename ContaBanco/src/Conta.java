public class Conta {
    private int numero = 0;
    private String agencia = "";
    private String nomeCliente = "";
    private double saldo = 0;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
