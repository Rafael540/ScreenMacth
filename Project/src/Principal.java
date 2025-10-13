import model.entities.Filme;
import model.entities.Series;

public class Principal {
    public static void main(String[] args) throws Exception {

        String nome = "O poderoso chefão";
        int anoDeLancamento = 1970;
        int duracaoEmMinuto = 180;
        boolean incluidoNoPlano = true;


      
        Series lost = new Series();
        
        lost.setNome("Lost");
        lost.setTemporadas(10);
        lost.setDuracaoEmMinuto(500);
        lost.setAtiva(true);
        System.out.println("Duração do filme: " + lost.getDuracaoEmMinuto() );
    }
}
