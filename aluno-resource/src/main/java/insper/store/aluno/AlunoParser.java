package insper.store.aluno;

public class AlunoParser {

    public static Aluno to(AlunoIn in) {
        return Aluno.builder()
            .nome(in.nome())
            .sobrenome(in.sobrenome())
            .email(in.email())
            .genero(in.genero())
            .dataNascimento(in.dataNascimento())
            .cep(in.cep())
            .escolaridade(in.escolaridade())
            .ocupacao(in.ocupacao())
            .estudouEm(in.estudouEm())
            .renda_per_capita(in.renda_per_capita())
            .turno_disponivel(in.turno_disponivel())
            .disponibilidade_de_deslocamento(in.disponibilidade_de_deslocamento())
            .modalidade_do_ensino(in.modalidade_do_ensino())
            .areas_interesse(in.areas_interesse())
            .tipo_oportunidade(in.tipo_oportunidade())
            .natureza_instituicao(in.natureza_instituicao())
            .descricao(in.descricao())
            .build();
    }

    public static AlunoOut to(Aluno aluno) {
        return AlunoOut.builder()
            .id(aluno.id())
            .nome(aluno.nome())
            .sobrenome(aluno.sobrenome())
            .email(aluno.email())
            .genero(aluno.genero())
            .dataNascimento(aluno.dataNascimento())
            .cep(aluno.cep())
            .cidade(aluno.cidade())
            .uf(aluno.uf())
            .escolaridade(aluno.escolaridade())
            .ocupacao(aluno.ocupacao())
            .estudouEm(aluno.estudouEm())
            .renda_per_capita(aluno.renda_per_capita())
            .turno_disponivel(aluno.turno_disponivel())
            .disponibilidade_de_deslocamento(aluno.disponibilidade_de_deslocamento())
            .modalidade_do_ensino(aluno.modalidade_do_ensino())
            .areas_interesse(aluno.areas_interesse())
            .tipo_oportunidade(aluno.tipo_oportunidade())
            .natureza_instituicao(aluno.natureza_instituicao())
            .descricao(aluno.descricao())
            .build();
    }
    
}
