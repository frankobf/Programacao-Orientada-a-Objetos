package notadeaula;

public class Uso {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Franco",3,4,3);
		System.out.println(a1);
		
		Aluno a2 = new Aluno();
			a2.setNotas(8,5,2);
			a2.setNome("maria");
			
			System.out.println(a2);
			
		
		//a1.setNome("Franco Flores");
		//a1.setNota1(7);
		//a1.setNota2(8);
		//a1.setPontos(20);
		//a1.estadoAtual();
	}

}
