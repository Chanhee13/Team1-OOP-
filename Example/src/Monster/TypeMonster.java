package Monster;

public class TypeMonster extends Monster{
	private String guess;
	
	public String getguess() {
		return guess;
	}
	
	public void setguess(String guess) {
		this.guess = guess;
	}
	
	public void askProblem() {
		/*������ ���� ��������� �ʾ����� ��ĭ���� ä��ڽ��ϴ�.*/
	}
	
	public boolean isCorrect() {
		return false; //�ϴ� return �ʿ��ؼ� ��������ϴ�.
	}
}
