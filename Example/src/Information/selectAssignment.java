package Information;

public class selectAssignment extends Assignment{
	String solution;
	String[] wrong = new String[3];
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
