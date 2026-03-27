package dev.java10x.CadastroDeHerois.Herois;

import dev.java10x.CadastroDeHerois.Missoes.MissoesModel;
import jakarta.persistence.*;

/// Entity transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
public class HeroiModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String funcao;
    private String habilidadePrimaria;
    private int nivelDoHeroi;
    @ManyToOne
    @JoinColumn(name = "missoes_id") /// Foreing Key ou Chave Estrangeira
    private MissoesModel missoes;

    public HeroiModel() {
    }

    public HeroiModel(String nome, String funcao, String habilidadePrimaria, int nivelDoHeroi) {
        this.nome = nome;
        this.funcao = funcao;
        this.habilidadePrimaria = habilidadePrimaria;
        this.nivelDoHeroi = nivelDoHeroi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getHabilidadePrimaria() {
        return habilidadePrimaria;
    }

    public void setHabilidadePrimaria(String habilidadePrimaria) {
        this.habilidadePrimaria = habilidadePrimaria;
    }

    public int getNivelDoHeroi() {
        return nivelDoHeroi;
    }

    public void setNivelDoHeroi(int nivelDoHeroi) {
        this.nivelDoHeroi = nivelDoHeroi;
    }
}
