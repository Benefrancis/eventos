package br.com.benefrancis.eventos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.benefrancis.eventos.entity.Evento;

@RepositoryRestResource(collectionResourceRel = "eventos", path = "evento")
public interface EventoRepository extends JpaRepository<Evento, Long> {

	List<Evento> findByNomeIgnoreCaseContaining(@Param("nome") String nome);

}
