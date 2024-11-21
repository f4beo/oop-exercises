package produto;

public class AppProduto {

	public static void main(String[] args) {
		Produto p = new Produto("1001p", "Produto simples", 100.0, 0.1, 0.4);
		System.out.println(p);

		Produto pInd = new ProdutoIndustrializado("1002p", "Produto industrializado",
				100, 0.2, 0.5, 0.2);
		System.out.println(pInd);

		Produto pRep = new ProdutoRepresentado("1003p", "Produto representado", 100, 0.1, 0.2, 0.6);
		System.out.println(pRep);
	}
}