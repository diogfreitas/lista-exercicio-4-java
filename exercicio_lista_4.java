package lista_quatro;

import java.util.Scanner;

public class exercicio_lista_4 {
	public static void main(String[] args) {

	String nome = "", cartaoVacinaEmDia = "", teveSintomasRecentemente = "", teveContatoComPessoasSintomaticas = "",
	        estaRetornandoViagem = "", orientacaoFinal = "";
	    int idade, contador = 0, porcentagemInfeccao = 0;
	    boolean erroTentativas = false;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Diagnostico H5N1");

	    System.out.println("Informe o seu nome: ");
	    nome = sc.nextLine();

	    System.out.println("Informe a sua idade: ");
	    idade = sc.nextInt();

	    // Começo as perguntas de sim e nao
	    do {
	      System.out.println("\nSeu cartão de vacina está em dia? Digite SIM ou NAO ?");
	      cartaoVacinaEmDia = sc.next().toUpperCase();
	      if (cartaoVacinaEmDia.equals("SIM") || cartaoVacinaEmDia.equals("NAO")) {
	        break;
	      } else {
	        contador++;
	        System.out.println("\nDigito inválido! Digite SIM ou NAO.");
	        if (contador == 3) {
	          erroTentativas = true;
	          break;
	        }
	      }
	    } while (true);

	    // Valido se continuo perguntando ou se vou direto para a mensagem final
	    if (erroTentativas == false) {
	      do {
	        System.out
	            .println("\nTeve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)" +
	                "Digite SIM ou NAO");
	        teveSintomasRecentemente = sc.next().toUpperCase();
	        if (teveSintomasRecentemente.equals("SIM") || teveSintomasRecentemente.equals("NAO")) {
	          break;
	        } else {
	          contador++;
	          System.out.println("\nDigito inválido! Digite SIM ou NAO.");
	          if (contador == 3) {
	            erroTentativas = true;
	            break;
	          }
	        }
	      } while (true);
	    }

	    if (erroTentativas == false) {

	      do {
	        System.out
	            .println("\nTeve contato com pessoas com sintomas gripais nos últimos dias?" +
	                "Digite SIM ou NAO");
	        teveContatoComPessoasSintomaticas = sc.next().toUpperCase();
	        if (teveContatoComPessoasSintomaticas.equals("SIM") || teveContatoComPessoasSintomaticas.equals("NAO")) {
	          break;
	        } else {
	          contador++;
	          System.out.println("\nDigito inválido! Digite SIM ou NAO.");
	          if (contador == 3) {
	            erroTentativas = true;
	            break;
	          }
	        }
	      } while (true);
	    }

	    if (erroTentativas == false) {
	      do {
	        System.out
	            .println("\nEstá retornando de viagem realizada no exterior?" +
	                "Digite SIM ou NAO");
	        estaRetornandoViagem = sc.next().toUpperCase();
	        if (estaRetornandoViagem.equals("SIM") || estaRetornandoViagem.equals("NAO")) {
	          break;
	        } else {
	          contador++;
	          System.out.println("\nDigito inválido! Digite SIM ou NAO.");
	          if (contador == 3) {
	            erroTentativas = true;
	            break;
	          }
	        }
	      } while (true);
	    }


	    // Valido se imprimo a mensagem de erro
	    if (erroTentativas == true) {
	      System.out.println("Não foi possível realizar o diagnóstico." +
	          "Gentileza procurar ajuda médica caso apareça algum sintoma.");
	    } else {

	      // Começo a incrementar a probabilidade/porcentagem
	      if (estaRetornandoViagem.equals("SIM")) {
	        porcentagemInfeccao += 30;
	        orientacaoFinal = "Você ficará sob observação por 05 dias.";
	      }

	      if (cartaoVacinaEmDia.equals("NAO")) {
	        porcentagemInfeccao += 10;
	      }

	      if (teveSintomasRecentemente.equals("SIM")) {
	        porcentagemInfeccao += 30;
	      }

	      if (teveContatoComPessoasSintomaticas.equals("SIM")) {
	        porcentagemInfeccao += 30;
	      }

	      // Verifico se a pessoa está retornando de viagem
	      if (estaRetornandoViagem.equals("SIM")) {
	        System.out.println("\nNome: " + nome);
	        System.out.println("Idade: " + idade + " anos");
	        System.out.println("Cartão Vacinal em Dia: " + cartaoVacinaEmDia);
	        System.out.println("Teve sintomas recentemente: " + teveSintomasRecentemente);
	        System.out.println("Teve contato com pessoas infectadas: " + teveContatoComPessoasSintomaticas);
	        System.out.println("Esta retornando de viagem: " + estaRetornandoViagem);
	        System.out.println("Porcentagem infecção: %" + porcentagemInfeccao);
	        System.out.println("Orientação Final: " + orientacaoFinal);
	      } else {

	        // Verifico a porcentagem de infecção
	        if (porcentagemInfeccao >= 90) {
	          orientacaoFinal = "Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.";
	          System.out.println("\nNome: " + nome);
	          System.out.println("Idade: " + idade + " anos");
	          System.out.println("Cartão Vacinal em Dia: " + cartaoVacinaEmDia);
	          System.out.println("Teve sintomas recentemente: " + teveSintomasRecentemente);
	          System.out.println("Teve contato com pessoas infectadas: " + teveContatoComPessoasSintomaticas);
	          System.out.println("Esta retornando de viagem: " + estaRetornandoViagem);
	          System.out.println("Porcentagem infecção: " + porcentagemInfeccao);
	          System.out.println("Orientação Final: " + orientacaoFinal);
	        } else if (porcentagemInfeccao <= 30) {
	          orientacaoFinal = "Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.";
	          System.out.println("\nNome: " + nome);
	          System.out.println("Idade: " + idade + " anos");
	          System.out.println("Cartão Vacinal em Dia: " + cartaoVacinaEmDia);
	          System.out.println("Teve sintomas recentemente: " + teveSintomasRecentemente);
	          System.out.println("Teve contato com pessoas infectadas: " + teveContatoComPessoasSintomaticas);
	          System.out.println("Esta retornando de viagem: " + estaRetornandoViagem);
	          System.out.println("Porcentagem infecção: " + porcentagemInfeccao);
	          System.out.println("Orientação Final: " + orientacaoFinal);
	        } else if (porcentagemInfeccao <= 60) {
	          orientacaoFinal = "Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.";
	          System.out.println("\nNome: " + nome);
	          System.out.println("Idade: " + idade + " anos");
	          System.out.println("Cartão Vacinal em Dia: " + cartaoVacinaEmDia);
	          System.out.println("Teve sintomas recentemente: " + teveSintomasRecentemente);
	          System.out.println("Teve contato com pessoas infectadas: " + teveContatoComPessoasSintomaticas);
	          System.out.println("Esta retornando de viagem: " + estaRetornandoViagem);
	          System.out.println("Porcentagem infecção: " + porcentagemInfeccao);
	          System.out.println("Orientação Final: " + orientacaoFinal);
	        } else {
	          orientacaoFinal = "Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.";
	          System.out.println("\nNome: " + nome);
	          System.out.println("Idade: " + idade + " anos");
	          System.out.println("Cartão Vacinal em Dia: " + cartaoVacinaEmDia);
	          System.out.println("Teve sintomas recentemente: " + teveSintomasRecentemente);
	          System.out.println("Teve contato com pessoas infectadas: " + teveContatoComPessoasSintomaticas);
	          System.out.println("Esta retornando de viagem: " + estaRetornandoViagem);
	          System.out.println("Porcentagem infecção: " + porcentagemInfeccao);
	          System.out.println("Orientação Final: " + orientacaoFinal);
	          
	          sc.close();
	          
	        }
	      }
	    }
	  }
	}