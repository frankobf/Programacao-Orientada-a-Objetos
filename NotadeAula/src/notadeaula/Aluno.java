package notadeaula;

public class Aluno {
	//atributos
	private String nome;
	private double nota1, nota2, media, pontos;
	
	//Metodos Especiais
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	
	public double getNota1() {
		return this.nota1;
	}
	
	public void setNota1(double _nota1) {
		this.nota1 = _nota1;
		}
	public double getNota2() {
		return this.nota2;
	}
	
	public void setNota2(double _nota2) {
		this.nota2 = _nota2;
		}
	public double getPontos() {
		return this.pontos;
	}
	
	public void setPontos(double _pontos) {
		this.pontos = _pontos;
		}
	public double getMedia() {
		return this.media;
	}
	
	public void setMedia(double _media) {
		this.media = _media;
		}
	
	public void setNotas(double _nota1, double _nota2, double _pontos) {
		this.nota1 = _nota1;
		this.nota2 = _nota2;
		this.pontos = _pontos;
		
	}
	//Construtores sobrecarregados
	
	public Aluno(String _nome, double _nota1, double _nota2, double _pontos) {
		this.setNome(_nome);
		this.setNotas(_nota1, _nota2, _pontos);
	}
	
	public Aluno( double _nota1, double _nota2, double _pontos) {
		this ( "sem nome" , _nota1, _nota2, _pontos);
		}
	public Aluno( double _nota1, double _nota2) {
		this (_nota1, _nota2, 0.0);
		}
	public Aluno() {
		this (0.0,0.0);
		}
	
	//Metodos Personalizados
	
	public void estadoAtual(){
		System.out.println( this .getNome()+ ";"
		+ this .getNota1()+ ";"
		+ this .getNota2()+ ";"
		+ this .getPontos());
		}
}