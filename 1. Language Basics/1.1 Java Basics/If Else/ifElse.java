import java.util.Scanner;

class ifElse {
    public void isAdult(int age){
        if(age >= 18){
            System.out.println("Adult");
        } else {
            System.out.println("Teen");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        ifElse obj = new ifElse();

        obj.isAdult(age);
    }
}
