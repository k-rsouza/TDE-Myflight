package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {

    private ArrayList<Aeronave> aerov;
	
	public GerenciadorAeronaves() {
		aerov = new ArrayList<>();
	}

	private static GerenciadorAeronaves instance;

    public static GerenciadorAeronaves getInstance() {
        if (instance == null)
            instance = new GerenciadorAeronaves();

        return instance;
    }

	public void inserir(Aeronave aer) {
        aerov.add( aer );
    }

	public Aeronave buscarCodigo(String codigo) {
        for (Aeronave cia: aerov) {
              if (cia.getCodigo().equals(codigo))
                  return cia;
        }
        return null;
    }

	public String toString() {
        StringBuilder aux = new StringBuilder("\nLista de Aeroportos\n- - - - - - - - - - -\n");
        for (Aeronave umAerov : aerov) {
            aux.append( umAerov.toString() + "\n");
        }
        return aux.toString();
    }
}


