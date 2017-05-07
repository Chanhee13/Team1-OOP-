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
		/*질문이 아직 만들어지지 않았으니 빈칸으로 채우겠습니다.*/
	}
	
	public boolean isCorrect() {
		return false; //일단 return 필요해서 적어놨습니다.
	}
}
