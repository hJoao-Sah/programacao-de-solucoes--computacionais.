package tempo;

public class Main {
	public static void main(String[] args) {
		Tempo tempo_1 = new Tempo();
		Tempo tempo_2 = new Tempo(15);
		Tempo tempo_3 = new Tempo(10, 30);
		Tempo tempo_4 = new Tempo(12, 45, 30);

		System.out.println("Tempo 1: " + tempo_1);
		System.out.println("Tempo 2: " + tempo_2);
		System.out.println("Tempo 3: " + tempo_3);
		System.out.println("Tempo 4: " + tempo_4);
	}
}
