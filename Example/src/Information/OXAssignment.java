package Information;

public class OXAssignment extends Assignment {
	
	private boolean solution;
	
	OXAssignment(int stage, int num){
		setProblem("This is problem "+num+" at stage "+stage);
		solution = true;
	}
	
	public boolean getSolution() {
		return solution;
	}

	public void setSolution(boolean solution) {
		this.solution = solution;
	}
}
