package Information;

import java.util.ArrayList;

public class Information {
	private String ID;
	private String toTeach;
	private ArrayList<Assignment> assingment = new ArrayList<Assignment>();
	
	
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
