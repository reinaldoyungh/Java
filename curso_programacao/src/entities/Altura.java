package entities;

public class Altura {

		private String name;
		private int age;
		private double height;

		public Altura() {
		}
		
		public Altura(String name, int age, double height) {
			this.name = name;
			this.age = age;
			this.height = height;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}
		
		public double percent(int menor, double total) {
			return  menor / total * 100;
		}
		
}
