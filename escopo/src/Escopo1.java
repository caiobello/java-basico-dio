public class Escopo1 {
    double saldo = 10.0;
    double saldoAtual;

    public void sacar(int valor) {
        saldoAtual = saldo - valor;
        System.out.println("Saque efetuado de: " + valor);
        System.out.println("Saldo atual é de: " + saldoAtual);
    }

    public void imprimirSaldo() {
        System.out.println("O saldo atual é de: " + saldoAtual);
    }

/*   public double calcularDividaExponencial() {
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for (int x = 1; x <= 5; x++) 
            ;
        double valorCalculado = valorParcela * x;
        valorMontante = valorMontante + valorCalculado;
    } */  

    public static void main(String[] args) {
        Escopo1 objeto = new Escopo1();
        objeto.sacar(2);
        objeto.imprimirSaldo();

    }
}
