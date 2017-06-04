package Dr;


import Manage.gameManager;
import Information.Information;

public class Dr_T {
	static String toTeach;
	static int where;
	
	static public String Celebrate(){
		return "You cleared Stage"+gameManager.getRecentStage()+", Congratulations!";
	}
	static public String GetToTeach() {
		Dr_T.setToTeach(gameManager.getRecentStage());
		return toTeach;
	}
	static public void setToTeach(String t) {
		toTeach=t;
	}
	static public void setToTeach(int stage) {
		Information info = new Information(stage);
		toTeach=info.getToTeach();
	}
	static public int getWhere() {
		return where;
	}
	static public void setWhere(int w) {
		where = w;
	}
}
