/* 
public class MinhaClasse {
    
    public static void main(String[] args) {
        
        String meuNome = "Julio";

        int anoDeNascimento = 1995;

        boolean verdadeira = true;

        anoDeNascimento = 2024;
    }
}*/

public class MinhaClasse {
    
public static void main (String[] args) {

    String primeiroNome = "Julio";
    String segundoNome = "Cesar";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);

}



}
