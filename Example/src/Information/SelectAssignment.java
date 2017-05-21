package Information;

public class SelectAssignment extends Assignment{
	int solutionNum;
	String solution;
	int wrongNum[]= {1,2,3};
	String[] wrong = new String[3];
	
	SelectAssignment(int stage, int num){
		setProblem("This is Select problem "+num+" at stage "+stage);
		solutionNum=0;
		solution = "solution";
		wrong[0]="wrong0";
		wrong[1]="wrong1";
		wrong[2]="wrong2";
		
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

	public int getSolutionNum() {
		return solutionNum;
	}

}
