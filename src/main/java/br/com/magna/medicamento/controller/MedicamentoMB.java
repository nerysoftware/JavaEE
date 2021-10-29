package br.com.magna.medicamento.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.magna.medicamento.model.Fornecedor;
import br.com.magna.medicamento.model.Marca;
import br.com.magna.medicamento.model.Medicamento;
import br.com.magna.medicamento.service.MedicamentoService;
import br.com.magna.medicamento.utily.Message;
import br.com.magna.medicamento.utily.NegocioException;

@Named
@ViewScoped
public class MedicamentoMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Medicamento medicamento;

	@Inject
	private MedicamentoService service;

	
	@Inject
	private Marca marca = new Marca();
	


	private List<Medicamento> medicamentos;
	


	@PostConstruct
	public void carregar() {
		
		medicamentos = service.todosOsMedicamentos();
	
	}
	
	

	public void adicionar() {
		try {
			
			service.salvar(medicamento);
			marca = new Marca();
			medicamento = new Medicamento();
		

			carregar();

			Message.info("Salvo com Sucesso");

		} catch (NegocioException e) {
			Message.erro(e.getMessage());

		}
	}

	public void excluir() {
		try {
			service.remover(medicamento);
			carregar();

			Message.info(medicamento.getNome() + "foi removido!!");

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
	

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}
	
	


}
