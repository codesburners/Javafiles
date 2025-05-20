import java.util.*;
class subject {
     String subId;
     String subName;
     int maxMarks;
     int marksObtained;

     public String getSubId() {
         return subId;
     }

     public void setSubId(String subId) {
         this.subId = subId;
     }

     public String getsubName() {
         return subName;
     }

     public void setSubName(String subName) {
         this.subName = subName;
     }

     public int getMaxMarks() {
         return maxMarks;
     }

     public void setMaxMarks(int maxMarks) {
         this.maxMarks = maxMarks;
     }

     public int getMarksObtained() {
         return marksObtained;
     }

     public void setMarksObtained(int marksObtained) {
         this.marksObtained = marksObtained;
     }
     public subject(String subId,String subName,int maxMarks,int marksObtained)
     {
         setSubId(subId);
         setSubName(subName);
         setMaxMarks(maxMarks);
         setMarksObtained(marksObtained);
     }
 }
public class cons_prac3 {
    public static void main(String[] args) {
        /*
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the details of the students: ");
        String subId=s1.next();
        String subName=s1.next();
        int maxMarks=s1.nextInt();
        int marksObtained=s1.nextInt();
        subject s=new subject(subId,subName,maxMarks,marksObtained);
        System.out.println("The details of the student: ");
        System.out.println("Subject ID:"+s.getSubId());
        System.out.println("Subject Name: "+s.getsubName());
        System.out.println("Maximum Marks: "+s.getMaxMarks());
        System.out.println("Marks Obtained: "+s.getMarksObtained());

         */

        subject s[]=new subject[3];
        s[0]=new subject("S101","Java",100,90);
        s[1]=new subject("S102","Python",100,80);
        s[2]=new subject("S103","C++",100,70);
        for(subject sub:s){
            System.out.println(s);
        }
    }

}
