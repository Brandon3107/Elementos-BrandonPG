create table usuario(id_usuario integer primary key auto_increment, login varchar(120), password varchar(120));
create table animal (
                    animal_id integer primary key auto_increment, 
                    nombre varchar(80), 
                    edad integer,
                    fecha_nacimiento date);
select * from usuario;
select * from animal;