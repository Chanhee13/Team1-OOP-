package Dr;


import Manage.gameManager;


public class Dr_T {
	static String toTeach;
	static int where;
	
	static public String Celebrate(){
		return "You cleared Stage"+gameManager.getRecentStage()+", Congratulations!";
	}
	static public String GetToTeach() {
		return toTeach;
	}
	static public void setToTeach(String t) {
		toTeach=t;
	}
	static public int getWhere() {
		return where;
	}
	static public void setWhere(int w) {
		where = w;
	}
}
