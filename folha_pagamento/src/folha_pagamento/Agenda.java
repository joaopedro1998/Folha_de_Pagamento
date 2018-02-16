package folha_pagamento;

public class Agenda {
	int tipo;
	int dia;
	
	public Agenda(int type, int day)
	{
		this.tipo = type;
		this.dia = day;
	}
	
	public void requisition()
	{
		if(tipo == 1)
		{
			if(dia == 1)
			{
				System.out.println("Toda Segunda-feira");
			}
			else if(dia == 2)
			{
				System.out.println("Toda Terça-feira");
			}
			else if(dia == 3)
			{
				System.out.println("Toda Quarta-feira");
			}
			else if(dia == 4)
			{
				System.out.println("Toda Quinta-feira");
			}
			else if(dia == 5)
			{
				System.out.println("Toda Sexta-feira");
			}
			else if(dia == 6)
			{
				System.out.println("Todo Sábado");
			}
			else if(dia == 7)
			{
				System.out.println("Todo Domingos");
			}
		}
		else if(tipo == 2)
		{
			if(dia == 1)
			{
				System.out.println("Às Segundas-feiras a cada 2 semanas");
			}
			else if(dia == 2)
			{
				System.out.println("Às Terças-feiras a cada 2 semanas");
			}
			else if(dia == 3)
			{
				System.out.println("Às Quartas-feiras a cada 2 semanas");
			}
			else if(dia == 4)
			{
				System.out.println("Às Quintas-feiras a cada 2 semanas");
			}
			else if(dia == 5)
			{
				System.out.println("Às Sextas-feiras a cada 2 semanas");
			}
			else if(dia == 6)
			{
				System.out.println("Aos Sábados a cada 2 semanas");
			}
			else if(dia == 7)
			{
				System.out.println("Aos Domingos a cada 2 semanas");
			}
		}
		else if(tipo == 3)
		{
			System.out.println("Mensalmente no dia "+ dia);
		}
	}
}
