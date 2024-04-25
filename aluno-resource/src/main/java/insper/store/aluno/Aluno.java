package insper.store.aluno;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import java.sql.Date;

@Builder
@Getter @Setter @Accessors(fluent = true, chain = true)
@AllArgsConstructor @NoArgsConstructor
public class Aluno {

    private String id;
    private String nome;
    private String sobrenome;
    private String email;
    private String genero;
    private Date dataNascimento;
    private String cep;
    private String cidade;
    private String uf;
    private String escolaridade;
    private String ocupacao;
    private String estudouEm;
    private Float renda_per_capita;
    private String turno_disponivel;
    private String disponibilidade_de_deslocamento;
    private String modalidade_do_ensino;
    private String areas_interesse;
    private String tipo_oportunidade;
    private String natureza_instituicao;
    private String descricao;  
}
