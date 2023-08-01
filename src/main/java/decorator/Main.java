package decorator2;

public class Main {
  

public static void main(String[] args) {
	MilkTeaDecorator ourMilkTea = new EggPudding(new Bubble( new MilkTea()));
	System.out.println("EggPudding"+ ourMilkTea.cost());
}
}
