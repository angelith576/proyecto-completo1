use ventas;

create table factura(
    id_factura int not null auto_increment,
    id_cliente int not null,
    total double not null,
    fecha_creacion date not null,
    fecha_eliminacion date null,
    primary key(id_factura)
);