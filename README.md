Base de datos

create table comidas(
	id_comida SERIAL not null primary key, 
	n_comida varchar (50) not null
);

create table ordenes(
	id_orden SERIAL not null primary key,
	cantidad varchar(50) not null,
	id_comida INTEGER REFERENCES comidas(id_comida)
);

insert into comidas (n_comida) values ('Manzana'); \n
insert into comidas (n_comida) values ('Pera'); \n
insert into comidas (n_comida) values ('Mango');
insert into comidas (n_comida) values ('Uva');
insert into comidas (n_comida) values ('Calabaza');
insert into comidas (n_comida) values ('Ciruela');
insert into comidas (n_comida) values ('Kiwi');
insert into comidas (n_comida) values ('Granadilla');
insert into comidas (n_comida) values ('Papaya');
insert into comidas (n_comida) values ('Sandia');
insert into comidas (n_comida) values ('Apio');
insert into comidas (n_comida) values ('Cebolla');
insert into comidas (n_comida) values ('Ajo');
insert into comidas (n_comida) values ('Tomillo');
insert into comidas (n_comida) values ('Pollo');
insert into comidas (n_comida) values ('Carne de res');
insert into comidas (n_comida) values ('Pescado');
insert into comidas (n_comida) values ('Carne de Cerdo');
insert into comidas (n_comida) values ('Lechuga');
insert into comidas (n_comida) values ('Tomate');

![Captura de pantalla 2024-08-08 155839](https://github.com/user-attachments/assets/13c38967-b554-4452-ae36-7cbbc8388a57) \n
![Captura de pantalla 2024-08-08 161507](https://github.com/user-attachments/assets/3f11e4dd-211e-493a-85a8-11d997dcbc50) \n




Hola
