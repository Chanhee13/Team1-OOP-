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
   private static ArrayList<Assignment> assingments = new ArrayList<Assignment>();
   
   public Information(int stage){
      String f = "stage"+stage+".txt";
      try {
         File file = new File(f);
         FileReader read = new FileReader(file);
         BufferedReader br = new BufferedReader(read);
      
         String text;
         String copytext="";
         String[] result = new String[100];
         while((text = br.readLine())!=null)
         {
            copytext +=text;
            copytext +="\n";
         }
         
         result = copytext.split("&");
         //스테이지 지정
      
         System.out.println(result[1]);
         result[0].trim();
         setID(result[0]);
         //가르칠 내용 지정
         setToTeach(result[1]);
         Dr_T.setToTeach(result[1]);
         String[] preAssingments = result[2].split(".");
         //문제와 정답과 오답 설정
         String[] tempStr = result[2].split(",");
         /*이부분은 for문을 통해서 addAssignment해야 되는 부분인데 for문이 돌지 않을 뿐더러
          * 오류가 있어서 잠시 보류중입니다.
          */
      
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