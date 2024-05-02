package model;

public class Conta {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;  



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

    @Override
    public String toString() {       
        return   String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %,.2f já está disponível para saque. ",nomeCliente,agencia,numero,saldo);
    }
}