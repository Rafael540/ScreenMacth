package model.entities;

public class Titulo {

	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaAvaliacao;
	private int totalDesomaAvaliacao;
	private int duracaoEmMinuto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public int getDuracaoEmMinuto() {
		return duracaoEmMinuto;
	}

	public void setDuracaoEmMinuto(int duracaoEmMinuto) {
		this.duracaoEmMinuto = duracaoEmMinuto;
	}

	
	  public void exibeFichaTecnica() {
	        System.out.println("Nome do filme: " + nome);
	        System.out.println("Ano de lançamento: " + anoDeLancamento);
	    }

	    public void avalia(double nota) {
	        somaAvaliacao += nota;
	        totalDesomaAvaliacao++;
	    }

	    public double obterMedia() {
	        return somaAvaliacao / totalDesomaAvaliacao;
	    }

		public int getDuracaoEmMinutos() {
			// TODO Auto-generated method stub
			return 0;
		}

	  
}
