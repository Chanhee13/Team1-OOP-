package TeamProject;



public class Hero {
	
	private String Name;
	private boolean Gender; 
	private int HP;
	Item[] item; // Composed to �� ��쿡 Private �ؾߵ��� �򰥷��� �ϴ� �̷��� �ξ����ϴ�.
	
	public int pickSolution()
	{
		return 0; // �ϴ� ��� �������� ���������� �ʾƼ� ���� ������ ���ؼ� return 0 �߽��ϴ�.
	}
	
	public void useitem()
	{
		// Empty Method(�� �޼ҵ�)
	}
	
	//------------ getter & setter �κ��� Name�̶� Gender�� �����صξ����ϴ�.
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		if(name!=null)
		Name = name;
	}

	public boolean isGender() {
		return Gender;
	}

	public void setGender(boolean gender) {
		
		Gender = gender;
	}
	
	

}
