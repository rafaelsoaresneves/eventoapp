package com.eventoapp.eventos.controllers;

import com.eventoapp.eventos.models.Evento;
import com.eventoapp.eventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rafael on 5/6/18.
 */

@Controller
public class EventoController {

    @Autowired
    EventoRepository er;

    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
    public String formEvento() {
        return "evento/formEvento";
    }

    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
    public String formEvento(Evento evento) {
        er.save(evento);
        return "redirect:/cadastrarEvento";
    }

    @RequestMapping("/eventos")
    public ModelAndView listarEventos() {
        ModelAndView mv = new ModelAndView("index");
        Iterable<Evento> eventos = er.findAll();
        mv.addObject("eventos", eventos);
        return mv;
    }



}
