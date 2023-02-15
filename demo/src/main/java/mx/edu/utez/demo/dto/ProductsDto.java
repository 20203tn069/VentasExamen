package mx.edu.utez.demo.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.demo.model.products.Products;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ProductsDto {

    private Long id;
    @NotNull
    @NotBlank
    @Length(min = 1, max = 150)
    private String nombre;
    private String categoria;
    private Double precio;
    private Boolean disponibilidad;
    private List<TransactionDto> transactions;

    public Products getProduct(){
        return new Products(
                getId(),
                getNombre(),
                getCategoria(),
                getPrecio(),
                getDisponibilidad(),
                getTransactions()
        );
    }

}
