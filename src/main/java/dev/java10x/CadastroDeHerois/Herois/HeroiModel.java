package dev.java10x.CadastroDeHerois.Herois;

import dev.java10x.CadastroDeHerois.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/// Entity transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HeroiModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String funcao;
    private String habilidadePrimaria;
    private int nivelDoHeroi;
    /// Um héroi so pode ter uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") /// Foreing Key ou Chave Estrangeira
    private MissoesModel missoes;


}
