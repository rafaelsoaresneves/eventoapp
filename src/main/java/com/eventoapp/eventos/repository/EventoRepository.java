package com.eventoapp.eventos.repository;

import com.eventoapp.eventos.models.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rafael on 5/7/18.
 */
public interface EventoRepository extends CrudRepository<Evento, String> {

}
