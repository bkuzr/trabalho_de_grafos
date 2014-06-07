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
				Vertice  vertice1, vertice2;
				
				
				break;
			case 4:
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
				if (g.eArvore()) {
					mensagem(ConstantesRespostas.grafoEArvore);
				}
				mensagem(ConstantesRespostas.grafoNaoArvore);
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
