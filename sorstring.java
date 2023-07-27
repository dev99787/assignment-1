import java.util.*;
class sorstring{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the string");
        String str = scn.nextLine();
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);

    }
}