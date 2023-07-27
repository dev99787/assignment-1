import java.util.Scanner;

public class intperform{
    int i;
    public void operation(){

      Scanner scn = new Scanner(System.in);
      System.out.println("Enter the value of i");
      i = scn.nextInt();
      this.i=i;

      if(i%2==1){
          System.out.println("Weird");
      }

      if(i%2==0){
          if(i>=2){
              if(i<=5){
                  System.out.println("Not Weird");

              }
          }
        }

      if(i%2==0){
          if(i>=6){
              if(i<=20){
          System.out.println("Weird");
              }
          }
      }


        if(i>20) {
          System.out.println("Not Weird");
      }
         
    }

    public static void main(String args[]){
        intperform p1 = new intperform();
        p1.operation();
    }
}