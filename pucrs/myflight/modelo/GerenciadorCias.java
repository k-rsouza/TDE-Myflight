package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	private static GerenciadorCias instance;

    public static GerenciadorCias getInstance() {
        if (instance == null)
            instance = new GerenciadorCias();

        return instance;

    }

	public void inserir(CiaAerea cia) {
        empresas.add( cia );
    }

	public CiaAerea buscarCodigo(String codigo) {
        for (CiaAerea cia: empresas) {
              if (cia.getNome().equals(codigo))
                  return cia;
        }
        return null;
    }

	public CiaAerea buscarNome(String nome) {
        for (CiaAerea cia: empresas) {
              if (cia.getNome().equals(nome))
                  return cia;
        }
        return null;
    }

	public String toString() {
        StringBuilder aux = new StringBuilder("\nLista de Cia Aereas\n- - - - - - - - - - -\n");
        for (CiaAerea umCia : empresas) {
            aux.append( umCia.toString() + "\n");

        }
        return aux.toString();

    }

}
