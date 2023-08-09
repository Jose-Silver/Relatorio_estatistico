package br.com.contas.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Numeros")
public class numeros {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Setter @Getter
    private List<Integer> numeros;

    public numeros() {
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public numeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
}
