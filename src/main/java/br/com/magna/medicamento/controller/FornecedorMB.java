package br.com.magna.medicamento.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.magna.medicamento.model.Fornecedor;
import br.com.magna.medicamento.service.FornecedorService;
import br.com.magna.medicamento.utily.Message;
import br.com.magna.medicamento.utily.NegocioException;

@Named
@ViewScoped
public class FornecedorMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Fornecedor fornecedor;

	@Inject
	private FornecedorService service;

	private List<Fornecedor> fornecedores;

	@PostConstruct
	public void carregarFornecedor() {
		fornecedores = service.todosOsFornecedores();
		System.out.println("carregarMarca chamado!!!");
	}

	public void adicionar() {
		try {
			service.salvarFornecedor(fornecedor);

			fornecedor = new Fornecedor();

			carregarFornecedor();

			Message.info("Salvo com Sucesso");

		} catch (NegocioException e) {
			Message.erro(e.getMessage());

		}
	}

	public void excluir() {
		try {
			service.removerFornecedor(fornecedor);
			carregarFornecedor();

			Message.info(fornecedor.getNome() + "foi removido!!");

		} catch (NegocioException e) {
			Message.erro(e.getMessage());
		}
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Fornecedor> getFornecedors() {
		return fornecedores;
	}
}
