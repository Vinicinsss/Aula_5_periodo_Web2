package com.example.projeto;
import org.springframework.web.bind.annotation.RestController;
import service.PessoaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    private final PessoaService PessoaService;

    public PessoaController(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }


    @GetMapping
    public List<Pessoa> listarPessoas(){
        return pessoaService.listarPessoas();
    }

    public ResponseEntity<Pessoa> buscarPessoa(@PathVariable Long id){
        return pessoaService.buscarPorId(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa){
        return pessoaService.salvarPessoa(pessoa);
    }

    public ResponseEntity<Void>deletarPessoa@PathVariable(){
         
    }

}

