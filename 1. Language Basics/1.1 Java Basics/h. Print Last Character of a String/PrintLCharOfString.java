import java.util.Scanner;

class PrintLCharOfString {
    
    public char lastChar(String s){
        int size = s.length();

        return s.charAt(size-1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        PrintLCharOfString obj = new PrintLCharOfString();

        char result = obj.lastChar(s);

        System.out.println(result);
        
        sc.close();

    }
}
