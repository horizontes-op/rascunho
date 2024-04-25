
CREATE TABLE  aluno
(
    id_aluno VARCHAR(36) PRIMARY KEY,
    tx_nome VARCHAR(255) NOT NULL,
    tx_sobrenome VARCHAR(255) NOT NULL,
    tx_email VARCHAR(255) NOT NULL,
    tx_genero VARCHAR(255) NOT NULL,
    dt_nascimento DATE NOT NULL,
    tx_cep VARCHAR(255) NOT NULL,
    tx_cidade VARCHAR(255),
    tx_uf VARCHAR(255),
    tx_escolaridade VARCHAR(255),
    tx_ocupacao VARCHAR(255),
    tx_estudou_em VARCHAR(255),
    vl_renda_per_capita FLOAT,
    tx_turno_disponivel VARCHAR(255),
    tx_disponibilidade_deslocamento VARCHAR(255),
    tx_modalidade_ensino VARCHAR(255),
    tx_areas_interesse VARCHAR(255),
    tx_tipo_oportunidade VARCHAR(255),
    tx_natureza_instituicao VARCHAR(255),
    tx_descricao VARCHAR(255)
);
