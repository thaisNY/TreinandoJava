import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fat = 1;
        System.out.println("Numero fatorial: ");
        int n = sc.nextInt();
        
        for(int i = 1; i<= n; i++){
            fat = fat * i;
            
        }
        System.out.printf("%d ! = %d",n, fat);
        sc.close();
    }
}

// 3! = 3 * 2 * 1 
// 0 ! = 1 , 1! = 1
//n * (n - 1) *  (n - 2) * (n - 3)
