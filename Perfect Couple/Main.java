import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int val=in.nextInt();
      couple(n,arr,val);
    }
  public static void couple(int n,int arr[],int val)
  {
    
    int sum=0;
    for(int i=0;i<n;i++)
    {
      for(int i2=i+1;i2<n;i2++)
      {
        sum=arr[i]+arr[i2];
      
      if(sum==val)
      {
        System.out.println(arr[i]+","+" "+arr[i2]);
      }
      }
    }
  }
}