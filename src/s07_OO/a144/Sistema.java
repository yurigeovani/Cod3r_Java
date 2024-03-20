package s07_OO.a144;

class Sistema {

	public static void main(String[] args) {

		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67 , 100);
		compra1.adicionarItem(new Produto("notebook", 1897.88), 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10 , 10);
		compra2.adicionarItem(new Produto("Impressora", 998.90), 1);
		
		Cliente cliente = new Cliente("Yuri");
		cliente.adicionarCompra(compra1); // ideal
		cliente.compras.add(compra2); // evitar mas tambem é possivel
		
		System.out.println(cliente.getValotTotal());
	}

}
