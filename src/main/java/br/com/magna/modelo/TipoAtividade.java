package br.com.magna.modelo;

public enum TipoAtividade {

	APRESENTACAO("Apresentação"), CURSO("Curso"), MINICURSO("MiniCurso"), PALESTRA("Palestra"), SEMINARIO("Seminario"),
	SIMPOSIO("Simposio"), OUTRA("Outas");

	private String descricao;

	TipoAtividade(String descricao) {
		this.descricao = descricao;

	}

	public String getDescricao() {
		return this.descricao;
	}

}
