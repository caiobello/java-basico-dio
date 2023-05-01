//Declarando Variáveis e métodos

public class AnatomiaClasses3 {
    // (Variáveis) Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
    int idade = 30;
    double altura = 1.72;
    String meuNome = "Caio B.";
    int anoFabricacao = 2022;
    boolean VerdadeiroFalso = true;
    double cep = 323123123;

    // Método Main
    public static void main(String[] args) {
        String primeiroNome = "Caio";
        String segundoNome = "Bello";
        // String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    // (Métodos) TipoRetorno NomeObjetivoInfinitivo (Parametros) { }
    public static String nomeCompleto(String primeiroNome, String SegundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(SegundoNome);
    }

}