import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        Scanner input3=new Scanner(System.in);
        Scanner input4=new Scanner(System.in);
        System.out.println("tol satr:");
        int n =input1.nextInt();
        System.out.println("tol soton:");
        int m =input2.nextInt();

        int a[][]=new int[n][m];
        Random generator=new Random();

        for (int i=0;i<n;i++)
            for (int j=0 ; j<m ; j++)
            a[i][j]=generator.nextInt(100);
for (int i=0;i<n;i++)
    for (int j=0;j<m;j++) {
        System.out.print(a[i][j]);
        System.out.print("   ");

        if(j==m-1)
                System.out.println( );
    }
        System.out.println("moratabkardaan satr(c) ya soton(r)?");
        char q =input3.next().charAt(0);
    if(q == 'r') {
        System.out.println("soton shomare:");
        int w =input4.nextInt();
        for (int j=0;j<n-1;j++)
            for (int i=0;i<n-1;i++)
                if (a[i][w] > a[i + 1][w]) {
                    int x;
                    x = a[i][w];
                    a[i][w] = a[i + 1][w];
                    a[i + 1][w] = x;


                }
    }


       if(q =='c') {
           System.out.println("satr shomare:");
            int w = input4.nextInt();
           for (int j=0;j<m-1;j++)
               for (int i=0;i<m-1;i++)
                   if (a[w][i] > a[w][i + 1]) {
                       int x;
                       x = a[w][i];
                       a[w][i] = a[w][i + 1];
                       a[w][i + 1] = x;


                   }
        }
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++) {
                System.out.print(a[i][j]);
                System.out.print("   ");

                if(j==m-1)
                    System.out.println( );
            }
        }
}
