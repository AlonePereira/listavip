package br.com.alura.listavip.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.listavip.daos.ConvidadoRepository;
import br.com.alura.listavip.models.Convidado;

@Controller
public class ConvidadoController {

    @Autowired
    private ConvidadoRepository repository;
    
    @RequestMapping("/")
    public String index() {
	return "index";
    }
    
    @RequestMapping("listaconvidados")
    public String lista(Model model) {
	
	Iterable<Convidado> convidados = repository.findAll();
	model.addAttribute("convidados", convidados);
	
	return "listaconvidados";
    }
    
}
