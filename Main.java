import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Double p,n,r,si;
        Scanner ac = new Scanner(System.in);

        System.out.println("Enter Principle Amount :");
        p = ac.nextDouble();

        System.out.println("Enter number of year :");
        n = ac.nextDouble();

        System.out.println("Enter Rate of Interest :");
        r = ac.nextDouble();

        si = (p*n*r)/100;
        System.out.println("Your Interest Is :"+si);

    }
}
