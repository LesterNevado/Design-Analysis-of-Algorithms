import java.util.*;
public class Fibonacci_2BSCS2_Nevado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("A. Nonrecursive\nB. Recursive\nC. Exit");
            char method = input.next().charAt(0);

            if(method=='A'){
                System.out.print("Enter number of terms: ");
                int size = input.nextInt();
                int first = 0;
                int second = 1;
                for(int i = 1; i <= size; i++){
                    System.out.print(first + ", ");
                    int next = first + second;
                    first = second;
                    second = next;
                }
                System.out.println("\n");
            }

            if(method=='B'){
                System.out.print("Enter number of terms: ");
                int size = input.nextInt();
                for(int i = 0; i<size; i++){
                    System.out.print(fibonacci(i) + ", ");
                }
                System.out.println("\n");
            }

            if(method=='C')
            break;
        }
        System.out.println("Programmer's Name:\nLester D. Nevado");
        input.close();
    }
        
    public static int fibonacci (int n){
        if(n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
