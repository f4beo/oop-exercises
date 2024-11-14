package impressoraImpressao;

public class Impressao {
	private static int contadorId = 0;
	private int id;
	private String nomeArquivo;
	private boolean status;
	
	public Impressao(String nomeArquivo) {
		this.id = ++contadorId;
		this.nomeArquivo = nomeArquivo;
		this.status = false;
	}
	
	public void registraInicio(String nomeArquivo) {
		this.status = true;
	}

	public int getId() {
		return id;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public boolean isStatus() {
		return status;
	}
	
	
	
}
