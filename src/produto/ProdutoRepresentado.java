package produto;

public class ProdutoRepresentado extends Produto {
	private double percRepresentacao;
	
	
	
	public ProdutoRepresentado(String codigo, String descricao,
			double precoCusto, double percLucro, double percIcms, double percRepresentacao) {
		super(codigo, descricao, precoCusto, percLucro, percIcms);
		this.percRepresentacao = percRepresentacao;
		calculaPrecoVenda();
	}

	@Override
	public void calculaPrecoVenda() {
		this.precoVenda = getPrecoCusto() + getPrecoCusto()* getPercIcms();
		this.precoVenda += getPrecoCusto() * percRepresentacao;
	}

	public double getPercRepresentacao() {
		return percRepresentacao;
	}

	@Override
	public String toString() {
		return "\nCodigo.............: " + this.getCodigo() +
				"\nDescricao..........: " + this.getDescricao() +
				"\nPreço de custo.....: " + this.getPrecoCusto() +
				"\nPreco de venda.....: " + this.precoVenda +
				"\nPerc. Lucro........: " + this.getPercLucro() +
				"\nPerc. ICMS.........: " + this.getPercIcms() +
				"\nPerc representacao.: " + this.percRepresentacao;
	}
}
