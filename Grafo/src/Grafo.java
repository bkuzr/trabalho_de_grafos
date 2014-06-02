import java.util.ArrayList;

public class Grafo {

	private ArrayList<Vertice> _arrayVertice;
	private int _ordem;

	public Grafo() {
		_ordem = 10;
	}

	public void adicionaVertice(Vertice v) {
		// "Adiciona um novo v�rtice em G"
	}

	public void removeVertice(Vertice v) {
		// "Remove um  v�rtice de G, juntamente com todas as conex�es"
		v.limpaVertice();
		_arrayVertice.remove(v);
	}

	public void conecta(Vertice v1, Vertice v2) {
		// "Conecta os v�rtices v1 e v2 em G"
		v1.adicionaAdjacente(v2);
		v2.adicionaAdjacente(v1);
	}

	public void desconecta(Vertice v1, Vertice v2) {
		// "Desconecta os v�rtices v1 e v2 em G"
		v1.removeAdjacente(v2);
		v2.removeAdjacente(v1);
	}

	public int ordem() {
		return _ordem;
	}

	public ArrayList<Vertice> vertices() {
		// "Retorna um conjunto contendo os v�rtices de G"
		return _arrayVertice;
	}

	public Vertice umVertice() {
		// "Retorna um v�rtice qualquer de G"
		int random = (int) Math.random() * (_ordem - 1);
		System.out.println(random);
		return _arrayVertice.get((random + 1));
	}

	public ArrayList<Vertice> adjacentes(Vertice v) {
		// "Retorna um conjunto contendo os v�rtices adjacentes a v em G"
		return v.getAdjacentes();
	}

	public int grau(Vertice v) {
		// "Retorna o n�mero de v�rtices adjacentes a v em G"
		return v.getGrau();
	}

	// ACOES DERIVADAS

	public boolean eRegular() {
		// "Verifica se todos os v�rtices de G possuem o mesmo grau"
		int grauPrimeiroVertice = _arrayVertice.get(0)
				.getGrau();
		for (Vertice v : _arrayVertice) {
			if (v.getGrau() != grauPrimeiroVertice)
				return false;
		}
		return true;
	}

	public boolean eCompleto() {
		// "Verifica se cada v�rtice de G est� conectado
		// a todos os outros v�rtices"
		for(int i = 0; i < _arrayVertice.size();i++){
			if(_arrayVertice.get(i).getGrau() != (_ordem -1))
			return false;
		 }		
		return true;
	}

	public ArrayList<Vertice> fechoTransitivo(Vertice v) {
		// "Retorna um conjunto contendo todos os v�rtices de G que
		// s�o transitivamente alcanc�veis partindo-se de v"
		for(int i = 0; i < v.getAdjacentes().size(); i++){
			
		}
		return null;
	}

	public boolean eConexo() {
		// "Verifica se existe pelo menos um caminho que entre
		// cada par de v�rtices de G"
		return false;
	}
	
	public boolean haCiclo(Vertice v, Vertice va, ArrayList<Vertice> visitados) {
		// "Verifica se ha ciclos em G"		
		//marca visita (por seguranca acabei usando tanto lista como os marcadores) Gabriel
		visitados.add(v);		
		v.visitar();
		int k = v.getAdjacentes().size();
		for(int i = 0; i < k; i++) {
			if(visitados.contains(v.getAdjacentes.().get(i)) && v.getAdjacentes.().get(i) != va) {
					return true;
			}else{
				if(haCiclo(v.getAdjacentes.().get(i), v, visitados))
					return true;
			}
		}		
		return false;
	}

	public boolean eArvore() {
		// "Verifica se n�o h� ciclos em G"
		
		return false;
	}

}
