import java.util.*;
class Solution{
    public int maxminSum(int size,int[] array)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(array[i]>=max)
            {
                max=array[i];
            }
            if(array[i]<=min)
            {
                min=array[i];
            }
        }
        return min+max;
    }

}
public class SumMaxMin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i] = scanner.nextInt();
        }
        Solution solution=new Solution();
        System.out.println(solution.maxminSum(n,array));

    }
}

