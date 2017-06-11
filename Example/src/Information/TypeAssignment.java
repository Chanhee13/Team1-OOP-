package Information;

public class TypeAssignment extends Assignment {
	String solution;
	
	TypeAssignment(int stage, String pro, String sol){
		this.setProblem(pro);
		this.setSolution(sol);
	}
	
	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		if(solution!=null){
			solution=solution.toLowerCase();
		}
		this.solution = solution;
	}
	
}
