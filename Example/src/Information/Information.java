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
	//assingment�� ���� �ְų� ����, ��ȸ�� ���� ArrayList�� method�� add, remove�� ������ �Ѵ�. 
	//������   �ٸ� Ŭ�������� assingment ��ü�� ������ ������ ���� ��쿡�� getAssingment�� ����Ѵ�.
	public ArrayList<Assignment> getAssingment() {
		return assingment;
	}
	public void setAssingment(ArrayList<Assignment> assingment) {
		this.assingment = assingment;
	}

}
