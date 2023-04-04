package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aerop;
	
	public GerenciadorAeroportos() {
		aerop = new ArrayList<>();
	}

	private static GerenciadorAeroportos instance;

    public static GerenciadorAeroportos getInstance() {
        if (instance == null)
            instance = new GerenciadorAeroportos();

        return instance;
    }

	public void inserir(Aeroporto aero) {
        aerop.add( aero );
    }

	public Aeroporto buscarCodigo(String codigo) {
        for (Aeroporto cia: aerop) {
              if (cia.getCodigo().equals(codigo))
                  return cia;
        }
        return null;
    }

	public String toString() {
        StringBuilder aux = new StringBuilder("\nLista de Aeroportos\n- - - - - - - - - - -\n");
        for (Aeroporto umAero : aerop) {
            aux.append( umAero.toString() + "\n");

        }
        return aux.toString();
    }
}

