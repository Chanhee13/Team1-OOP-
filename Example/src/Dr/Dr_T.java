package Dr;

import Information.*;
import Manage.gameManager;


public class Dr_T {
	String toTeach;
	int where;
	
	public String Celebrate(){
		return "Congratulations!";
	}
	public String GetToTeach() {
		return toTeach;
	}
	public void setToTeach() {
		int recentStage = gameManager.getRecentStage();
		Information info = new Information(recentStage);
		
		//To Do:
		//		
		//		Information File ��ġ�� ��ȸ�ϸ鼭 recentStage�� �´� Information�� ��� �ɴϴ�.
		//
		//this.toTeach = toTeach;
		this.toTeach=info.getToTeach();;
	}
	public int getWhere() {
		return where;
	}
	public void setWhere(int where) {
		this.where = where;
	}
	
	
	
}
