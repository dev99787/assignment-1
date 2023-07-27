import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;


public class occurchar {

    public static void main (String args[]){

        File file = new File ("count.char");

        try{
            FileWriter fw = new FileWriter("count.char");
            fw.write("hii i am dev");
            fw.write("\n");
            fw.write("from portugal");
            fw.close();
            FileInputStream fis = new FileInputStream(file);
            int i;
            int occurs = 0;
            char current;
            while ((i=fis.available()) > 0){
                current = (char)fis.read();
                if(current == 'i'){
                    occurs++;
                }
            }
            System.out.println("The number of i character repeated is : " + occurs);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}