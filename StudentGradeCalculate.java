import java.util.Scanner;

class Result{
    private int subjects[];
    private int mark,total=0,average;
    private char grade;

    void inputMarks()
    {
        System.out.print("\nEnter the number of subjects you have :");
        Scanner ip=new Scanner(System.in);
        int subject=ip.nextInt();
        subjects=new int[subject];
        System.out.println("Enter the marks of each subject.");
        for(int i=0;i<subjects.length;i++)
        {
            System.out.print("Subject-"+(i+1)+":");
                mark=ip.nextInt();
            while(!(mark>=0 && mark<=100)){
                System.out.println("Please enter the mark between 0 to 100");
                mark=ip.nextInt();           
            }
            subjects[i]=mark;
           
        }
    }

    int averageCalculate()
    {
        for(int i=0;i<subjects.length;i++)
        {            
            total=total+subjects[i];
        }
        return (total/subjects.length);
    }   

    char gradeCalculate()
    {
      if(average>=90)
      {
        return 'O';
      }
      else if(average<90 && average>=80)
      {
        return 'A';
      }
      else if (average<80 && average>=70) 
      {
        return'B'; 
      }
      else if (average<70 && average>=60) 
      {
        return 'C';
      }
      else if (average<60 && average>=50) 
      {
        return 'D';  
      }
      else if (average<50 && average>=40) 
      {
        return 'E';  
      }
      else
      {
        return 'F';
      }
    }

    void displayResult()
    {
      average=averageCalculate();
      grade=gradeCalculate();
      System.out.println("\n\t==========================================");
      System.out.println("\t\tTotal Marks      :"+total);
      System.out.println("\t\tAverge Percentage:"+average);
      System.out.println("\t\tYour Grade is    :"+grade);
      System.out.println("\t==========================================");
    }
}

public class StudentGradeCalculate{
    public static void main(String args[])
    {
        Result r=new Result();
        r.inputMarks();
        r.displayResult();
    }
    
}
