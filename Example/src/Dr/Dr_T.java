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
		//		Information File 뭉치을 순회하면서 recentStage에 맞는 Information을 얻어 옵니다.
		//
		// 지금은 파일이 없으므로 임시 값을 return하여 test해보자.
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
