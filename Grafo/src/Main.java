import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Programa de grafos");
		Grafo g = new Grafo();
		Scanner ent = new Scanner(System.in);
		mostraMenu();

		int esc = ent.nextInt();
		while (esc != 0) {
			switch (esc) {
			case 1:
				System.out.println(ConstantesRespostas.adicionaVertice);
				g.adicionaVertice(new Vertice(ent.next()));
				break;
			case 2:
				System.out.println(ConstantesRespostas.removeVertice);
				System.out.println(ConstantesRespostas.duvidaRemoveVertice);
				if (ent.next().equalsIgnoreCase("s") || ent.next().equalsIgnoreCase("sim")) {
					for (Vertice v : g.vertices())
						System.out.println(v.getValor() + "\n");
					System.out.println("\n");
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
				break;
			case 4:
				System.out.println(ConstantesRespostas.ordemGrafo + g.ordem());
				break;
			case 5:
				break;
			case 6:
				System.out.println(ConstantesRespostas.verticeRandomico + g.umVertice().getValor());
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;
			case 13:
				break;
			}
			esc = ent.nextInt();
		}
		System.out.println("Finalizado");

	}

	private static void mostraMenu() {
		System.out.println("Escolha o que voce deseja fazer:1-Adicionar vertice\n2-Remover vertice\n"
				+ "3-Conectar dois vertices\n4-Desconectar dois vertices\n5-Calcular ordem\n6-Mostrar vertices\n"
				+ "7-Mostrar um vertice qualquer do grafo\n8-Mostrar os vertices adjacentes de um vertice do grafo\n"
				+ "9-Retornar o grau de um vertice do grafo\n10-Verificar se o grafo é regular\n"
				+ "11-Verificar se o grafo é completo\n12-Verificar o fecho transitivo de um vertice\n"
				+ "13-Verificar se o grafo é conexo\n14-Verificar se o grafo é uma arvore\n0-Fechar");
	}

}
