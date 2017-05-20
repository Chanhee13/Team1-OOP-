package Information;

public class selectAssignment extends Assignment{
	String solution;
	String[] wrong = new String[3];
	
	selectAssignment(int stage, int num){
		setProblem("This is problem "+num+" at stage "+stage);
		solution = "solution";
		wrong[0]="wrong1";
		wrong[1]="wrong2";
		wrong[2]="wrong3";
		
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
