Base de datos :D

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

Capturas de pantalla:
![Captura de pantalla 2024-08-08 155839](https://github.com/user-attachments/assets/13c38967-b554-4452-ae36-7cbbc8388a57)
![Captura de pantalla 2024-08-08 160122](https://github.com/user-attachments/assets/886a9beb-827b-4aec-b1b5-ed53f2a2639e)
![Captura de pantalla 2024-08-08 160254](https://github.com/user-attachments/assets/22844302-3403-437a-a365-d0f85da5644e)
![Captura de pantalla 2024-08-08 160326](https://github.com/user-attachments/assets/5f5c8940-cabe-4849-b44a-18c2b75ac639)
![Captura de pantalla 2024-08-08 160338](https://github.com/user-attachments/assets/7d9f4b76-0395-49a1-bc32-369793a86ad9)
![Captura de pantalla 2024-08-08 160551](https://github.com/user-attachments/assets/68aac5f4-4e46-49cb-8a1a-dfa3b35d1861)
![Captura de pantalla 2024-08-08 160653](https://github.com/user-attachments/assets/601e339a-7096-4c70-b7f8-a77fad820de0)
![Captura de pantalla 2024-08-08 160715](https://github.com/user-attachments/assets/124083ed-1f93-4c92-b797-d1ef7133a99b)
![Captura de pantalla 2024-08-08 160729](https://github.com/user-attachments/assets/77551690-3e0f-4cfa-8486-23c02e329438)
![Captura de pantalla 2024-08-08 160746](https://github.com/user-attachments/assets/87c140fc-0263-461d-9eab-4b29ddfa208e)
![Captura de pantalla 2024-08-08 160758](https://github.com/user-attachments/assets/8873d8b5-e3f1-40f1-a1be-2d01e5f3309a)
![Captura de pantalla 2024-08-08 161507](https://github.com/user-attachments/assets/04883b99-f405-4934-9b1f-6e7fc5e1dce2)
