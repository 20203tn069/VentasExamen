package mx.edu.utez.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.demo.model.transaccion.Transaccion;
import mx.edu.utez.demo.model.user.User;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UserDto {

    private Long id;
    @NotNull
    @NotBlank
    @Length(min = 1, max = 150)
    private String nombre;
    private String corrreo_electronico;
    private String contrasena;
    private String wish_list;
    private List<Transaccion> transactions;

    public User getUser(){
        return new User(
                getId(),
                getNombre(),
                getCorrreo_electronico(),
                getContrasena(),
                getWish_list(),
                getTransactions());
    }
}
