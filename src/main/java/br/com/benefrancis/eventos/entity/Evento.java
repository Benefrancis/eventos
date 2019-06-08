package br.com.benefrancis.eventos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Evento {
	@Id
	@GeneratedValue
	private Long id;

	private String nome;

}
