public class MinhaClasse {

    static String primeiroNome = "Matheus", segundoNome = "Alan";
    static String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    public static void main(String[] args) {
        System.out.println(nomeCompleto("Matheus", "Alan"));
        System.out.println("Por variável " + MinhaClasse.nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado método: ".concat(" ").concat(primeiroNome).concat(" ").concat(segundoNome);
    }
    
}
