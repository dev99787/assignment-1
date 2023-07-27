import java.io.*;
class maxword
{
 
    static String maxWord = "";
 
    static void MaxLengthWords(String input)
    {
          input=input.trim();
         
        int len = input.length();
        int si = 0, ei = 0; //start index, end index
        int max_length = 0, max_start_index = 0;
 
        while (ei <= len)
        {
            if (ei < len && input.charAt(ei) != ' ')
            {
                ei++;
            }
            else
            {
                int curr_length = ei - si;
 

 
                if (curr_length > max_length)
                {
                    max_length = curr_length;
                    max_start_index = si;
                }
                ei++;
                si = ei;
            }
        }
 
        maxWord = input.substring(max_start_index, max_start_index+max_length);
    }
 
    public static void main(String[] args)
    {
        String a = "hello i am national footballer";
 
        MaxLengthWords(a);

        System.out.print("\nMaximum length word: "+ maxWord);
    }
}