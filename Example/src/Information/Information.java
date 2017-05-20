package Information;

import java.util.ArrayList;

public class Information {
	private String ID;
	private String toTeach;
	private ArrayList<Assignment> assingment = new ArrayList<Assignment>();
	
	public Information(int stage){
		//String a = "stage "+stage;
		ID = "This is Information's ID";
		toTeach = "To teach something to do with stage"+stage;
		assingment.add(new OXAssignment(stage,1));
		assingment.add(new selectAssignment(stage,2));
		assingment.add(new TypeAssignment(stage,3));
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getToTeach() {
		return toTeach;
	}
	public void setToTeach(String toTeach) {
		this.toTeach = toTeach;
	}
	//assingment에 값을 넣거나 빼고, 조회할 때는 ArrayList의 method인 add, remove를 쓰도록 한다. 
	//하지만   다른 클래스에서 assingment 전체의 정보를 얻어오고 싶은 경우에는 getAssingment를 사용한다.
	public ArrayList<Assignment> getAssingment() {
		return assingment;
	}
	public void setAssingment(ArrayList<Assignment> assingment) {
		this.assingment = assingment;
	}

}
