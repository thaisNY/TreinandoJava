import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int i = 1;
        System.out.println("Digite o num");
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
