package br.edu.up.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "tratamentos")
@TableGenerator(
	
	name = "gerador_de_id",
	table = "sqlite_sequence",
	pkColumnName = "name",
	valueColumnName = "seq",
	pkColumnValue = "pacientes",
	initialValue = 1,
	allocationSize = 1

)
public class Tratamento {
	@Id
	@GeneratedValue (strategy = GenerationType.TABLE, generator = "gerador_de_id")
	@Column ( name = "id_tratamento" )
	
	private int id;
	private String nome;
	private int id_medico;
	
	public Tratamento() {
		
	}
	
	public Tratamento(String nome, int id_medico) {
		super();
		this.nome = nome;
		this.id_medico = id_medico;
	}


	public Tratamento(int id, String nome, int id_medico) {
		super();
		this.id = id;
		this.nome = nome;
		this.id_medico = id_medico;
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

	public int getId_medico() {
		return id_medico;
	}

	public void setId_medico(int id_medico) {
		this.id_medico = id_medico;
	}
}
