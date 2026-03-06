-- V2: Migrations para adicionar a coluna ranking de ninjas na tabela de cadastros

ALTER TABLE TB_CADASTRO_DE_NINJAS
ADD COLUMN GENERO VARCHAR(50);