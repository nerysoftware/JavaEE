package br.com.magna.medicamento.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.magna.medicamento.dao.DAO;
import br.com.magna.medicamento.model.Fornecedor;
import br.com.magna.medicamento.model.Marca;
import br.com.magna.medicamento.utily.NegocioException;



public class FornecedorService implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAO<Fornecedor> dao;
	
	
	public void salvarFornecedor(Fornecedor m) throws NegocioException {

		if (m.getNome().length() < 3) {
			throw new NegocioException("erro");
		}
		System.out.println("Fornecedor foi salva");
		dao.salvar(m);
	}

	public void removerFornecedor(Fornecedor m) throws NegocioException {
		dao.remover(Fornecedor.class, m.getId());
	}

	public List<Fornecedor> todosOsFornecedores() {
		return dao.buscarTodos("select m from Fornecedor m order by m.nome");
	}
	
	

}
