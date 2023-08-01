package decorator;

public class Main {

	public static void main(String[] args) {
		TVContext context=new TVContext();
		State tvStartState=new TVStartState();
		State tvStopState=new TVStopState();
		context.setTvState(tvStopState);
		context.doAction();
		context.setTvState(tvStartState);
		context.doAction();

	}

}
