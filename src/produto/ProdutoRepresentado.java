package produto;

public class ProdutoRepresentado extends Produto {
	private double percRepresentacao;
	
	
	
	public ProdutoRepresentado(String codigo, String descricao,
			double precoCusto, double percLucro, double percIcms, double percRepresentacao) {
		super(codigo, descricao, precoCusto, percLucro, percIcms);
		this.percRepresentacao = percRepresentacao;
	}

	@Override
	public void calculaPrecoVenda() {
		this.precoVenda = getPrecoCusto() + getPrecoCusto()* getPercIcms();
		this.precoVenda += getPrecoCusto() * percRepresentacao;
	}

	public double getPercRepresentacao() {
		return percRepresentacao;
	}
	
}
