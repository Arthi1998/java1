import java.util.Scanner;

public class Evenodd
{
  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    int num = reader.nextInt();
    if ( num % 2 ==0 )
        System.out.println("even");
        else if(num > 0)
        System.out.println("odd");
     else
        System.out.println("invalid");
  }
}