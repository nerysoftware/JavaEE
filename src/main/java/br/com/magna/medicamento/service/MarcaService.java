package br.com.magna.medicamento.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.magna.medicamento.dao.DAO;
import br.com.magna.medicamento.model.Marca;
import br.com.magna.medicamento.utily.NegocioException;

public class MarcaService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private DAO<Marca> dao;

	public void salvarMarca(Marca m) throws NegocioException {

		if (m.getNome().length() < 3) {
			throw new NegocioException("O nome do medicamento não poder ter menos que 3 caracteres");
		}
		System.out.println("Marca foi salva");
		dao.salvar(m);
	}

	public void removerMarca(Marca m) throws NegocioException {
		dao.remover(Marca.class, m.getId());
	}

	public List<Marca> todosAsMarcas() {
		return dao.buscarTodos("select m from Marca m order by m.nome");
	}

}
