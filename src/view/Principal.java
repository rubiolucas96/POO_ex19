package view;

import controller.ControleFuncionario;
import model.Funcionario;

public class Principal {

	    public static void main(String[] args) {

	        Funcionario funcionario1 = ControleFuncionario.contrataFuncionario(1, "Soraia", 2000.00, "TempoIntegral", 40);
	        Funcionario funcionario2 = ControleFuncionario.contrataFuncionario(2, "Lucas", 1500.00, "TempoParcial", "08:00", "16:00");
	        Funcionario funcionario3 = ControleFuncionario.contrataFuncionario(3, "Gustavo", 1800.00, "Temporario", 31, 12, 2022);

	        // Imprimindo informações dos funcionários
	        System.out.println("Funcionário 1:");
	        System.out.println("Tipo de contrato: " + funcionario1.tipoContrato());
	        System.out.println("ID: " + funcionario1.getId());
	        System.out.println("Nome: " + funcionario1.getNome());
	        System.out.println("Salário: " + funcionario1.getSalario());
	        System.out.println("-----------------------------------------------------------------------------------------------------------" );

	        System.out.println("\nFuncionário 2:");
	        System.out.println("Tipo de contrato: " + funcionario2.tipoContrato());
	        System.out.println("ID: " + funcionario2.getId());
	        System.out.println("Nome: " + funcionario2.getNome());
	        System.out.println("Salário: " + funcionario2.getSalario());
	        System.out.println("-----------------------------------------------------------------------------------------------------------" );
	        System.out.println("\nFuncionário 3:");
	        System.out.println("Tipo de contrato: " + funcionario3.tipoContrato());
	        System.out.println("ID: " + funcionario3.getId());
	        System.out.println("Nome: " + funcionario3.getNome());
	        System.out.println("Salário: " + funcionario3.getSalario());
	        System.out.println("-----------------------------------------------------------------------------------------------------------" );
	    }
	}