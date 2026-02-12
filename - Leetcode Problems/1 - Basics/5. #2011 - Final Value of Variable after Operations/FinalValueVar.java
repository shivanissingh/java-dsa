import java.util.Scanner;


class FinalValueVar {
    public int finalValueAfterOperations(String[] operations){
        int value = 0 ;
        int x = 0;
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].equals("x++")){
                value = x++ ;
            }
            else if(operations[i].equals("++x")){
                value = ++x;
            }
            else if(operations[i].equals("x--")){
                value = x--;
            }
            else{
                value = --x;
            }
        }

        return value ;

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String[] operations = new String[size];

        for(int i = 0 ; i < size ; i++){
            operations[i] = sc.next();
        }

        FinalValueVar obj = new FinalValueVar();

        int value = obj.finalValueAfterOperations(operations);

        System.out.println(value);

        sc.close();

    }
}
