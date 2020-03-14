import DAO.GerenteDAO;
import Models.GerenteModel;

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
        GerenteModel gerenteModel = new GerenteModel();
        gerenteModel.setId(1);
        gerenteModel.setNome("Victor");
        gerenteModel.setCPF("343.434.343-12");
        gerenteModel.setSalario(2000.00);

        ObjetoParaString(gerente);

        while(inseriu == false){
            System.out.println("Digite um Funcionario para inserir: ");
            inseriu = gerente.Insert(sn.nextLine(), "Arquivos/Funcionarios.txt");
            if(inseriu == true){

            }
            else{
                System.out.println("Funcionário já existe !");
            }
        }
    }

    public static String ObjetoParaString(Object objeto){
        System.out.println(objeto.getClass());
        return "Oi";
    }
}