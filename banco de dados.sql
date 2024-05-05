CREATE DATABASE DB_BITFLY;
USE DB_BITFLY;

CREATE TABLE TB_USUARIO(
	codigo INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(200),
    fone VARCHAR(200),
    email VARCHAR(200),
    cpf_cnpj VARCHAR(200)
);

CREATE TABLE TB_EVENTOS(
	codigo INT PRIMARY KEY AUTO_INCREMENT,
    empresa VARCHAR(200),
    dia VARCHAR (200),
    horario VARCHAR (200),
    lugar VARCHAR (200)
);

CREATE TABLE TB_PATROCINADORES(
	codigo INT PRIMARY KEY AUTO_INCREMENT,
    empresa VARCHAR(200),
    valor VARCHAR (200),
    cnpj VARCHAR (200),
    contato VARCHAR (200)
);



