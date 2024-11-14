package produto;

public class ProdutoIndustrializado extends Produto {
	private double percIpi;

	public ProdutoIndustrializado(String codigo, String descricao, double precoCusto, 
			double percLucro,double percIcms, double percIpi) {
		super(codigo, descricao, precoCusto, percLucro, percIcms);
		this.percIpi = percIpi;
	}
	
	@Override
	public void calculaPrecoVenda() {
		this.precoVenda = getPrecoCusto() + getPrecoCusto()* getPercIcms();
		this.precoVenda += getPrecoCusto() * percIpi;
		this.precoVenda += precoVenda * getPercLucro();
	}

	public double getPercIpi() {
		return percIpi;
	}
	
}
