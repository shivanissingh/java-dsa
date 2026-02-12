import java.util.Scanner ;

class TargetArray {

    public int[] createTargetArray(int[] nums, int[] index){

        int[] target = new int[nums.length] ;
        int size = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            for(int j = size ; j > index[i] ; j--){
                target[j] = target[j-1] ;
            }

            target[index[i]] = nums[i] ;
            size++ ;
        }

        return target;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt() ;

        int[] nums = new int[size] ;
        int[] index = new int[size] ;

        for(int i = 0 ; i < size ; i++){
            nums[i] = sc.nextInt() ;
        }

        for(int i = 0 ; i < size ; i++){
            index[i] = sc.nextInt() ;
        }

        TargetArray obj = new TargetArray() ;

        int[] target = obj.createTargetArray(nums, index) ;

        for(int i = 0 ; i < size ; i++){
            System.out.print(target[i] +" ") ; 
        }

        sc.close() ;
    }
    
}
