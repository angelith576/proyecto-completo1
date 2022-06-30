use ventas;

create table detalle_factura(
id_detalle_factura int not null auto_increment primary key,
id_factura int (60)not null references factura (id_factura),
id_producto int (65) not null,
cantaidad_producto int (64) not null,
precio_producto double (65) not null,
fecha_creacion date not null,
fecha_eliminacion date null );