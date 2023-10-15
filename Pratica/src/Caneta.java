
public class Caneta {
	String modelo;
	String Cor;
	double ponta;
	int carga;
	boolean tampada;

	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.Cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
//		if (this.tampada) {
//			System.out.println("A caneta está tampada!");
//		} else {
//			System.out.println("A caneta não está tampada!");
//		}
	}

	void rabiscar() {
		if (this.tampada) {
			System.out.println("Nao é possível rabiscar, estou tampada");
		}else {
			System.out.println("Rabiscado!!!");
		}
	}

	void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}
}
