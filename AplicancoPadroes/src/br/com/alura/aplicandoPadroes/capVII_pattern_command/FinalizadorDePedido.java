package br.com.alura.aplicandoPadroes.capVII_pattern_command;

public class FinalizadorDePedido implements JobDePedido {

	private Pedido pedido;

	public FinalizadorDePedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		pedido.finaliza();
	}

}
