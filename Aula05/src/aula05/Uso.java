package aula05;

public class Uso {

	public static void main(String[] args) {
		ContaBanco p1 =new ContaBanco();
		p1.setNumConta(11111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
	
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(22222);
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		
		p1.depositar(300);
		p2.sacar(1000);
		p1.sacar(350);
		p1.fecharConta();
		
		p1.estadoAtual();
		p2.estadoAtual();
		

	}

}