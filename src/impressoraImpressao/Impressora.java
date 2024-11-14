package impressoraImpressao;
import java.util.ArrayList;

public class Impressora {
	private int id;
	private String tipo;
	private boolean imprimindo;
	private ArrayList<Impressao> impressoes;
	
	
	
	public Impressora(int id, String tipo) {
		this.id = id;
		this.tipo = tipo;
		this.imprimindo = false;
		this.impressoes = new ArrayList<Impressao>();
	}

	public void recebeImpressao(String nomeArquivo) {
		this.impressoes.add(new Impressao(nomeArquivo));
		if (this.impressoes.size() == 0) {
			this.impressoes.get(0).registraInicio(nomeArquivo);
			this.imprimindo = true;
		}
	}
	
	public boolean finalizaImpressao() {
		if (this.impressoes.size() == 0) {
			return false;
		}
		
		impressoes.remove(impressoes.get(0));
		if (this.impressoes.size() != 0) {
			impressoes.get(0).registraInicio(impressoes.get(0).getNomeArquivo());
		}else {
			this.imprimindo = false;
		}
		return true;
	}

	public int getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean isImprimindo() {
		return imprimindo;
	}

	public ArrayList<Impressao> getImpressoes() {
		return impressoes;
	}
	
	
	
}
