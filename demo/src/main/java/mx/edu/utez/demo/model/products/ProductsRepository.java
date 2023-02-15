package mx.edu.utez.demo.model.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductsRepository extends JpaRepository<Products, Long> {
    boolean existsByNombre(String nombre);
}
