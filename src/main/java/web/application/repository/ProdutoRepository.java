package web.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.application.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
