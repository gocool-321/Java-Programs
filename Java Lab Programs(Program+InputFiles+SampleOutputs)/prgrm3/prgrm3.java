import java.util.* ;
import java.io.* ;
/*3--Create two classes named Student and Teacher with required data members.
Assume that the information about the Student and Teacher is stored in a text file.
Read n and m number of Student and Teacher information from the File.
Store the information in Arraylist of type Student and Teacher ArrayList<Student> and ArrayList<Teacher>.
 Print the information of Teacher who taught OOPS and Maths.
 Use Iterator and other functions of util in your program.*/
import java.util.*;
import java.io.*;
class StudentSelection
{
    public  String readfile()
    {
        try
        {
            File myObj = new File ("\\C:\\Users\\gokul\\OneDrive\\Desktop\\prgrms_java\\src\\studentfile.txt");
            Scanner myReader = new Scanner(myObj);
            String x="";
            String y="\n";
            while(myReader.hasNextLine())
            {
                String data=myReader.nextLine();
                x+=data;
                x=x+y;
            }
            myReader.close();
            return x;
        }
        catch (FileNotFoundException e)
        {
            return ("File we are searching for was not found!");
        }
    }
    public void selector(int m)
    {
        String x=readfile().replaceAll("\n",",");
        String[] y=x.split(",",0);
        ArrayList<String> Names = new ArrayList<String>();
        ArrayList<String> Subjects = new ArrayList<String>();
        for(int i=0;i<y.length;i++)
        {
            if(y[i].trim().startsWith("Name"))
            {
                Names.add(y[i]);
            }
            if(y[i].trim().startsWith("Subjects"))
            {
                Subjects.add(y[i]);
            }
        }
        int count=m - Names.size();
        if(count==0)
        {
            System.out.println("Reading n Integers Fully!");
        }
        else{
            if(count>0)
                System.out.println("Read only "+Names.size()+" Integers ");
            else
            {
                int countx= count * -1;
                System.out.println("Sry! Not fully read due to Limitation! ("+ countx +" Left to read)");
            }
        }
        System.out.println();
        int count1;
        if(count<0)
        {
            count1=m;
        }
        else
        {
                count1= Names.size();
        }
        for (int i = 0; i < count1; i++)
        {
            System.out.println(Names.get(i)+" | "+Subjects.get(i));
        }
        System.out.println();
        ArrayList<String> SelectedStudent = new ArrayList<String>();
        for (int i = 0; i < count1; i++)
        {
           // SelectedStudent.add(Subjects.get(i).split("+",0));
            if(Subjects.get(i).contains("Math") && Subjects.get(i).contains("Oops"))
            {
                SelectedStudent.add(Names.get(i));
            }
        }
        System.out.println("The Student who learned Oops and Maths are: ");
        for (int i = 0; i < SelectedStudent.size(); i++)
       {
            System.out.println(SelectedStudent.get(i));
       }
        System.out.println();
    }
}
class TeacherSelection
{
    public  String readfile()
    {
        try
        {
            File myObj = new File ("\\C:\\Users\\gokul\\OneDrive\\Desktop\\prgrms_java\\src\\Teacherfile.txt");
            Scanner myReader = new Scanner(myObj);
            String x="";
            String y="\n";
            while(myReader.hasNextLine())
            {
                String data=myReader.nextLine();
                x+=data;
                x=x+y;
            }
            myReader.close();
            return x;
        }
        catch (FileNotFoundException e)
        {
            return ("File we are searching for was not found!");
        }
    }
    public void selector(int m)
    {
        String x=readfile().replaceAll("\n",",");
        String[] y=x.split(",",0);
        ArrayList<String> Names = new ArrayList<String>();
        ArrayList<String> Subjects = new ArrayList<String>();
        for(int i=0;i<y.length;i++)
        {
            if(y[i].trim().startsWith("Name"))
            {
                Names.add(y[i]);
            }
            if(y[i].trim().startsWith("Teaches"))
            {
                Subjects.add(y[i]);
            }
        }
        int count=m - Names.size();
        if(count==0)
        {
            System.out.println("Reading m Integers Fully!");
        }
        else{
            if(count>0)
                System.out.println("Read only "+Names.size()+" Integers ");
            else {
                int countx= count * -1;
                System.out.println("Sry! Not fully read due to Limitation!"+ countx +" Left to read");
            }
        }
        System.out.println();
        int count1;
        if(count<0)
        {
            count1=m;
        }
        else
        {
            count1= Names.size();
        }
        for (int i = 0; i < count1; i++)
        {
            System.out.println(Names.get(i)+" | "+Subjects.get(i));
        }

        ArrayList<String> FacultySelected = new ArrayList<String>();
        for (int i = 0; i < count1; i++)
        {
            // SelectedStudent.add(Subjects.get(i).split("+",0));
            if(Subjects.get(i).contains("Math") && Subjects.get(i).contains("Oops"))
            {
                FacultySelected.add(Names.get(i));
            }
        }
        System.out.println();
        System.out.println("The Teachers who Teaches Oops and Maths are: ");
        for (int i = 0; i < FacultySelected.size(); i++)
        {
            System.out.println(FacultySelected.get(i));
        }
    }
}
public class prgrm3 {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n to select students");
        int n=sc.nextInt();
        System.out.println("Enter the value of m to select Teachers");
        int m=sc.nextInt();
        System.out.println("------------------------------------------------------------------------------------");
        TeacherSelection th=new TeacherSelection();
        StudentSelection st=new StudentSelection();
        st.selector(n);
        System.out.println("------------------------------------------------------------------------------------");
        th.selector(m);
    }
}