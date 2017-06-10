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
         //�������� ����
      
     
         result[0].trim();
         setID(result[0]);
         //����ĥ ���� ����
         setToTeach(result[1]);
         Dr_T.setToTeach(result[1]);
         String[] preAssingments = result[2].split(".");
         //������ ����� ���� ����
         String[] tempStr = result[2].split(",");
         
    
          
         for(int i=0;i<tempStr.length;i++){
        	 
        	 if(tempStr[i].equals("ox"))
        	 {
        		assingments.add(new OXAssignment(1,tempStr[i+1],true));
        	 }
        	 else if(tempStr[i].equals("\nox"))
        	 {
        		 assingments.add(new OXAssignment(1,tempStr[i+1],true));
        	 }
        	 if(tempStr[i].equals("\nse"))
        	 {
        		 String[] wro = { tempStr[i+3], tempStr[i+4], tempStr[i+5] };
        		 assingments.add(new SelectAssignment(2,tempStr[i+1],tempStr[i+2],wro));
        	 }
        	 if(tempStr[i].equals("\nty"))
        	 {
        		 assingments.add(new TypeAssignment(3,tempStr[i+1],"Test Solution"));
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
   
   //assingment�� ���� �ְų� ����, ��ȸ�� ���� ArrayList�� method�� add, remove�� ������ �Ѵ�. 
   //������   �ٸ� Ŭ�������� assingment ��ü�� ������ ������ ���� ��쿡�� getAssingment�� ����Ѵ�.
   public ArrayList<Assignment> getAssingments() {
      return assingments;
   }
   
   public void setAssingments(ArrayList<Assignment> assingments) {
      this.assingments = assingments;
   }

}