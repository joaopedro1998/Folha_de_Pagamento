package folha_pagamento;


public class empregados {
	
	private int Sindicato;
	private int Pagamento;
	private int Id;
	private int Id_Sindical;
	private int Metodo;
	
	private String Nome;
	private String Endereço;
	private int Tipo;
	
	private float Taxa;
	private float Salario;
	private float valor = 0;
	
	public empregados(String nome, String endereço, int id, int tipo, float salario, 
			int pagamento, int metodo,int sindicato,int id_sindical, float taxa)
	{
		this.Nome = nome;
		this.Endereço = endereço;
		this.Id = id;
		this.Tipo = tipo;
		this.Salario = salario;
		this.Pagamento = pagamento;
		this.Metodo = metodo;
		this.Sindicato = sindicato;
		this.Id_Sindical = id_sindical;
		this.Taxa = taxa;
	}
	float GetValor()
	{
		this.valor += Salario;
		this.valor *= (1 - this.Taxa);
		return this.valor;
	}
	void ZerarValor()
	{
		this.valor = 0;
	}
	int GetPagamento()
	{
		return this.Pagamento;
	}
	int GetId()
	{
		return this.Id;
	}
	
	String GetName()
	{
		return this.Nome;
	}
	
	void SetName(String name)
	{
		this.Nome = name;
	}
	
	void SetAdress(String adr)
	{
		this.Endereço = adr;
	}
	
	void SetID(int id)
	{
		this.Id = id;
	}
	
	void SetType(int t)
	{
		this.Tipo = t;
	}
	
	void SetSalary(float f)
	{
		this.Salario = f;
	}
	
	void SetMetodo(int m)
	{
		this.Metodo = m;
	}
	
	void SetSindicate(int i)
	{
		this.Sindicato = i;
	}
	
	void SetIDS(int i)
	{
		this.Id_Sindical = i;
	}
	
	void SetTax(float f)
	{
		this.Taxa = f;
	}
	
	void SetHoras(int hrs)
	{
		if(hrs<= 8)
		{
			this.valor += this.Salario*hrs;
			return;
		}
		this.valor += this.Salario*8;
		this.valor += (this.Salario*1.5)*(hrs-8);
	}
	
	void SetVenda(float value)
	{
		this.valor += value*0.05;
	}

}
