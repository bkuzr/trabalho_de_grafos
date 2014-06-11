import java.util.ArrayList;

public class Vertice {

	private String _valor;
	private int _grau;
	private ArrayList<Vertice> _adjacentes;
	private boolean _visitado;
	
	public Vertice(String valor) {
		_valor = valor;
		_grau = 0;
		_adjacentes = new ArrayList<Vertice>();
		_visitado = false;
	}
	
	public String getValor(){
		return _valor;
	}
	public int getGrau(){
		return _grau;
	}
	public boolean getSituacao(){
		return _visitado;
	}
	public ArrayList<Vertice> getAdjacentes(){
		return _adjacentes;
	}
	public void adicionaAdjacente(Vertice v){
		_adjacentes.add(v);
	}
	public boolean removeAdjacente(Vertice v){
		return _adjacentes.remove(v); //se v nao � encontrado retorna false
	}
	public void visitar(boolean visitar){
		_visitado = visitar;
	}
	public void limpaVertice(){
		_valor = "";
		_grau = 0;
		for(Vertice v : _adjacentes)
			v.removeAdjacente(this); //verificar esse this
		_adjacentes.clear();
		_visitado = false;
	}

}
