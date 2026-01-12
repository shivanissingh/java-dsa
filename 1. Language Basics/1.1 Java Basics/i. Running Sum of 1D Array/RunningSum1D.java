import java.util.Scanner;

class RunningSum1D {
    public int[] runningSum(int[] nums){
        /* My Approach - Optimal Solution
        
        int sum = 0 ;
        int[] result = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i] ;
            result[i] = sum ;
        }

        return result; // TC = O(n) & SC = O(n) */



        /* Approach 2
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            result[i] = result[i-1] + nums[i] ;
        }

        return result;   // TC = O(n) & SC = O(n) */



        //Approach 3 - More Optimized Approach by GPT

        for(int i = 1 ; i < nums.length ; i++){
            nums[i] += nums[i-1];
        }

        return nums; // TC = O(n) & SC = O(1)

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in) ;

        int size = sc.nextInt();
        
        int[] nums = new int[size];
        for(int i = 0 ; i < size ; i++){
            nums[i] = sc.nextInt();
        }

        RunningSum1D obj = new RunningSum1D();

        int[] finalResult = obj.runningSum(nums);

        for(int i = 0; i < size ; i++){
            System.out.print(finalResult[i] +" ");
        }

        sc.close();

    }
}
