import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		mensagem("Programa de grafos");
		Grafo g = new Grafo();
		Scanner ent = new Scanner(System.in);
		mensagem(ConstantesRespostas.menu);

		int esc = ent.nextInt();
		while (esc != 0) {
			switch (esc) {
			case 1:
				mensagem(ConstantesRespostas.adicionaVertice);
				String valor = ent.next();
				g.adicionaVertice(new Vertice(valor));
				break;
			case 2:
				mensagem(ConstantesRespostas.removeVertice);
				mensagem(ConstantesRespostas.duvidaRemoveVertice);
				if (ent.next().equalsIgnoreCase("s") || ent.next().equalsIgnoreCase("sim")) {
					g.mostrarVertices();
				}

				String vARetirar = ent.next();
				for (Vertice v : g.vertices()) {
					if (v.getValor().equalsIgnoreCase(vARetirar)) {
						g.removeVertice(v); // assumindo que o usuario so quer
											// retirar um vertice e nao todos os
											// que contenham o mesmo valor
											// (tirar o break abaixo se sim)
						break;
					}
				}
				break;
			case 3:
				mensagem(ConstantesRespostas.conectaVertice);
				String valor1 = ent.next();
				String valor2 = ent.next();
				Vertice vertice2 = null;
				Vertice vertice1 = null;
				boolean tru = false;
				int ki = 0;
				while (ki < g.vertices().size() && tru == false) {
					ki++;
					if(g.vertices().get(ki).getValor() == valor1)
						vertice1 = g.vertices().get(ki);
					if(g.vertices().get(ki).getValor() == valor2)
						vertice2 = g.vertices().get(ki);
					if(vertice1 != null && vertice2 != null) {
						g.conecta(vertice1, vertice2);
						tru = true;
					}
				}	
				
				break;
			case 4:
				mensagem(ConstantesRespostas.desconectarVertice);
				String val2 = ent.next();
				String val1 = ent.next();
				Vertice vertic2 = null;
				Vertice vertic1 = null;
				boolean t = false;
				int k = 0;
				while (k < g.vertices().size() && t == false) {
					k++;
					if(g.vertices().get(k).getValor() ==val1)
						vertic1 = g.vertices().get(k);
					if(g.vertices().get(k).getValor() == val2)
						vertic2 = g.vertices().get(k);
					if(vertic1 != null && vertic2 != null) {
						g.desconecta(vertic1, vertic2);
						t = true;
					}
				}				
				break;

			case 5:
				mensagem(ConstantesRespostas.ordemGrafo + g.ordem());
				break;
			case 6:
				mensagem(ConstantesRespostas.mostrarVertices);
				g.mostrarVertices();
				break;
			case 7:
				mensagem(ConstantesRespostas.mostrarVerticeQualquer + g.umVertice().getValor());
				break;
			case 8:
				mensagem(ConstantesRespostas.mostrarVerticesAdjacentesPedido);
				String valorAdj = ent.next();
				for(int i = 0; i < g.vertices().size(); i++){
					if(g.vertices().get(i).getValor() == valorAdj){
						mensagem(ConstantesRespostas.mostrarVerticesAdjacentesResposta + g.adjacentes(g.vertices().get(i))); //RETORNAR CADA VALOR INDIVIDUALMENTE
					}else{
						mensagem(ConstantesRespostas.erroVerticeIncorreto);
					}
						
				}
				
				break;
			case 9:
				mensagem(ConstantesRespostas.mostrarVerticesAdjacentesPedido);
				String valorGrau = ent.next();
				for(int i = 0; i < g.vertices().size(); i++){
					if(g.vertices().get(i).getValor() == valorGrau){
						mensagem(ConstantesRespostas.grauVerticeResposta + g.vertices().get(i).getGrau());
					}else{
						mensagem(ConstantesRespostas.erroVerticeIncorreto);
					}
						
				}
				break;
			case 10:
				if (g.eRegular()) {
					mensagem(ConstantesRespostas.grafoERegular);
				}
				mensagem(ConstantesRespostas.grafoNaoRegular);
				break;
			case 11:
				if (g.eCompleto()) {
					mensagem(ConstantesRespostas.grafoECompleto);
				}
				mensagem(ConstantesRespostas.grafoNaoCompleto);
				break;
			case 12:

				break;
			case 13:
				if (g.eConexo()) {
					mensagem(ConstantesRespostas.grafoEConexo);
				}
				mensagem(ConstantesRespostas.grafoNaoConexo);
				break;
			case 14:
//				if (g.eArvore()) {
//					mensagem(ConstantesRespostas.grafoEArvore);
//				}
//				mensagem(ConstantesRespostas.grafoNaoArvore);
				break;
			}
			mensagem(ConstantesRespostas.menu);
			esc = ent.nextInt();
		}
		System.out.println("Finalizado");

	}

	private static void mensagem(String mensagem) {
		System.out.println(mensagem + "\n");
	}

}
