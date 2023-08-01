package decorator2;

public class Bubble extends MilkTeaDecorator{

	public Bubble(IMilkTea inner) {
		super(inner);
		
	}
	@Override
   public double cost() {
	return 1d+iMilkTea.cost();
	   
   }
}
