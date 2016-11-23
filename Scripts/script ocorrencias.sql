drop table ocorrencias;

create table ocorrencias(
	idOcorrencia serial,
	nome character varying (60),
	data_nasc  character varying  (15),
	cpf  character varying  (20) unique,
	rg  character varying  (10),
	estado  character varying  (15),
	sexo  character varying  (10),
	mae  character varying  (60),
	pai  character varying  (60),
	endereco  character varying  (100),
	numero  character varying  (5),
	complemento  character varying  (50),
	bairro  character varying  (20),
	cidade  character varying  (30),
	estado1  character varying  (15),
	cep  character varying  (10),
	telefoneres  character varying  (20),
	celular  character varying  (20),
	email  character varying  (60),
	descricao  character varying  (200)
	
);

select * from ocorrencias;