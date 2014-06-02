import java.util.ArrayList;

public class Grafo {

	private ArrayList<Vertice> _arrayVertice;
	private int _ordem;

	public Grafo() {
		_ordem = 10;
	}

	public void adicionaVertice(Vertice v) {
		// "Adiciona um novo vértice em G"
	}

	public void removeVertice(Vertice v) {
		// "Remove um  vértice de G, juntamente com todas as conexões"
		v.limpaVertice();
		_arrayVertice.remove(v);
	}

	public void conecta(Vertice v1, Vertice v2) {
		// "Conecta os vértices v1 e v2 em G"
		v1.adicionaAdjacente(v2);
		v2.adicionaAdjacente(v1);
	}

	public void desconecta(Vertice v1, Vertice v2) {
		// "Desconecta os vértices v1 e v2 em G"
		v1.removeAdjacente(v2);
		v2.removeAdjacente(v1);
	}

	public int ordem() {
		return _ordem;
	}

	public ArrayList<Vertice> vertices() {
		// "Retorna um conjunto contendo os vértices de G"
		return _arrayVertice;
	}

	public Vertice umVertice() {
		// "Retorna um vértice qualquer de G"
		int random = (int) Math.random() * (_ordem - 1);
		System.out.println(random);
		return _arrayVertice.get((random + 1));
	}

	public ArrayList<Vertice> adjacentes(Vertice v) {
		// "Retorna um conjunto contendo os vértices adjacentes a v em G"
		return v.getAdjacentes();
	}

	public int grau(Vertice v) {
		// "Retorna o número de vértices adjacentes a v em G"
		return v.getGrau();
	}

	// ACOES DERIVADAS

	public boolean eRegular() {
		// "Verifica se todos os vértices de G possuem o mesmo grau"
		int grauPrimeiroVertice = _arrayVertice.get(0)
				.getGrau();
		for (Vertice v : _arrayVertice) {
			if (v.getGrau() != grauPrimeiroVertice)
				return false;
		}
		return true;
	}

	public boolean eCompleto() {
		// "Verifica se cada vértice de G está conectado
		// a todos os outros vértices"
		for(int i = 0; i < _arrayVertice.size();i++){
			if(_arrayVertice.get(i).getGrau() != (_ordem -1))
			return false;
		 }		
		return true;
	}

	public ArrayList<Vertice> fechoTransitivo(Vertice v) {
		// "Retorna um conjunto contendo todos os vértices de G que
		// são transitivamente alcancáveis partindo-se de v"
		for(int i = 0; i < v.getAdjacentes().size(); i++){
			
		}
		return null;
	}

	public boolean eConexo() {
		// "Verifica se existe pelo menos um caminho que entre
		// cada par de vértices de G"
		return false;
	}

	public boolean eArvore() {
		// "Verifica se não há ciclos em G"

		return false;
	}

}
