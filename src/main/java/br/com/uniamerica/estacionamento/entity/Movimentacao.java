package br.com.uniamerica.estacionamento.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Audited
@Table(name = "movimentacoes", schema = "public")
@AuditTable(value = "movimentacoes_audit", schema = "audit")
public class Movimentacao extends AbstractEntity {

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "veiculo_id", nullable = false)
    @NotNull(message = "The vehicle object was not provided.")
    private Veiculo veiculo;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "condutor_id", nullable = false)
    @NotNull(message = "The driver object was not provided.")
    private Condutor condutor;

    @Getter
    @Setter
    @Column(name = "entrada", nullable = false)
    @NotNull(message = "The entry date of the movement was not provided.")
    private LocalDateTime entrada;

    @Getter
    @Setter
    @Column(name = "saida")
    private LocalDateTime saida;

    @Getter
    @Setter
    @Column(name = "tempoHoras")
    private int tempoHoras;

    @Getter
    @Setter
    @Column(name = "tempoMinutos")
    private int tempoMinutos;

    @Getter
    @Setter
    @Column(name = "tempo_desconto")
    private int tempoDesconto;

    @Getter
    @Setter
    @Column(name = "tempo_multaHoras")
    private int tempoMultaHoras;

    @Getter
    @Setter
    @Column(name = "tempo_multaMinutes")
    private int tempoMultaMinutes;

    @Getter
    @Setter
    @Column(name = "valor_desconto")
    private BigDecimal valorDesconto;

    @Getter
    @Setter
    @Column(name = "valor_multa")
    private BigDecimal valorMulta;

    @Getter
    @Setter
    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @Getter
    @Setter
    @Column(name = "valor_hora")
    private BigDecimal valorHora;

    @Getter
    @Setter
    @Column(name = "valorhora_multa")
    private BigDecimal valorHoraMulta;
}
