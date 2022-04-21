package ProjetoHospital;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Bem vindo ao sistema do hospial");
        Scanner sc = new Scanner(System.in);
        Medico medico;
        System.out.println("Digite o nome do medico");
        String nome = sc.nextLine();
        System.out.println("Digite a especialidade do medico");
        String especialidade = sc.nextLine();
        System.out.println("Digite o crm do medico");
        int crm = sc.nextInt();


        Paciente paciente;
        System.out.println("Digite o nome do paciente");
        String nomePaciente = sc.nextLine();
        System.out.println("Digite a idade do paciente");
        int idade = sc.nextInt();
        System.out.println("Digite o cpf do paciente");
        String cpf = sc.next();
        //Medico paciente.medicoAtendimento = medicoAtendimento; erro

}
