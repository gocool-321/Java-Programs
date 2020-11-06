import java.util.*;
class prgrm5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char choice='1';
        int choicee;
        // creating a My HashTable Dictionary
        Hashtable<String, String> my_dict = new Hashtable<String, String>();
        Iterator<String> itr = my_dict.values().iterator();
        do {
            System.out.println("Menu\n1.Insert\n2.Search\n3.Display all\n4.exit\nEnter the choice");
            choice=in.nextLine().charAt(0);
            choicee= choice-'0';
            if(choicee == 1)
            {
                System.out.println("Enter key : ");
                String x = in.nextLine();
                System.out.println("Enter value : ");
                String y = in.nextLine();
                if(my_dict.containsKey(x))
                {
                    String ext= my_dict.get(x);
                    String ext1= y+" , "+ext;
                    my_dict.put(x, ext1);
                }
                else {
                    my_dict.put(x, y);
                }
            }
            else if(choicee == 2)
            {
                System.out.println("Enter key : ");
                String x = in.nextLine();
                System.out.println(my_dict.getOrDefault(x,"Not Available"));
            }
            else if(choicee == 3)
            {
                my_dict.forEach((k, v) -> System.out.println( k + " : " + v));
            }
            else if(choicee == 4)
            {
                System.out.println("Bye! Bye!");
            }
            else//if(choice=='1' || choice=='2' ||choice=='3')
            {
                System.out.println("Invalid Input");
            }
            System.out.println("-------------------");
        }while(choicee!=4);
    }
}