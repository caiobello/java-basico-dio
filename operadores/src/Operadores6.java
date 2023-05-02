//Operadores Relacionais

public class Operadores6 {

    public static void main(String[] args) {
        String nomeUm = "Caio";
        String nomeDois = new String("Caio");
        System.out.println(nomeUm == nomeDois); // Novo objeto na memoria, id diferente, portanto false
        System.out.println(nomeUm.equals(nomeDois)); // Usar o metodo equals quando for objetos

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual ao numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente ao numero2? " + simNao);

        if (numero1 < numero2) {
            System.out.println("Condicao verdadeira");
        }
    }

}
