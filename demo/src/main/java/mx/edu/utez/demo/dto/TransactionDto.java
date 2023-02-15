package mx.edu.utez.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.demo.model.transaccion.Transaccion;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class TransactionDto {

    private Long id;
    private Long id_usuario;
    private Long id_product;
    private Date fecha;
    @NotNull
    @NotBlank
    private List<Transaccion> transactions;
}
