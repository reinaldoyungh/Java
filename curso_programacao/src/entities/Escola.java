package entities;

public class Escola {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double notaFinal;
	
	public void calculaNota() {
		notaFinal = nota1 + nota2 + nota2;
	}
	
	public void avaliacao() {
		calculaNota();
		if (notaFinal >= 60) {
			System.out.println("Final Grade = "+notaFinal);
			System.out.println("PASS");
		} else {
			System.out.println("Final Grade = "+notaFinal);
			System.out.println("FAILED");
			System.out.println("Final Grade = "+ (60-notaFinal));
		}
	}
}
