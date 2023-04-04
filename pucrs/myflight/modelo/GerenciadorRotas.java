package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {
	private ArrayList<Rota> rotas;
	
	public GerenciadorRotas() {
		rotas = new ArrayList<>();
	}

	private static GerenciadorRotas instance;

    public static GerenciadorRotas getInstance() {
        if (instance == null)
            instance = new GerenciadorRotas();

        return instance;

    }

	public void inserir(Rota rota) {
        rotas.add( rota );
    }

	public Rota buscarCodigo(Aeroporto origem) {
        for (Rota rot: rotas) {
              if (rot.getOrigem().equals(origem))
                  return rot;
        }
        return null;
    }

	public String toString() {
        StringBuilder aux = new StringBuilder("\nLista de rotas\n- - - - - - - - - - -\n");
        for (Rota umRot : rotas) {
            aux.append( umRot.toString() + "\n");

        }
        return aux.toString();
    }
}
