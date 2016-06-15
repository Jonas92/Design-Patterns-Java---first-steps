package br.com.alura.aplicandoPadroes.capVII_pattern_command;

import java.util.ArrayList;
import java.util.Collection;

public class GerenciadorDeJobsEmPedidos {

	private Collection<JobDePedido> jobs = new ArrayList<>();

	public void adicionar(JobDePedido comando) {
		jobs.add(comando);
	}

	public void executar() {
		for (JobDePedido comando : jobs) {
			comando.executa();
		}
	}

}
