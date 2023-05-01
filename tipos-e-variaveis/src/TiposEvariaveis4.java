public class TiposEvariaveis4 {

    public static void main(String[] args) {
        //variável em caixa baixa por de ser alterada, por convenção
        
        int numero =5;
        numero = 10;

        System.out.println(numero);

        //variáveis imutáveis tem caixa alta pro convenção
        //tipo "final" para nao permitir que ela altere

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
    
}
