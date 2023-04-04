package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;
	
	public GerenciadorVoos() {
		voos = new ArrayList<>();
	}

	private static GerenciadorVoos instance;

    public static GerenciadorVoos getInstance() {
        if (instance == null)
            instance = new GerenciadorVoos();

        return instance;

    }

	public void inserir(Voo vo) {
        voos.add( vo );
    }

	public Voo buscarCodigo(LocalDateTime datahora) {
        for (Voo voss: voos) {
              if (voss.getDatahora().equals(datahora))
                  return voss;
        }
        return null;
    }

	public String toString() {
        StringBuilder aux = new StringBuilder("\nLista de rotas\n- - - - - - - - - - -\n");
        for (Voo umVoo : voos) {
            aux.append( umVoo.toString() + "\n");
        }
        return aux.toString();
    }
}
