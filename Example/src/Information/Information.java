package Information;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

import Dr.Dr_T;

public class Information implements Serializable {
	private String ID;
	private String toTeach;
	private ArrayList<Assignment> assingments = new ArrayList<Assignment>();
	
	public Information(int stage){
		String f = "stage"+stage+".txt";
		try {
			File file = new File(f);
			FileReader read = new FileReader(file);
			BufferedReader br = new BufferedReader(read);
			
			String text;
			String copytext="";
			
			while((text = br.readLine())!=null)
			{
				copytext+=text;
				copytext+="\n";
			}
			//스테이지 지정
			String[] result = copytext.split("&");
			this.setID(result[0]);
			System.out.println("ID ID ID");
			System.out.println(result[0]);
			//가르칠 내용 지정
			this.setToTeach(result[1]);
			Dr_T.setToTeach(result[1]);
			System.out.println("여기확인");
			String sTemp = result[2];
			String[] preAssingments = sTemp.split(".^");
			System.out.println(preAssingments[0]);
			System.out.println(preAssingments[1]);
			System.out.println(preAssingments[2]);			
			
			//문제와 정답과 오답 설정
			for(String s : preAssingments){
				String[] tempStr = s.split(",");
				if(tempStr[0]=="ox"){
					boolean sol=true;
					if(tempStr[2]=="X"){
						sol=false;
					}
					assingments.add(new OXAssignment(Integer.parseInt(this.getID()),tempStr[1],sol));
				}
				if(tempStr[0]=="se"){
					String[] wro = {tempStr[3],tempStr[4],tempStr[5]};
					assingments.add(new SelectAssignment(Integer.parseInt(this.getID()),tempStr[1],tempStr[2],wro));
				}
				if(tempStr[0]=="ty"){
					assingments.add(new TypeAssignment(Integer.parseInt(this.getID()),tempStr[1],tempStr[2]));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

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
	
	//assingment에 값을 넣거나 빼고, 조회할 때는 ArrayList의 method인 add, remove를 쓰도록 한다. 
	//하지만   다른 클래스에서 assingment 전체의 정보를 얻어오고 싶은 경우에는 getAssingment를 사용한다.
	public ArrayList<Assignment> getAssingments() {
		return assingments;
	}
	
	public void setAssingments(ArrayList<Assignment> assingments) {
		this.assingments = assingments;
	}

}
