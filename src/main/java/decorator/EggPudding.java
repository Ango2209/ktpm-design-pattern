package decorator2;

public class EggPudding extends MilkTeaDecorator{

	public EggPudding(IMilkTea inner) {
		super(inner);
		
	}

	public double cost() {
		return 3d +iMilkTea.cost();
		
	}
}
