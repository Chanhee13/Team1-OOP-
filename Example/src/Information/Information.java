package Information;

import java.util.ArrayList;

public class Information {
	private String ID;
	private String toTeach;
	private ArrayList<Assignment> assingments = new ArrayList<Assignment>();
	
	public Information(int stage){
		//String a = "stage "+stage;
		ID = "This is Information's ID";
		toTeach = "To teach something to do with stage "+stage;
		assingments.add(new OXAssignment(stage,0));
		assingments.add(new SelectAssignment(stage,1));
		assingments.add(new TypeAssignment(stage,2));
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
	//assingment�� ���� �ְų� ����, ��ȸ�� ���� ArrayList�� method�� add, remove�� ������ �Ѵ�. 
	//������   �ٸ� Ŭ�������� assingment ��ü�� ������ ������ ���� ��쿡�� getAssingment�� ����Ѵ�.
	public ArrayList<Assignment> getAssingments() {
		return assingments;
	}
	public void setAssingments(ArrayList<Assignment> assingments) {
		this.assingments = assingments;
	}

}
