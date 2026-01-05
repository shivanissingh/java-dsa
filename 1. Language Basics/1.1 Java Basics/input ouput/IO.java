import java.util.Scanner;

class IO {
    public void printNumber(int num){
        System.out.println("Your Entered Number is : "+num);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        IO obj = new IO();
        obj.printNumber(num);

        sc.close();
    }
}
