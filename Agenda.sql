/*create table cliente(
    cpf integer not null,
    nome varchar(100) not null,
    rg varchar(20) not null,
    email varchar(100)
    constraint pk_cli primary key (cpf),
    constraint pf_dep_proj foreign key (cd_dep)
        references empresa.departamento (codigo)
        on delete restrict on update cascade
);*/

create table pessoa(
    cpf integer not null,
    nome varchar(100) not null,
    rg varchar(20) not null,
    email varchar(100),
    constraint pk_pesso primary key (cpf)
);

create table telefone(
    cpf_pessoa integer not null,
    zap boolean default false,
    constraint pf_tel_pe foreign key (cpf_pessoa)
        references pessoa (cpf)
        on delete restrict on update cascade
);

create table endereco(
    cpf_pessoa integer not null,
    rua varchar(100) not null,
    numero int,
    complemento varchar(19),
    bairro varchar(100) not null,
    cidade varchar(100) default "Montes Claros",
    uf varchar(8) default "MG",
    cep varchar(15), 
    constraint pf_cpf foreign key (cpf_pessoa)
        references pessoa (cpf)
        on delete restrict on update cascade
);

create table cliente(
   cpf_pessoa integer not null,
    genero varchar(15),
constraint pf_cpf_cli foreign key (cpf_pessoa)
        references pessoa (cpf)
        on delete restrict on update cascade
);

create table cargo(
   codigo int auto_increment  not null,
    nome varchar(15),
    constraint pk_cargo primary key (codigo)
);

create table funcionario(
    matricula int auto_increment  not null,
    cpf_pessoa integer not null,
    senha varchar(36) not null,
    cargo int not null,
    nivel int default 1,
        constraint pk_fun primary key (matricula),
        
        constraint pf_cpf_fun foreign key (cpf_pessoa)
        references pessoa (cpf)
        on delete restrict on update cascade,
        
        constraint pf_cargo foreign key (cargo)
        references cargo (codigo)
        on delete restrict on update cascade
);

create table tiposervico(
   codigo int auto_increment  not null,
    nome varchar(15),
    duracao time,
    valor float not null,
    constraint pk_ts primary key (codigo)
);

create table servico(
    cpf_pessoa integer not null,
    codigo_funcionario int not null,
    desconto float default 0.00,
    data_aten date not null,
    hora_aten time not null,
    pago boolean,
    
        constraint pfcpfcli foreign key (cpf_pessoa)
        references cliente (cpf_pessoa)
        on delete restrict on update cascade,
        
        constraint pf_codigo_fun foreign key (codigo_funcionario)
        references funcionario (matricula)
        on delete restrict on update cascade
);
