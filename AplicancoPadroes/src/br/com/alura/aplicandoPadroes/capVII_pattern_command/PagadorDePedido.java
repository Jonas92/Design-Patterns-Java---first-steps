package br.com.alura.aplicandoPadroes.capVII_pattern_command;

public class PagadorDePedido implements JobDePedido {

	private Pedido pedido;

	public PagadorDePedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		pedido.paga();
	}

}
