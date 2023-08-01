package decorator;

public class TVContext implements State{
    private State tvState;
    
	public State getTvState() {
		return tvState;
	}

	public void setTvState(State tvState) {
		this.tvState = tvState;
	}

	public void doAction() {
		this.tvState.doAction();
		
	}

}
