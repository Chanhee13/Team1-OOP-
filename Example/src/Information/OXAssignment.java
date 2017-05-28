package Information;

public class OXAssignment extends Assignment {
	
	private boolean solution;
	
	OXAssignment(int stage, String pro, boolean sol){
		setProblem(pro);
		solution = sol;
	}
	
	public boolean getSolution() {
		return solution;
	}

	public void setSolution(boolean solution) {
		this.solution = solution;
	}
}
