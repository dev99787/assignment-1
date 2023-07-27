import java.util.Scanner;
public class lip{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the year");
        int year = scn.nextInt();
        boolean leap = false;

        if(year % 4 ==0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    leap = true;
                }
                else{
                    leap = false;
                }
            }
            else{
                    leap = true;
                }
        }
        else{
            leap = false;
        }
        if(leap){
            System.out.println(year + "year is leap year");
        }
        else{
            System.out.println(year + "year is not leap year");            
        }
    }
}