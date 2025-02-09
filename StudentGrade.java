import java.util.*;

class student{
  int rollnumb;
  String name;
  char gradeScore;

    public student(int rollnumb, String name, char gradeScore) {
        this.rollnumb = rollnumb;
        this.name = name;
        this.gradeScore = gradeScore;
    }

    public char getGradeScore() {
        return gradeScore;
    }

    public String getName() {
        return name;
    }

    public int getRollnumb() {
        return rollnumb;
    }
}
public class StudentGrade{
    public static void main(String args[]){
        int n;
        String name;
        char gradescore;
        try ( //arrayList
            Scanner sc = new Scanner(System.in)) {
            ArrayList<student> Students=new ArrayList<>();
            System.out.print("Enter number of students in class: ");
            int noOfStudents=sc.nextInt();
            float
             total=0,average;
            System.out.print("Enter total no. of subjects: ");
            n=sc.nextInt();
            for(int i=0;i<noOfStudents;i++){
                total=0;
                System.out.println("STUDENT " +(i+1)+" DETAILS--->");
                System.out.print("Enter student-"+(i+1)+" name: ");
                name=sc.next();
                System.out.print("Enter roll number of the student:");
                int rollnumb=sc.nextInt();
                double grades[]=new double[n];
                
                System.out.println("Enter the Grades (out of 100):");
                for(int j=0;j<n;j++){
                    System.out.print("Subject"+(j+1)+": ");
                    grades[j]=sc.nextDouble();
                    total=total+ grades[j];}
                
                int HighestScore=90;
                int LowestScore=30;
                for(int k=0;k<n;k++){
                    if(grades[k]>=HighestScore){
                        System.out.println("Congrats!!for scoring Highest marks in Subject"+(k+1)+".");
                    }
                    else if(grades[k]<=LowestScore){
                        System.out.println("Can Do better in Subject"+(k+1)+".");}
                    else{
                            
                    }
                }
                average=total/n;
                System.out.println("Average: "+average);
                if(average>=90 && average<=100){
                    System.out.println("GRADE A");
                    gradescore='A';
                }
                else if(average>=80 && average<90){
                    System.out.println("GRADE B");
                    gradescore='B';
                }
                else if(average>=70 && average<80){
                    System.out.println("GRADE C");
                    gradescore='C';
                }
                else if(average>=60 && average<70){
                    System.out.println("GRADE D");
                    gradescore='D';
                }
                else if(average>=30 && average<60){
                    System.out.println("GRADE E");
                    gradescore='E';
                }
                else {
                    System.out.println("GRADE F(FAIL)");
                    gradescore='F';
                    System.out.println("Better Luck Next Time!!");
                }
                student s1=new student(rollnumb,name,gradescore);
                Students.add(s1);
            }     display(Students);
        }
    }
    static void display(ArrayList<student> Students){
      System.out.println("Displaying all the Gradescores of students->");
      for(student s: Students){
      System.out.println("Name: "+s.getName()+ "  Roll number: "+s.getRollnumb()+"  Grade: "+s.getGradeScore());
    }
    }
}
