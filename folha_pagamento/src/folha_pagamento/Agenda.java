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
				System.out.println("Toda Ter�a-feira");
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
				System.out.println("Todo S�bado");
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
				System.out.println("�s Segundas-feiras a cada 2 semanas");
			}
			else if(dia == 2)
			{
				System.out.println("�s Ter�as-feiras a cada 2 semanas");
			}
			else if(dia == 3)
			{
				System.out.println("�s Quartas-feiras a cada 2 semanas");
			}
			else if(dia == 4)
			{
				System.out.println("�s Quintas-feiras a cada 2 semanas");
			}
			else if(dia == 5)
			{
				System.out.println("�s Sextas-feiras a cada 2 semanas");
			}
			else if(dia == 6)
			{
				System.out.println("Aos S�bados a cada 2 semanas");
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
