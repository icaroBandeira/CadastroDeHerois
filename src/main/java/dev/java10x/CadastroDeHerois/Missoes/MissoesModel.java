package dev.java10x.CadastroDeHerois.Missoes;

import dev.java10x.CadastroDeHerois.Herois.HeroiModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private String recomendacoesDeTiposDeHerois;
    /// @OneToMany - Uma missao para vários hérois
    @OneToMany(mappedBy = "missoes")
    private List<HeroiModel> herois;

}
