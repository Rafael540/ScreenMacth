package principal;
import java.util.ArrayList;

import model.calculo.CalculadoraDeTempo;
import model.calculo.FiltroRecomendacao;
import model.entities.Episodios;
import model.entities.Filme;
import model.entities.Series;

public class Principal {
	public static void main(String[] args) throws Exception {

		Filme meuFilme = new Filme("O Poderoso Chefão", 1970);

		//meuFilme.setNome("O Poderoso Chefão");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinuto(180);

		Series lost = new Series("Lost",2013);

		lost.setNome("Lost");
		lost.setTemporadas(10);
		lost.setDuracaoEmMinuto(500);
		lost.setAtiva(true);
		System.out.println("Duração para maratonar: " + lost.getDuracaoEmMinuto());

		Filme outroFilme = new Filme("Avatar", 2023);

		//outroFilme.setNome("Avatar");
		outroFilme.setAnoDeLancamento(2023);
		outroFilme.setDuracaoEmMinuto(200);

		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		System.out.println(calculadora.getTempoTotal());

		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);

		Episodios episodio = new Episodios();
		episodio.setNumero(10);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);

		filtro.filtra(episodio);

		var filmeDoPaulo = new Filme("DogVille", 2003);
		filmeDoPaulo.setDuracaoEmMinuto(200);
		//filmeDoPaulo.setNome("DogVille");
		filmeDoPaulo.setAnoDeLancamento(2003);
		filmeDoPaulo.avalia(10);

		ArrayList<Filme> listDeFilmes = new ArrayList<>();
		listDeFilmes.add(filmeDoPaulo);
		listDeFilmes.add(meuFilme);
		listDeFilmes.add(outroFilme);
		System.out.println("Tamanho da lista: " + listDeFilmes.size());
		System.out.println("Primeiro filme: " + listDeFilmes.get(0).getNome());
		
		System.out.println("Lista de Filmes: ");
		for(int i = 0 ; i < listDeFilmes.size(); i++) {
			System.out.println(listDeFilmes.get(i).getNome());
		}
		
		System.out.println(" ");
		System.out.println("Lista de Filmes usando for each: ");
		for(Filme filme : listDeFilmes) {
			System.out.println(filme.getNome());
		}
		
		
	}
}
