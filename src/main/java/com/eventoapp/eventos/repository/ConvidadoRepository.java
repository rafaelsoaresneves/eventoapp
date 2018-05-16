package com.eventoapp.eventos.repository;

import com.eventoapp.eventos.models.Convidado;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rafael on 5/15/18.
 */
public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

}
