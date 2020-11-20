package br.edu.up.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "medicos")
@TableGenerator(
	
	name = "gerador_de_id",
	table = "sqlite_sequence",
	pkColumnName = "name",
	valueColumnName = "seq",
	pkColumnValue = "pacientes",
	initialValue = 1,
	allocationSize = 1

)
public class Medico {
	@Id
	@GeneratedValue (strategy = GenerationType.TABLE, generator = "gerador_de_id")
	@Column ( name = "id_medico")
	private int id;
	private String nome;
	private String especialidade;
	
	public Medico() {
		
	}
	
	public Medico(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public Medico(int id, String nome, String especialidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	

}
