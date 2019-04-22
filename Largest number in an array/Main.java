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
  //int search1=in.nextInt();
  //int search2=in.nextInt();
  int greatest=arr[0];
   for (int i=1;i<arrsize;i++)
   {
     if(greatest<arr[i])
     {
       greatest=arr[i];
     }
   }
    System.out.println(greatest);  
   

} 
}