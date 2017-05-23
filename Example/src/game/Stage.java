package game;

import Monster.Monster;

public class Stage {
	private int StageNumber;
	Monster[] monster = new Monster[24];

public void nextMonster()//다음 스테이지로 넘어가는 거 
{
	
}

public int getStageNumber() {
	return StageNumber;
}

public void setStageNumber(int stageNumber) {
	StageNumber = stageNumber;
}

}
