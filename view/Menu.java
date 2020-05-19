package view;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int opc = 0;
		
		while(opc<=8) {
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("	1 - Listar todos os cursos		                     ");
        System.out.println("    2 - Listar todos os alunos 			                 ");
        System.out.println("    3 - Listar histórico do aluno       				 ");
        System.out.println("    4 - Listar o relatório de rendimento de cada curso   ");
        System.out.println("    5 - Incluir um novo aluno                            ");
        System.out.println("    6 - Incluir um novo curso                            ");
        System.out.println("    7 - Incluir um novo rendimento                       ");
        System.out.println("    8 - Sair                       						 ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Selecione uma opção: ");
           
          opc = Integer.parseInt(scan.nextLine());
	        switch(opc) {
	        	case 1:
	        		ListaCursos lc = new ListaCursos();
	        		lc.exibirCursos();
	        		break;
	        	case 2:
	        		ListaAlunos la = new ListaAlunos();
	        		la.exibirAlunos();
	        		break;
	        	case 3:
	        		break;
	        	case 4:
	        		break;
	        	case 5:
	        		break;
	        	case 6:
	        		break;
	        	case 7:
	        		break;
	        	case 8:
	        		scan.close();
	        		break;
	        	default:
	        		break;
	        }
        }
	}
	
}
