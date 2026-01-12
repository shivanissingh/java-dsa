import java.util.Scanner;

class RunningSum1D {
    public int[] runningSum(int[] nums){
        int[] result = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            result[i] += nums[i];
        }

        return result;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in) ;

        int size = sc.nextInt();
        
        int[] nums = new int[size];
        for(int i = 0 ; i < size ; i++){
            nums[i] = sc.nextInt();
        }

        RunningSum1D obj = new RunningSum1D();

        obj.runningSum(nums);

        sc.close();

    }
}
