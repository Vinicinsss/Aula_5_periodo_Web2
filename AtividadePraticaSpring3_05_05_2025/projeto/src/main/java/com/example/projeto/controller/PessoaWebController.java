package com.example.projeto.controller;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.projeto.model.Pessoa;
import com.example.projeto.service.PessoaService;

import org.springframework.http.HttpStatus;

@Controller
@RequestMapping("/pessoas")
public class PessoaWebController {

    private final PessoaService pessoaService;

    public PessoaWebController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public String index() {
        return "redirect:/pessoas/listar";
    }

    @GetMapping("/cadastrar")
    public String exibiFormCadastro(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "pessoa/form";
    }

    @PostMapping("/cadastrar")
    public String cadastrarPessoa(
            @valid @modelAttribute("pessoa") Pessoa pessoa, BindingResult result, RedirectAttributes ra) {
        if (result.hasErrors()) {
            return "pessoa/form";
            {
            }
            pessoaService.salvarPessoa(pessoa);
            ra.addFlashAttribute("sucesso", "Pessoa cadastrada com sucesso!");
            return "redirect:/pessoas/listar";
        }
    }
    @GetMapping("/listar")
    public String listarPessoas(Model model) {
        model.addAttribute("lissta", pessoaService.listarPessoas());
        return "pessoa/lista";
    }

    //3. detalhes e exclusão
    @GetMapping("/{id}")
    public String detalhesPessoa(@PathVariable Long id, Model model) {
        Pessoa p = pessoaService.buscarPorId(id)
        .orElse(() -> new ResponseEntity(
                HttpStatus.NOT_FOUND, "Pessoa não encontrada, id: " + id
                ));
        model.addAttribute("pessoa", p);
        return "pessoa/detalhes";
    }

    public String excluirPessoa(@PathVariable Long id, RedirectAttributes ra){
        pessoaService.deletarPessoa(id);
        ra.addAttribute("sucesso", "Pessoa excluída com sucesso");
        return "redirect:/pessoas/listar";
    }

}