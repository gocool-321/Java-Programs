import java.util.* ;
import java.io.* ;
/*Watch any of the favorite movie of your choice (any language is fine, preferably English).
 Create a Text file to store at least 10 meaningful dialogs from the movie and store it in a text file.
 Process the file to remove the stop words (eg. the, is, was, …….) and create another file to have clean text (word).
 //"From this website I came to know the stop words "
 //http://www.audiencedialogue.net/stopwords.html#:~:text=These%20very%20common%20words%20tell,referred%20to%20as%20%22stopwords%22.
 */
class StopWords
{
        public  String readfile()
        {
            try
            {
                File myObj = new File ("\\C:\\Users\\gokul\\OneDrive\\Desktop\\prgrms_java\\src\\Dialogue.txt");
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
        public void Stopworddetctor(){
            ArrayList<String> EditDialogues = new ArrayList<String>();
            ArrayList<String> NoDialogues = new ArrayList<String>();
            String[] x=readfile().split("\n",0);
            for(int i=0;i<x.length;i++)
            {
                NoDialogues.add(x[i]);
                EditDialogues.add(x[i].replaceAll(" the","").replaceAll("The","").replaceAll("Is","").replaceAll(" is","").replaceAll("Was","").replaceAll(" was",""));
            }
            System.out.println("{Before}          ---          {After}");
            for(int i=0;i<EditDialogues.size();i++)
            {
                System.out.println("{"+NoDialogues.get(i)+"} --- {"+EditDialogues.get(i)+"}");
            }
        }
}
public class prgrm4
{
    public static void main(String[] args) {
        StopWords sw=new StopWords();
        sw.Stopworddetctor();
    }
}
