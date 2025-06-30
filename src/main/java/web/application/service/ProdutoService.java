package web.application.service;

import org.springframework.stereotype.Service;
import web.application.exceptions.RecursoNaoEncontrado;
import web.application.model.Produto;
import web.application.repository.ProdutoRepository;

import java.util.List;
@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

   public List<Produto> mostrarProdutos(){
       return produtoRepository.findAll();
   }

   public Produto buscarPorId(Long id){
       return produtoRepository.findById(id)
               .orElseThrow(() -> new RecursoNaoEncontrado("Produto com id#" + id + " não encontrado."));
   }

   public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
   }

   public void deletarProduto(Long id){
       if(!produtoRepository.existsById(id)) throw new RecursoNaoEncontrado("Produto com id#" + id + "não encontrado");
       produtoRepository.deleteById(id);
   }
}
