package produto;

public class Produto {
	private String codigo;
	private String descricao;
	private double precoCusto;
	protected double precoVenda;
	private double percLucro;
	private double percIcms;
	
	public Produto(String codigo, String descricao, 
			double precoCusto, double percLucro, double percIcms) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoCusto = precoCusto;
		this.percLucro = percLucro;
		this.percIcms = percIcms;
	}
	
	public void calculaPrecoVenda() {
		this.precoVenda = precoCusto * percIcms;
		this.precoVenda += precoCusto * percIcms;
		this.precoVenda += precoCusto;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public double getPercLucro() {
		return percLucro;
	}

	public double getPercIcms() {
		return percIcms;
	}
	
	@Override
	public String toString() {
		return "\nCodigo..........:";
	}
}
