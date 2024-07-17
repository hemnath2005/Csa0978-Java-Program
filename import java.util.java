import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
int n=input.nextInt();
int rev=0;
while(n!=0)
{
 int rem=n%10;
 rev=rev+rem;
 n=n/10;
 system.out.print(rev);
}
}
}