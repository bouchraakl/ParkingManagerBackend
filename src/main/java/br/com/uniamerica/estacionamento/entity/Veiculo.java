/* -------------------Package--------------------------- */
package br.com.uniamerica.estacionamento.entity;

/* -------------------Imports--------------------------- */
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/* ----------------------------------------------------- */
@Entity
@Table(name = "veiculos", schema = "public")
public class Veiculo extends AbstractEntity {

    @Getter @Setter
    @Column(name = "placa", nullable = false, unique = true)
    private String placa;

    @Getter @Setter
    @JoinColumn(name = "modelo_id", nullable = false)
    @ManyToOne
    private Modelo modelo;

    @Getter @Setter
    @Column(name = "ano", nullable = false)
    private int ano;

    @Enumerated(EnumType.STRING)
    @Getter @Setter
    @Column(name = "cor", nullable = false)
    private Cor cor;

    @Enumerated(EnumType.STRING)
    @Getter @Setter
    @Column(name = "tipo", nullable = false)
    private Tipo tipo;
    
}