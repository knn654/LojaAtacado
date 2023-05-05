package view;
import br.com.kaua.filaObject.*;
import controller.OperacaoController;
import model.Cliente;

public class Principal {
		public static void main(String[] args) {
			Fila fila = new Fila();
			Cliente c1 = new Cliente();
			c1.Nome = "Alice";
			c1.QuantidadePecas = 23;
			c1.ValorPecas = (float) 73.50;

			Cliente c2 = new Cliente();
			c2.Nome = "Bob";
			c2.QuantidadePecas = 35;
			c2.ValorPecas = (float) 15.80;

			Cliente c3 = new Cliente();
			c3.Nome = "Carla";
			c3.QuantidadePecas = 42;
			c3.ValorPecas = (float) 87.60;

			Cliente c4 = new Cliente();
			c4.Nome = "David";
			c4.QuantidadePecas = 20;
			c4.ValorPecas = (float) 45.00;

			Cliente c5 = new Cliente();
			c5.Nome = "Emma";
			c5.QuantidadePecas = 47;
			c5.ValorPecas = (float) 78.90;

			Cliente c6 = new Cliente();
			c6.Nome = "Frank";
			c6.QuantidadePecas = 25;
			c6.ValorPecas = (float) 66.70;

			Cliente c7 = new Cliente();
			c7.Nome = "Grace";
			c7.QuantidadePecas = 30;
			c7.ValorPecas = (float) 10.20;

			Cliente c8 = new Cliente();
			c8.Nome = "Henry";
			c8.QuantidadePecas = 48;
			c8.ValorPecas = (float) 24.50;

			Cliente c9 = new Cliente();
			c9.Nome = "Isabella";
			c9.QuantidadePecas = 22;
			c9.ValorPecas = (float) 57.30;

			Cliente c10 = new Cliente();
			c10.Nome = "John";
			c10.QuantidadePecas = 29;
			c10.ValorPecas = (float) 88.10;

			Cliente c11 = new Cliente();
			c11.Nome = "Kate";
			c11.QuantidadePecas = 37;
			c11.ValorPecas = (float) 33.20;

			Cliente c12 = new Cliente();
			c12.Nome = "Luke";
			c12.QuantidadePecas = 50;
			c12.ValorPecas = (float)  5.60;

			Cliente c13 = new Cliente();
			c13.Nome = "Maria";
			c13.QuantidadePecas = 21;
			c13.ValorPecas = (float) 42.80;

			Cliente c14 = new Cliente();
			c14.Nome = "Nathan";
			c14.QuantidadePecas = 44;
			c14.ValorPecas = (float) 92.10;

			Cliente c15 = new Cliente();
			c15.Nome = "Olivia";
			c15.QuantidadePecas = 26;
			c15.ValorPecas = (float) 18.90;

			Cliente c16 = new Cliente();
			c16.Nome = "Paul";
			c16.QuantidadePecas = 38;
			c16.ValorPecas = (float) 60.80;

			Cliente c17 = new Cliente();
			c17.Nome = "Queenie";
			c17.QuantidadePecas = 27;
			c17.ValorPecas = (float) 74.20;
			
			Cliente c18 = new Cliente();
			c18.Nome = "Alan";
			c18.QuantidadePecas = 32;
			c18.ValorPecas = (float) 70.50;

			Cliente c19 = new Cliente();
			c19.Nome = "Bella";
			c19.QuantidadePecas = 20;
			c19.ValorPecas = (float) 10.80;

			Cliente c20 = new Cliente();
			c20.Nome = "Caleb";
			c20.QuantidadePecas = 45;
			c20.ValorPecas = (float) 88.00;
			
			fila.insert(c1);
			fila.insert(c2);
			fila.insert(c3);
			fila.insert(c4);
			fila.insert(c5);
			fila.insert(c6);
			fila.insert(c7);
			fila.insert(c8);
			fila.insert(c9);
			fila.insert(c10);
			fila.insert(c11);
			fila.insert(c12);
			fila.insert(c13);
			fila.insert(c14);
			fila.insert(c15);
			fila.insert(c16);
			fila.insert(c17);
			fila.insert(c18);
			fila.insert(c19);
			fila.insert(c20);
			
			OperacaoController opCont = new OperacaoController();
			opCont.caixa(fila);
		}
		

	
}
