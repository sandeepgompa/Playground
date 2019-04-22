import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int left=0,right=n-1,k=0;
      while(left<right)
      {
        if(arr[left]==arr[right])
        {
          k=1;
          left++;
          right--;
        }
        else
        {
          k=0;
          break;
        }
      }
      if(k==1)
        System.out.print("Yes");
      else
        System.out.print("No");
        
    }
}