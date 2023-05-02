// Operadores Logicos

public class Operadores7 {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) { // Se as duas forem verdadeira
            System.out.println("As duas condicoes sao verdadeiras");
        } else if (condicao1 || condicao2) { // Se uma ou outra for verdadeira
            System.out.println("Pelo menos uma das expressoes é verdadeira");

        }
    }

}
