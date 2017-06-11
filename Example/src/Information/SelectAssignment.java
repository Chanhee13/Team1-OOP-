package Information;

public class SelectAssignment extends Assignment{
	
	private String solution;
	private String[] wrong = new String[3];
	
	SelectAssignment(int stage, String pro ,  String sol, String[] wro){
		setProblem(pro);
		solution = sol;
		wrong[0]=wro[0];
		wrong[1]=wro[1];
		wrong[2]=wro[2];
		
	}
	
	
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public String[] getWrong() {
		return wrong;
	}
	public void setWrong(String[] wrong) {
		this.wrong = wrong;
	}


}
