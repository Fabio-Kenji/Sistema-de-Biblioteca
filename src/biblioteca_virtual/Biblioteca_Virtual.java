package biblioteca_virtual;

public class Biblioteca_Virtual {

    public static void main(String[] args) {
        
        Painel p = new Painel(); // Construtor da classe Painel
        
        while(true){ // Enquanto a condição for verdadeira, executa o método menuPrincipal() localizada na classe Painel
            p.menuPrincipal();
        }
    }
}
