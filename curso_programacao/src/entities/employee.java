package entities;

public class employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double newSalary;
	
	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percent) {
		double aumento = grossSalary * (percent/100);
		double newSalary = (grossSalary + aumento) - tax;
		System.out.print("Updated data: "+name+", $ "+ newSalary);
	}	
	
}
