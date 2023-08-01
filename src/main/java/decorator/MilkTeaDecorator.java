package decorator2;

public abstract class MilkTeaDecorator implements IMilkTea{
     protected IMilkTea iMilkTea;
     
	public MilkTeaDecorator(IMilkTea inner) {
		super();
		this.iMilkTea = inner;
	}

	public double cost() {
		return iMilkTea.cost();
	}

}
