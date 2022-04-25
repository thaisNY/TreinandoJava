import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ler n
        System.out.println("Digite o numero de pares lidos");
        int pares = sc.nextInt();
        for (int i = 0; i < pares; i++){
            System.out.println("Digite o dividendo");
            double d1 = sc.nextDouble();
            System.out.println("Digite o divisor");
            double d2 = sc.nextDouble();
            double res = d1/d2;
            if(d2 == 0){
                System.out.println("Eh impossivel!!");
                
            }
            
            System.out.println("Res = " + res);
        
        }
        sc.close();
    }
}
