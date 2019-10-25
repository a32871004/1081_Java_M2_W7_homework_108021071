import java.util.Scanner;

public class Main00 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        long n=sn.nextLong();
        double sum=0d;
        for(long i=1;i<=n;i++){
            sum=sum+1d/((2*i-1)*(2*i));
        }
        System.out.println(sum);
    }
}