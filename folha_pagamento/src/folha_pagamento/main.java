package folha_pagamento;
import java.util.*;

public class main {

	public static void main(String[] args) {
		
		ArrayList<empregados> empregados = new ArrayList<empregados>();
		ArrayList<Agenda> agenda = new ArrayList<Agenda>();
		
		Agenda a = new Agenda(1,5);
		agenda.add(a);
		Agenda b = new Agenda(3,30);
		agenda.add(b);
		Agenda c = new Agenda(2,5);
		agenda.add(c);
		
		
		Scanner input = new Scanner(System.in);
		int pagamento = 0;
		int aux2,aux3;
		int flag = 100;
		int id = 0;
		int id_sindical;
		int id_sindi = 0, i, x;
		String str;
		int it,it2,hrs;
		float ft;
		float taxa;
		int number;
		int dia = 0;
		int metodo = 0;
		int conf;
		
		
		while(flag != 0)
		{
			if(flag == 100)
			{
				System.out.println("----------------------------");
				System.out.println("----------------------------");
				System.out.println("Escolha uma das opções:");
				System.out.println("[1]Adicionar um empregado");
				System.out.println("[2]Remover um empregado");
				System.out.println("[3]Alterar dados de um empregado");
				System.out.println("[4]Lançar um cartão de ponto");
				System.out.println("[5]Lançar um resultado de venda");
				System.out.println("[6]Lançar uma taxa de serviço");
				System.out.println("[7]Rodar folha de pagamento");
				System.out.println("[8]Visualizar agenda de pagamento");
				System.out.println("[9]Criar nova agenda de pagamento");
				System.out.println("----------------------------");
				System.out.println("----------------------------");
				
				flag = input.nextInt();
				if(flag > 9 || flag < 1)
				{
					flag = 100;
				}
			}
			
			if(flag == 1) //adicionar
			{
				System.out.println("----------------------------");
				System.out.println("----------------------------");
				System.out.println("Nome: ");
				input = new Scanner(System.in);
				String nome = input.nextLine();
				System.out.println("Endereço: ");
				input = new Scanner(System.in);
				String endereço = input.nextLine();
				System.out.println("Seu Id será " + id);
				System.out.println("Qual o tipo do empregado?");
				System.out.println("[1]Horista");
				System.out.println("[2]Assalariado");
				System.out.println("[3]Comissionado");
				int tipo = input.nextInt();
				if(tipo == 1)
				{
					pagamento = 0;
				}
				else if(tipo == 2)
				{
					pagamento = 1;
				}
				else if(tipo == 3)
				{
					pagamento = 2;
				}
				System.out.print("Você será pago ");
				agenda.get(metodo).requisition();
				System.out.println("Qual o método de pagamento?");
				System.out.println("[1]Cheque pelo correio");
				System.out.println("[2]Cheque em mãos");
				System.out.println("[3]Conta bancária");
				metodo = input.nextInt();
				System.out.println("Quanto é o seu salário?");
				float salario = input.nextFloat();
				System.out.println("Ele participa do sindicato?");
				System.out.println("[1]Sim");
				System.out.println("[2]Não");
				int sindicato = input.nextInt();
				if(sindicato == 1)
				{
					System.out.println("Quanto a taxa que ele paga(em decimal)?");
					taxa = input.nextFloat();
					id_sindical = id_sindi;
					System.out.println("Seu Id Sindical será "+id_sindical);
					++id_sindi;
				}
				else
				{
					id_sindical = -1;
					taxa = 1;
				}
				System.out.println("Você confirma a adição desse empregado?");
				System.out.println("[1]Sim");
				System.out.println("[2]Não");
				conf = input.nextInt();
				if(conf == 1)
				{
					flag = 100;
					empregados E = new empregados(nome,endereço,id,tipo,salario,pagamento,metodo,sindicato,id_sindical,taxa);
					empregados.add(E);
					++id;
				}
				else
				{
					System.out.println("Gostaria de Refazer ou voltar ao menu?");
					System.out.println("[1]Refazer");
					System.out.println("[2]Voltar ao Menu");
					
					conf = input.nextInt();
					
					if(conf == 2)
					{
						flag = 100;
					}
				}
				
				
				System.out.println("----------------------------");
				System.out.println("----------------------------");
				
			}
			else if(flag == 2) //remover 
			{
				System.out.println("----------------------------");
				System.out.println("----------------------------");
				System.out.println("Qual o id do usuário que você deseja remover?");
				number = input.nextInt();
				x = -1;
				for(i = 0; i < empregados.size();++i)
				{
					if(empregados.get(i).GetId() == number)
					{
						x = i;
						break;
					}
				}
				if(x == -1)
				{
					System.out.println("Empregado não encontrado!");
				}
				else
				{
					System.out.println("Você tem certeza que quer excluir o usuário " + empregados.get(x).GetName());
					System.out.println("[1]Sim");
					System.out.println("[2]Não");
					int aux = input.nextInt();
					if(aux == 1)
					{
						flag = 100;
						empregados.remove(x);
					}
					else
					{
						System.out.println("Gostaria de Refazer ou ir ao Menu?");
						System.out.println("[1]Refazer");
						System.out.println("[2]Voltar ao Menu");
						
						conf = input.nextInt();
						
						if(conf == 2)
						{
							flag = 100;
						}
					}
					
				}
				System.out.println("----------------------------");
				System.out.println("----------------------------");
			}
			else if(flag == 3) //alterar
			{
				System.out.println("----------------------------");
				System.out.println("----------------------------");
				System.out.println("Qual o id do usuário que você deseja Alterar?");
				number = input.nextInt();
				x = -1;
				for(i = 0; i < empregados.size();++i)
				{
					if(empregados.get(i).GetId() == number)
					{
						x = i;
						break;
					}
				}
				if(x == -1)
				{
					System.out.println("Empregado não encontrado!");
				}
				else
				{
					System.out.println("Escolha uma das opções a seguir?");
					System.out.println("[1]Nome");
					System.out.println("[2]Endereço");
					System.out.println("[3]id");
					System.out.println("[4]tipo");
					System.out.println("[5]Salário");
					System.out.println("[6]Método de Pagamento");
					System.out.println("[7]Participação no Sindicato");
					System.out.println("[8]Id Sindical");
					System.out.println("[9]Taxa");
					
					int option = input.nextInt();
					
					System.out.println("Tem Certeza que deseja alterar este dado do Usuário "+empregados.get(x).GetName());
					System.out.println("[1]Sim");
					System.out.println("[2]Não");
					conf = input.nextInt();
					
					if(conf == 1)
					{
					
						System.out.println("Escreva o novo nome/valor a ser alterado");
						
						switch (option) {
							case 1: input = new Scanner(System.in);
									str = input.nextLine();
									empregados.get(x).SetName(str);
								break;
							case 2: input = new Scanner(System.in);
									str = input.nextLine();
									empregados.get(x).SetAdress(str);
								break;
							case 3: it = input.nextInt();
									empregados.get(x).SetID(it);
								break;
							case 4: it = input.nextInt();
									empregados.get(x).SetType(it);
								break;
							case 5: ft = input.nextFloat();
									empregados.get(x).SetSalary(ft);
								break;
							case 6: it = input.nextInt();
									empregados.get(x).SetMetodo(it);
								break;
							case 7: it = input.nextInt();
									empregados.get(x).SetSindicate(it);
								break;
							case 8: it = input.nextInt();
									empregados.get(x).SetIDS(it);
								break;
							case 9: ft = input.nextFloat();
									empregados.get(x).SetTax(ft);
								break;
							default: System.out.println("Opção Inválida");
								break;
						}
					}
				}
				System.out.println("----------------------------");
				System.out.println("----------------------------");
				flag = 100;
				
			}
			else if(flag == 4)//cartão de ponto
			{
				System.out.println("----------------------------");
				System.out.println("----------------------------");
				System.out.println("Qual id do Usuário?");
				number = input.nextInt();
				x = -1;
				for(i = 0; i < empregados.size();++i)
				{
					if(empregados.get(i).GetId() == number)
					{
						x = i;
						break;
					}
				}
				if(x == -1)
				{
					System.out.println("Empregado não encontrado!");
				}
				else
				{
					System.out.println("Quantas horas ele trabalhou?");
					hrs = input.nextInt();
					empregados.get(x).SetHoras(hrs);
				}
				System.out.println("----------------------------");
				System.out.println("----------------------------");
				flag = 100;
			}
			else if(flag == 5) // resultado de venda
			{
				System.out.println("----------------------------");
				System.out.println("----------------------------");
				System.out.println("Qual id do Usuário?");
				number = input.nextInt();
				x = -1;
				for(i = 0; i < empregados.size();++i)
				{
					if(empregados.get(i).GetId() == number)
					{
						x = i;
						break;
					}
				}
				if(x == -1)
				{
					System.out.println("Empregado não encontrado!");
				}
				else
				{
					System.out.println("Quanto foi o valor da venda?");
					ft = input.nextFloat();
					empregados.get(x).SetVenda(ft);
				}
				System.out.println("----------------------------");
				System.out.println("----------------------------");
				flag = 100;
			}
			else if(flag == 6) // taxa de serviço
			{
				flag = 100;
				System.out.println("----------------------------");
				System.out.println("----------------------------");
				System.out.println("Qual id do Usuário?");
				number = input.nextInt();
				x = -1;
				for(i = 0; i < empregados.size();++i)
				{
					if(empregados.get(i).GetId() == number)
					{
						x = i;
						break;
					}
				}
				if(x == -1)
				{
					System.out.println("Empregado não encontrado!");
				}
				else
				{
					System.out.println("Qual será a sua nova taxa de serviço?");
					ft = input.nextFloat();
					empregados.get(x).SetTax(ft);
				}
				System.out.println("----------------------------");
				System.out.println("----------------------------");
			}
			else if(flag == 7)
			{
				++dia;
				flag = 100;
				for(i = 0;i<empregados.size();++i)
				{
					aux2 = empregados.get(i).GetPagamento();
					if(agenda.get(aux2).tipo == 1)
					{
						aux3 = dia%7;
						if(aux3 == agenda.get(aux2).dia)
						{
							System.out.println("----------------------------");
							System.out.println("O funcionário "+empregados.get(i).GetName() + " receberá R$" + empregados.get(i).GetValor());
							System.out.println("----------------------------");
						}
					}
					else if(agenda.get(aux2).tipo == 2)
					{
						aux3 = dia%14;
						if(aux3 == agenda.get(aux2).dia)
						{
							System.out.println("----------------------------");
							System.out.println("O funcionário "+empregados.get(i).GetName() + " receberá R$" + empregados.get(i).GetValor());
							System.out.println("----------------------------");
						}
					}
					else if(agenda.get(aux2).tipo == 3)
					{
						aux3 = dia%30;
						if(aux3 == agenda.get(aux2).dia)
						{
							System.out.println("----------------------------");
							System.out.println("O funcionário "+empregados.get(i).GetName() + " receberá R$" + empregados.get(i).GetValor());
							System.out.println("----------------------------");
						}
					}
				}
			}
			else if(flag == 8)
			{
				flag = 100;
				for(i=0;i<agenda.size();++i)
				{
					System.out.println("----------------------------");
					System.out.print(i + " ");
					agenda.get(i).requisition();
					System.out.println("----------------------------");
				}
			}
			else if(flag == 9)
			{
				flag = 100;
				System.out.println("----------------------------");
				System.out.println("Escolha uma das formas a seguir:");
				System.out.println("[1]Semanal");
				System.out.println("[2]Bi-Semanal");
				System.out.println("[3]Mensal");
				it = input.nextInt();
				if(it == 1 || it == 2)
				{
					System.out.println("Escolha entre os seguintes dias:");
					System.out.println("[1]Segunda");
					System.out.println("[2]Terça");
					System.out.println("[3]Quarta");
					System.out.println("[4]Quinta");
					System.out.println("[5]Sexta");
					System.out.println("[6]Sábado");
					System.out.println("[7]Domingo");
				}
				else if(it == 3)
				{
					System.out.println("Escolha o dia do mês que você gostaria de utilizar:");
				}
				it2 = input.nextInt();
				a = new Agenda(it,it2);
				agenda.add(a);
				System.out.println("----------------------------");
			}
			
		}

	}

}
