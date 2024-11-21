package produto;

public class ProdutoIndustrializado extends Produto {
	private double percIpi;

	public ProdutoIndustrializado(String codigo, String descricao, double precoCusto, 
			double percLucro,double percIcms, double percIpi) {
		super(codigo, descricao, precoCusto, percLucro, percIcms);
		this.percIpi = percIpi;
		calculaPrecoVenda();
	}
	
	@Override
	public void calculaPrecoVenda() {
		this.precoVenda = getPrecoCusto() + getPrecoCusto() * getPercIcms();
		this.precoVenda += getPrecoCusto() * this.percIpi;
		this.precoVenda += this.precoVenda * getPercLucro();
	}

	public double getPercIpi() {
		return percIpi;
	}

	@Override
	public String toString() {
		return "\nCodigo.............: " + this.getCodigo() +
				"\nDescricao..........: " + this.getDescricao() +
				"\nPreço de custo.....: " + this.getPrecoCusto() +
				"\nPreco de venda.....: " + this.precoVenda +
				"\nPerc. Lucro........: " + this.getPercLucro() +
				"\nPerc. ICMS.........: " + this.getPercIcms() +
				"\nPerc. IPI..........: " + this.percIpi;
	}
}
