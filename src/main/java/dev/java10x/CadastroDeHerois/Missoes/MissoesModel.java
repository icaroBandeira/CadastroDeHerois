package dev.java10x.CadastroDeHerois.Missoes;

import dev.java10x.CadastroDeHerois.Herois.HeroiModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private String recomendacoesDeTiposDeHerois;
    @OneToMany(mappedBy = "missoes")
    private List<HeroiModel> herois;

}
