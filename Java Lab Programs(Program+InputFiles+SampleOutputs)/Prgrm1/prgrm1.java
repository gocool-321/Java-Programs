import java.util.* ;
import java.io.* ;
/*
1. Declare a class named Teacher. The class will have all the data members as per your convenient.
-->The class will have constructors. Write a function to read the values of the class variables. Done
-->The values of the variable will be stored in a FILE (text file). Done
-->The values will be stored in a structured format of your own choice.
Further, read the content of the FILE and display the content in an ordered form (First Name, Last Name).
 */
class Teacher
{
    public String readfile()
    {
        try
        {
            File myObj = new File ("\\C:\\Users\\gokul\\OneDrive\\Desktop\\prgrms_java\\src\\filename.txt");
            Scanner myReader = new Scanner(myObj);
            String x="";
            while(myReader.hasNextLine())
            {
                String data=myReader.nextLine();
                x+=data;
                //System.out.println(data);
            }
            myReader.close();
            return x;
        }
        catch (FileNotFoundException e)
        {
            return ("File we are searching for was not found!");
        }
    }
    public void condition(String a1,String a2,String a3,String a4)
    {
        String x=readfile().replaceAll(a1,"@@");
        String y=(String) x.replaceAll(a2,"@@").replaceAll(a3,"@@").replaceAll(a4,"@@");
        String[] z= y.split("@@",0 );
        System.out.println(a1+" :");
        int q=1;
        /*for(int i=1;i<z.length;i++)
        {
            System.out.println(i+"  "+z[i]);
        }*/
        q=1;
        for(int i=1;i<z.length;i=i+4)
        {
            System.out.println(q+"  "+z[i]);
            q++;
        }
        System.out.println();
        System.out.println(a2+" :");
        q=1;
        for(int i=2;i<z.length;i=i+4)
        {
            System.out.println(q+"  "+z[i]);
            q++;
        }
        System.out.println();
        System.out.println(a3+" :");
        q=1;
        for(int i=3;i<z.length;i=i+4)
        {
            System.out.println(q+"  "+z[i]);
            q++;
        }
        System.out.println();
        System.out.println(a4+" :");
        q=1;
        for(int i=4;i<z.length;i=i+4)
        {
            System.out.println(q+"  "+z[i]);
            q++;
        }
    }
}
public class prgrm1 {
    public static void main(String[] args)
    {
        System.out.println("Enter the Names of the Sub-heading sequentially: (Maximum 4 Only):");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Sub-heading:");
        String a1=sc.nextLine();
        System.out.println("Enter Second Sub-heading:");
        String a2=sc.nextLine();
        System.out.println("Enter Third Sub-heading:");
        String a3=sc.nextLine();
        System.out.println("Enter Fourth Sub-heading:");
        String a4=sc.nextLine();
        Teacher x=new Teacher();
        x.condition(a1,a2,a3,a4);
    }
}