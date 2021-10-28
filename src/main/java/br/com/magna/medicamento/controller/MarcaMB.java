package br.com.magna.medicamento.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.magna.medicamento.model.Marca;
import br.com.magna.medicamento.service.MarcaService;
import br.com.magna.medicamento.utily.Message;
import br.com.magna.medicamento.utily.NegocioException;

@Named
@ViewScoped
public class MarcaMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Marca marca;
	
	@Inject
	private MarcaService service;
	
	private List<Marca> marcas;

	@PostConstruct
	public void carregarMarca() {
		marcas = service.todosAsMarcas();
		System.out.println("carregarMarca chamado!!!");
	}
	
	public void adicionar() {
		try {
			service.salvarMarca(marca);

			marca = new Marca();

			carregarMarca();

			Message.info("Salvo com Sucesso");

		} catch (NegocioException e) {
			Message.erro(e.getMessage());

		}
	}
	
	public void excluir() {
		try {
			service.removerMarca(marca);
			carregarMarca();

			Message.info(marca.getNome() + "foi removido!!");

		} catch (NegocioException e) {
			Message.erro(e.getMessage());
		}
	}


	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Marca> getMarcas() {
		return marcas;
	}

	
}
