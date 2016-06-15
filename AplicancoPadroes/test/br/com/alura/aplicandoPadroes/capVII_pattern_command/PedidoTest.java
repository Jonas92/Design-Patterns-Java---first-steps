package br.com.alura.aplicandoPadroes.capVII_pattern_command;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class PedidoTest {

	private Pedido pedido;
	private GerenciadorDeJobsEmPedidos jobsEmPedidos;

	@Before
	public void inicializaTeste() {
		pedido = new Pedido("João das Couves", 350.0);
		jobsEmPedidos = new GerenciadorDeJobsEmPedidos();
	}

	@Test
	public void pagarPedido() {

		PagadorDePedido pagadorDePedido = new PagadorDePedido(pedido);

		jobsEmPedidos.adicionar(pagadorDePedido);
		jobsEmPedidos.executar();

		assertEquals(StatusPedido.PAGO, pedido.getStatusPedido());

	}

	@Test
	public void finalizarPedido() {

		FinalizadorDePedido finalizadorDePedido = new FinalizadorDePedido(pedido);

		jobsEmPedidos.adicionar(finalizadorDePedido);
		jobsEmPedidos.executar();

		assertEquals(StatusPedido.ENTREGUE, pedido.getStatusPedido());
		assertEquals(Calendar.getInstance().getTime(), pedido.getDataFinalizacao().getTime());

	}

	@Test
	public void finalizarEPagarVariosPedidos() {
		Pedido pedido2 = new Pedido("Jonas", 120.0);
		Pedido pedido3 = new Pedido("Marcos", 270.0);

		PagadorDePedido pagadorDePedidoUm = new PagadorDePedido(pedido);
		PagadorDePedido pagadorDePedidoDois = new PagadorDePedido(pedido2);
		PagadorDePedido pagadorDePedidoTres = new PagadorDePedido(pedido3);

		FinalizadorDePedido finalizaPedidoUm = new FinalizadorDePedido(pedido);
		FinalizadorDePedido finalizaPedidoDois = new FinalizadorDePedido(pedido2);
		FinalizadorDePedido finalizaPedidoTres = new FinalizadorDePedido(pedido3);

		jobsEmPedidos.adicionar(pagadorDePedidoUm);
		jobsEmPedidos.adicionar(pagadorDePedidoDois);
		jobsEmPedidos.adicionar(pagadorDePedidoTres);

		jobsEmPedidos.adicionar(finalizaPedidoUm);
		jobsEmPedidos.adicionar(finalizaPedidoDois);
		jobsEmPedidos.adicionar(finalizaPedidoTres);

		jobsEmPedidos.executar();

		assertEquals(StatusPedido.ENTREGUE, pedido.getStatusPedido());
		assertEquals(StatusPedido.ENTREGUE, pedido2.getStatusPedido());
		assertEquals(StatusPedido.ENTREGUE, pedido3.getStatusPedido());

		assertEquals(Calendar.getInstance().getTime(), pedido.getDataFinalizacao().getTime());
		assertEquals(Calendar.getInstance().getTime(), pedido2.getDataFinalizacao().getTime());
		assertEquals(Calendar.getInstance().getTime(), pedido3.getDataFinalizacao().getTime());

	}

}
