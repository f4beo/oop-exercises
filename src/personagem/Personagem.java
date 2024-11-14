package personagem;

public class Personagem {
	private int id;
	private String nome;
	private int pontos;
	
	public Personagem(int id, String nome) {
		this.id = id;
		this.nome = nome;
		this.pontos = 100;
	}
	
	public void recebeGolpe(int aceleracao) {
		this.pontos -= 1 * aceleracao;
	}
	
	public void recebeGolpe(char tipoArma, int aceleracao) {
		switch (tipoArma) {
		case 'm': {
			this.pontos -= calculaDanoManual(aceleracao);
		}
		case 'M': {
			this.pontos -= calculaDanoMecanico(aceleracao);
		}
		case 'E': {
			this.pontos -= calculaDanoEletronico(aceleracao);
		}
		default:
		
		}
		if(this.pontos < 0) {
			this.pontos = 0;
		}
	}
	
	private int calculaDanoManual(int aceleracao) {
		return 2 * aceleracao;
	}
	
	private int calculaDanoMecanico(int a) {
		return (int)Math.ceil(calculaDanoManual(a) * 0.4 + calculaDanoManual(a));
	}
	
	private int calculaDanoEletronico(int a) {
		return (int)Math.ceil(calculaDanoMecanico(a) * 0.4 + calculaDanoMecanico(a));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public int getPontos() {
		return pontos;
	}
	
	@Override
	public String toString() {
		return "\nID............: " + this.id +
			   "\nNome..........: " + this.nome +
			   "\nPontos........: " + this.pontos;
	}
}
