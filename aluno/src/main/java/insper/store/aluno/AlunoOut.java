package insper.store.aluno;

import java.sql.Date;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record AlunoOut (
    // Dados Pessoais
    String id,
    String nome,
    String sobrenome,
    String email,
    String genero,
    Date dataNascimento,

    // Contexto
    String cep,
    String cidade,
    String uf,
    String escolaridade,
    String ocupacao,
    String estudouEm, // 1. Publica, 2. Particular, 3. Particular com bolsa
    Float renda_per_capita,

    // Preferências de oportunidades
    String turno_disponivel, // manha, tarde e/ou noite
    String disponibilidade_de_deslocamento, // propria cidade, estado, todo o brasil, internacional
    String modalidade_do_ensino, // presencial, semipresencial, EAD
    String areas_interesse, // psicologia, letras, exatas, esportes, saude, etc
    String tipo_oportunidade, // academico, profissional, extra-curricular
    String natureza_instituicao, // Pública, Privada e privada com bolsa
    String descricao
) {
    
}
