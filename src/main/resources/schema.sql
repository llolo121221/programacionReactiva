drop table if exists clientes;
create table clientes(id long primary key auto_increment,nombre varchar(30),identificacion varchar(12) unique); 