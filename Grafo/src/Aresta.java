
public class Aresta 
{
	// ver como representar direcionamento
	// private boolean direcionadoV1;
	// private boolean direcionadoV2;
	
	private double cost;
	// ideia de atual para percorrer e identificar de onde veio, util principalmente no caso de extender para digrafo
	private Vertice vAtual;
	private Vertice vProximo;
	
	public Aresta(){}
	
	//Link: ligacao entre v1  e v2 
	public void setLink(Vertice v1, Vertice v2)
	{
		this.vAtual = v1;
		this.vProximo = v2;
	}

	//Cost: custo/peso da aresta
	public void setCost(double c)
	{
		this.cost = c;
	}
	
	//Cost: custo/peso da aresta
	public double getCost()
	{
		return this.cost;
	}	
	
}//end
