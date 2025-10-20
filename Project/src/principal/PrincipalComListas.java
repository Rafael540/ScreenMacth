package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.entities.Filme;
import model.entities.Series;
import model.entities.Titulo;

public class PrincipalComListas {

	public static void main(String[] args) {
		Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
		meuFilme.avalia(9);
		var filmeDoPaulo = new Filme("DogVille", 2003);
		filmeDoPaulo.avalia(10);
		Filme outroFilme = new Filme("Avatar", 2023);
		outroFilme.avalia(8);
		Series lost = new Series("Lost", 2000);

		Filme f1 = filmeDoPaulo;

		ArrayList<Titulo> lista = new ArrayList<>();
		lista.add(filmeDoPaulo);
		lista.add(meuFilme);
		lista.add(outroFilme);
		lista.add(lost);

		for (Titulo list : lista) {
			System.out.println(list.getNome());
			if (list instanceof Filme filme && filme.getClassificacao() > 2) {
				System.out.println("Classificação " + filme.getClassificacao());
			}
		}
		
		ArrayList<String> buscaPorArtista = new ArrayList<>();
		buscaPorArtista.add("Adam Sandler");
		buscaPorArtista.add("Paulo");
		buscaPorArtista.add("Jacqueline");
		System.out.println(buscaPorArtista);
		
		Collections.sort(buscaPorArtista);
		System.out.println("Depois da ordenação");
		System.out.println(buscaPorArtista);
		System.out.println("Lista de títulos ordenados");
		Collections.sort(lista);
		System.out.println(lista);
		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println("Ordenando por ano");
		System.out.println(lista);
		
	}

}
