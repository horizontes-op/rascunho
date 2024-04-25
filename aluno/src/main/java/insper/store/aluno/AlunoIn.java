package insper.store.aluno;

import java.sql.Date;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record AlunoIn (
    // Dados Pessoais
    String nome,
    String sobrenome,
    String email,
    String genero,
    Date dataNascimento,

    // Contexto
    String cep,
    String escolaridade,
    String ocupacao,
    String estudouEm,
    Float renda_per_capita,

    // Preferências de oportunidades
    String turno_disponivel,
    String disponibilidade_de_deslocamento, 
    String modalidade_do_ensino,
    String areas_interesse,
    String tipo_oportunidade,
    String natureza_instituicao, // Pública, Privada e privada com bolsa
    String descricao
) {
    
}
