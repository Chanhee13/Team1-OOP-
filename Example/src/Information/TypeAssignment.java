package Information;

public class TypeAssignment extends Assignment {
	String solution;
	
	TypeAssignment(int stage, int num){
		setProblem("This is Type problem "+num+" at stage "+stage);
		solution = "sol";
	}
	
	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}
	
}
