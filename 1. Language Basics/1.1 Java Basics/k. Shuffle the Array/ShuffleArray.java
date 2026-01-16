import java.util.Scanner;

class ShuffleArray {
    
    // GPT Approach
    public int[] shuffle1(int[] nums, int n) {
        System.out.println("");
        int result1[] = new int[2*n];
        int i = 0;
        int j = n;
        int k = 0;

        while ( i < n && j < 2*n) {
            result1[k++] = nums[i++];
            result1[k++] = nums[j++];
        }

        return result1;
    }


    // My Approach
    public int[] shuffle2(int[] nums, int n) {
        int[] result2 = new int[2*n];
        result2[0]= nums[0];
        result2[2*n-1] = nums[2*n-1];
        int temp;
        int j=1;
        for(int i=1 ; i<n ; i++ ){
            temp = nums[i];
            result2[j++] = nums[i + n-1];
            result2[j++] = temp;
        }
        
        return result2;
    }
    
    // Ishhh Approach
    public int[] shuffle3(int[] nums, int n) {
        int result3[] = new int[2*n];
        int j = 0;

        for(int i = 0; i < n; i = i+2) {
            result3[i] = nums[j];
            result3[i+1] = nums[n];
            j++;
            n++;
        }

        return result3;
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[2*n];

        for(int i = 0; i < 2*n; i++) {
            nums[i] = sc.nextInt();
        }

        ShuffleArray obj = new ShuffleArray();

        // GPT Approach
        int result1[] = obj.shuffle1(nums, n);
        System.out.println("*GPT Approach*");
        for(int i = 0; i < 2*n; i++) {
            System.out.print(result1[i]+" ");
        }
        System.out.println("");
        System.out.println("_______________________");
        System.out.println("");
        
        
        // My Approach
        int result2[] = obj.shuffle2(nums, n);
        System.out.println("*My Approach*");
        for(int i = 0; i < 2*n; i++) {
            System.out.print(result2[i]+" ");
        }
        System.out.println("");
        System.out.println("_______________________");

                // My Approach
        int result3[] = obj.shuffle3(nums, n);
        System.out.println("*Ishhh Approach*");
        for(int i = 0; i < 2*n; i++) {
            System.out.print(result3[i]+" ");
        }
        System.out.println("");
        System.out.println("_______________________");
        System.out.println("");
        sc.close();
    }
} 