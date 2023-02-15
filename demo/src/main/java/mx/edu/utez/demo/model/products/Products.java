package mx.edu.utez.demo.model.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.demo.model.transaccion.Transaccion;

import java.util.List;

@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false,length = 150)
    private String nombre;
    @Column(nullable = false, length = 150)
    private String categoria;
    @Column(nullable = false)
    private Double precio;
    @Column(nullable = false)
    private Boolean disponibilidad;

    @OneToMany(mappedBy="products")
    @JsonIgnore
    private List<Transaccion> transactions;
}
