import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner in=new Scanner(System.in);
  int arrsize=in.nextInt();
  int arr[]=new int[arrsize];
  for (int i=0;i<arrsize;i++)
  {
    arr[i]=in.nextInt();
  }
  int search1=in.nextInt();
  int search2=in.nextInt();
  int found=-1,found2=-1;
   for (int i=0;i<arrsize;i++)
   {
     if(search1==arr[i])
     {
       found=i;
     }
   
     if(search2==arr[i])
     {
       found2=i;
     }
    
   }
 System.out.println(found);
  System.out.println(found2);
  
  
}
}
