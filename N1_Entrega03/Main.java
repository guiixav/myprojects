import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        TestaMetodos();
    }

    public static void TestaMetodos() throws IOException {
        GerenteDAO gerente = new GerenteDAO();
        Scanner sn = new Scanner(System.in);
        Boolean inseriu = false;



        while(inseriu == false){
            System.out.println("Digite um Funcionario para inserir: ");
            inseriu = gerente.Insert(sn.nextLine(), "Arquivos/Funcionarios.txt");
            if(inseriu == true){
                GerenteModel gerenteModel = new GerenteModel();
                gerenteModel.setId(1);
                gerenteModel.setNome("Victor");
                gerenteModel.setCPF("343.434.343-12");
                gerenteModel.setSalario(2000.00);

                System.out.println(String.valueOf(gerenteModel));
            }
            else{
                System.out.println("Funcionário já existe !");
            }
        }
    }

    public String ObjetoParaString(Object objeto){
        return "Oi";
    }
}