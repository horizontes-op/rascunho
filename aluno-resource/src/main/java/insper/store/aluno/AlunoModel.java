package insper.store.aluno;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import java.sql.Date;

@Entity
@Table(name = "aluno")
@EqualsAndHashCode(of = "id")
@Builder @Getter @Setter @Accessors(chain = true, fluent = true)
@NoArgsConstructor @AllArgsConstructor
public class AlunoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_aluno")
    private String id;

    @Column(name = "tx_nome")
    private String nome;

    @Column(name = "tx_sobrenome")
    private String sobrenome;

    @Column(name = "tx_email")
    private String email;

    @Column(name = "tx_genero")
    private String genero;

    @Column(name = "dt_nascimento")
    private Date dataNascimento;

    @Column(name = "tx_cep")
    private String cep;

    @Column(name = "tx_cidade")
    private String cidade;

    @Column(name = "tx_uf")
    private String uf;

    @Column(name = "tx_escolaridade")
    private String escolaridade;

    @Column(name = "tx_ocupacao")
    private String ocupacao;

    @Column(name = "tx_estudou_em")
    private String estudouEm;

    @Column(name = "vl_renda_per_capita")
    private Float renda_per_capita;

    @Column(name = "tx_turno_disponivel")
    private String turno_disponivel;

    @Column(name = "tx_disponibilidade_deslocamento")
    private String disponibilidade_de_deslocamento;

    @Column(name = "tx_modalidade_ensino")
    private String modalidade_do_ensino;

    @Column(name = "tx_areas_interesse")
    private String areas_interesse;

    @Column(name = "tx_tipo_oportunidade")
    private String tipo_oportunidade;

    @Column(name = "tx_natureza_instituicao")
    private String natureza_instituicao;

    @Column(name = "tx_descricao")
    private String descricao;

    public AlunoModel(Aluno o) {
        this.id = o.id();
        this.nome = o.nome();
        this.sobrenome = o.sobrenome();
        this.email = o.email();
        this.genero = o.genero();
        this.dataNascimento = o.dataNascimento();
        this.cep = o.cep();
        this.cidade = o.cidade();
        this.uf = o.uf();
        this.escolaridade = o.escolaridade();
        this.ocupacao = o.ocupacao();
        this.estudouEm = o.estudouEm();
        this.renda_per_capita = o.renda_per_capita();
        this.turno_disponivel = o.turno_disponivel();
        this.disponibilidade_de_deslocamento = o.disponibilidade_de_deslocamento();
        this.modalidade_do_ensino = o.modalidade_do_ensino();
        this.areas_interesse = o.areas_interesse();
        this.tipo_oportunidade = o.tipo_oportunidade();
        this.natureza_instituicao = o.natureza_instituicao();
        this.descricao = o.descricao();
    }

    public Aluno to() {
        return Aluno.builder()
            .id(id)
            .nome(nome)
            .sobrenome(sobrenome)
            .email(email)
            .genero(genero)
            .dataNascimento(dataNascimento)
            .cep(cep)
            .cidade(cidade)
            .uf(uf)
            .escolaridade(escolaridade)
            .ocupacao(ocupacao)
            .estudouEm(estudouEm)
            .renda_per_capita(renda_per_capita)
            .turno_disponivel(turno_disponivel)
            .disponibilidade_de_deslocamento(disponibilidade_de_deslocamento)
            .modalidade_do_ensino(modalidade_do_ensino)
            .areas_interesse(areas_interesse)
            .tipo_oportunidade(tipo_oportunidade)
            .natureza_instituicao(natureza_instituicao)
            .descricao(descricao)
            .build();
    }

}
