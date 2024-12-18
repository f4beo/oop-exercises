package personagem;

public class AppPersonagem {

	public static void main(String[] args) {
		Personagem p = new Personagem(1001, "Fábio");
		System.out.println(p);
		
		
		System.out.println("\n" + "-".repeat(80));
		System.out.println("Recebendo golpe físico com aceleração = 10\n");
		p.recebeGolpe(10);
		System.out.println("Pontos........: " + p.getPontos());
		
		System.out.println("-".repeat(80));
		System.out.println("Recebendo golpe de arma manual com aceleração = 12\n");
		p.recebeGolpe('m', 12);
		System.out.println("Pontos........: " + p.getPontos());
		
		System.out.println("-".repeat(80));
		System.out.println("Recebendo golpe de arma mecanica com aceleração = 6\n");
		p.recebeGolpe('M', 6);
		System.out.println("Pontos........: " + p.getPontos());
		
		System.out.println("-".repeat(80));
		System.out.println("Recebendo golpe de arma eletronica com aceleração = 4\n");
		p.recebeGolpe('E', 4);
		System.out.println("Pontos........: " + p.getPontos());
		
	}

}
