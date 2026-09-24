package com.example.CandidatosTSE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.CandidatosTSE.service.CandidatosTseService;

@Controller
public class CandidatosTseController {

    private final CandidatosTseService candidatosTseService;

    public CandidatosTseController(CandidatosTseService candidatosTseService) {
        this.candidatosTseService = candidatosTseService;
    }

    @GetMapping("/")
    public String index(
            @RequestParam(required = false) String cargo,
            @RequestParam(required = false) String partido,
            @RequestParam(required = false) String texto,
            Model model) {

        candidatosTseService.carregarCsv();
        candidatosTseService.fotoExisteNoDisco();

        model.addAttribute(
                "cargos",
                candidatosTseService.listarCargos()
        );

        model.addAttribute(
                "candidatos",
                candidatosTseService.filtrar(cargo, partido, texto)
        );

        model.addAttribute("cargoSelecionado", cargo);
        model.addAttribute("partidoSelecionado", partido);
        model.addAttribute("texto", texto);
        return "index";
    }
}
