create table restaurante
(
	id bigint not null auto_increment,
    nome varchar(255),
    taxa_frete decimal(10.2),
    ativo boolean,
    aberto boolean,
    data_cadastro datetime,
    data_atualizacao datetime,
    
    primary key(id)
)