
public class Teste {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();

		c1.modelo = "Bic";
		c1.Cor = "Preta";
		c1.ponta = 1.5;
		c1.carga = 2;
		c1.tampada = true;
		
		
		c1.status();
		c1.rabiscar();
		
		System.out.println("Teste 2");
		System.out.println(" ");
		
		Caneta c2 = new Caneta();
		
		c2.modelo = "Pigma";
		c2.Cor = "Azul";
		c2.ponta = 1.2;
		c2.carga = 1;
		c2.tampada = true;
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
		
		
	}

}
