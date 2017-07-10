import java.util.*;
import java.io.*;
public class Range_of_primeno
{
  public static void main(String args[])
  {
    int n1,n2,n3,temp=0,i,j;
    Scanner s = new Scanner(System.in);
    System.out.println ("Enter the number of range of prime in n1 to n2:"); 
    n1 = s.nextInt();
    n2 = s.nextInt();
    //System.out.println ("The prime numbers in between the entered limits are :");
    for(i=n1;i<=n2;i++)
    {
      for(j=2;j<i;j++)
      {
        if(i%j==0)
        {
          temp=0;
          break;
        }
        else
        {
          temp=1;
        }
      }
      if(temp==1)
      {
        System.out.println(i);
      }
    }
  }
}  
    
