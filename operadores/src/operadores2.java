import java.util.Date;

import org.omg.Messaging.SyncScopeHelper;

public class Operadores2 {
    // Atribuindo igualdade

    int idade = 30;
    double peso = 70.1;
    char sexo = 'M';
    boolean doadorOrgão = false;

    // Classes que representam tipos:
    String nome = "Caio";
    static Date dataNascimento = new Date();

    public static void main(String[] args) {
        System.out.println(dataNascimento);
        String nomeCompleto = "Linguagem " + "Java";

        System.out.println(nomeCompleto);

        String concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1);
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = (1 + 1 + 1) + "1";
        System.out.println(concatenacao);

    }
}
