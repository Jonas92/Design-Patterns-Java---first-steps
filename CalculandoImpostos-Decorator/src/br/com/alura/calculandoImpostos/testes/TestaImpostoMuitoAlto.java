package br.com.alura.calculandoImpostos.testes;

import br.com.alura.calculandoImpostos.impostos.Ikcv;
import br.com.alura.calculandoImpostos.impostos.ImpostoMuitoAlto;
import br.com.alura.calculandoImpostos.impostos.Iss;
import br.com.alura.calculandoImpostos.model.Orcamento;
import br.com.alura.calculandoImpostos.util.CalculadorDeImpostos;

public class TestaImpostoMuitoAlto {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(100);

		ImpostoMuitoAlto impostoMuitoAlto = new ImpostoMuitoAlto(new Iss());
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

		System.out.println(calculadorDeImpostos.calcular(impostoMuitoAlto, orcamento));

		Ikcv ikcv = new Ikcv(impostoMuitoAlto);
		System.out.println(calculadorDeImpostos.calcular(ikcv, orcamento));
	}
}
