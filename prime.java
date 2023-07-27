import java.util.Scanner;
class prime{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int i,count;
        System.out.println("enter value of n");
        int n = scn.nextInt();

        System.out.println("prime numbers are :");
        for(int j =2;j<=n;j++){
            count=0;
            for(i=1;i<=j;i++){
                if(j%i==0){
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(j+" ");
            }
        }

}
}