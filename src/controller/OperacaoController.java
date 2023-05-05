package controller;

import br.com.kaua.filaObject.Fila;
import model.Cliente;

public class OperacaoController {

	public OperacaoController() {
		super();
	}
	
	public void caixa (Fila fila) {
		while (!fila.isEmpty()) {
			try {
				Cliente c = (Cliente) fila.remove();
				System.out.println("Nome: " + c.Nome);
				System.out.println("Valor das peças * Qtd peças: " + c.ValorPecas + " * " + c.QuantidadePecas);
				System.out.println("Valor total: " + c.ValorPecas * c.QuantidadePecas);
				System.out.println("");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
