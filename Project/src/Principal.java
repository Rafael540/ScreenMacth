import model.entities.Filme;

public class Principal {
    public static void main(String[] args) throws Exception {

        String nome = "O poderoso chefão";
        int anoDeLancamento = 1970;
        int duracaoEmMinuto = 180;
        boolean incluidoNoPlano = true;

        Filme meuFilme = new Filme(nome, anoDeLancamento, incluidoNoPlano, duracaoEmMinuto);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(5);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDesomaAvaliacao());

    }
}
