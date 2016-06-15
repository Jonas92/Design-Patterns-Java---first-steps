package br.com.alura.aplicandoPadroes.capVII_pattern_command;

import java.util.Calendar;

public class Pedido {

	private double valor;
	private String nomeCliente;
	private StatusPedido statusPedido;
	private Calendar dataFinalizacao;

	public Pedido(String nomeCliente, double valor) {
		this.nomeCliente = nomeCliente;
		this.valor = valor;
		this.statusPedido = StatusPedido.NOVO;
	}

	public void paga() {
		statusPedido = StatusPedido.PAGO;
	}

	public void finaliza() {
		statusPedido = StatusPedido.ENTREGUE;
		dataFinalizacao = Calendar.getInstance();
	}

	public double getValor() {
		return valor;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}

}
