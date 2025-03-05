package Kaique.primeiraSemana;

public class Main {
    public static void main(String[] args) {

        String primeiroNome = "Kaique";
        String segundoNome = "Caio";

       // String nome = nomeCompleto(primeiroNome, segundoNome);

        System.out.println("\n"+nomeCompleto(primeiroNome, segundoNome));



    }

    public static String nomeCompleto (String FirstName, String SecondName ){

        //return FirstName + ' ' + SecondName + '\n';
        return FirstName.concat(" ").concat(SecondName);
    }
}