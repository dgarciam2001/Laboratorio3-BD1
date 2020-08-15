drop database cafeteria;
create database cafeteria;
use cafeteria;

create table proveedor(
IdPreveedor int primary key not null,
NombreProv varchar(50) not null,
Direccion varchar(50) not null,
Telefono varchar(50) not null
)Engine = InnoDB;

create table compraencabezado(
IdCompraEncabezado int primary key not null,
IdPreveedor int not null,
fechaCompraE date not null,
totalCompraE double(6,2) not null,
foreign key (IdPreveedor) references proveedor (IdPreveedor)
)Engine = InnoDB;

create table producto(
IdProducto int primary key not null,
NombreProducto varchar(30) not null,
Marca varchar(30) not null,
Linea varchar(30) not null,
costo double(10,2) not null,
PrecioProducto double(10,2) not null,
FacultadCompra varchar(30) not null,
FacultadVenta varchar(30) not null,
Fecha_Caducidad date not null
)Engine = InnoDB;

create table grupo(
IdGrupo int primary key not null,
NombreGrupo varchar(30) not null
)Engine = InnoDB;

create table empresa(
IdEmpresa int primary key not null,
NombreEmpresa varchar(55) not null,
Direccion varchar(55) not null,
IdGrupo int not null,
foreign key (IdGrupo) references grupo (IdGrupo)
)Engine = InnoDB;

create table departamento(
IdDepartamento int primary key not null,
NombreDep varchar(55) not null,
IdEmpresa int not null,
foreign key (IdEmpresa) references empresa (IdEmpresa)
)Engine = InnoDB;

create table Usuario(
IdUsuario int not null,
Nombre varchar(30) not null,
Pass varchar(30) not null,
primary key (IdUsuario)
)Engine = InnoDB;

create table bodega(
IdBodega int primary key not null,
NombreB varchar(30) not null,
seccionB varchar(128) not null
)Engine = InnoDB;

create table existencia(
IdExistencia int primary key not null,
IdProducto int not null,
IdBodega int not null,
foreign key (IdProducto) references producto (IdProducto),
foreign key (IdBodega) references bodega (IdBodega)
)Engine = InnoDB;

create table compradetalle(
IdProducto int not null,
Idcompraencabezado int not null,
foreign key (IdProducto) references producto (IdProducto),
foreign key (Idcompraencabezado) references compraencabezado (Idcompraencabezado)
)Engine = InnoDB;

create table vendedores(
Idvendedor int primary key not null,
nombreVendedor varchar(35) not null,
telefonoVendedor varchar(128) not null,
correoVendedor varchar(128) not null,
estadoVendedor varchar(128) not null,
edadVendedor int not null,
sueldoVendedor double(6,2) not null
)Engine = InnoDB;

create table puesto(
IdPuesto int primary key not null,
Nombrepuesto varchar(55) not null,
IdDepartamento int not null,
Idvendedor int not null,
foreign key (IdVendedor) references vendedores (IdVendedor),
foreign key (IdDepartamento) references departamento (IdDepartamento)
)Engine = InnoDB;

create table moneda(
IdMoneda int primary key not null,
Nombre varchar(30) not null,
estado boolean not null,
monedaCambio double(10,2) not null,
Simbolo varchar(2) not null
)Engine = InnoDB;

create table movimientomoneda(
IdMoneda int not null,
fecha int not null,
movimientocambio int not null,
primary key (IdMoneda, fecha),
foreign key (IdMoneda) references moneda (IdMoneda)
)Engine = InnoDB;

create table clientes(
IdCliente int primary key not null,
NombreCliente varchar(50) not null,
Correo varchar(50) not null,
Direccion varchar(50) not null,
Telefono varchar(13) not null,
Idvendedor int not null,
foreign key (Idvendedor) references vendedores (Idvendedor)
)Engine = InnoDB;

create table serie(
Codigo Varchar(30) primary key not null,
anio date not null
)Engine = InnoDB;

create table sucursal(
CodigoSucursal int primary key not null,
NombreSucursal varchar(30) not null,
DireccionSucursal varchar(30) not null
)Engine = InnoDB;

create table ventaencabezado(
CodigoVenta int not null,
IdEmpresa int not null,
CodigoSucursal int not null,
Codigo Varchar(30) not null,
Fechaventa date not null,
Total double (10,2) not null,
IdMoneda int not null,
IdCliente int not null,
primary key (CodigoVenta,IdEmpresa, CodigoSucursal, Codigo),
foreign key (IdEmpresa) references empresa (IdEmpresa),
foreign key (Codigo) references serie (Codigo),
foreign key (CodigoSucursal) references sucursal (CodigoSucursal),
foreign key (IdMoneda) references moneda (IdMoneda),
foreign key (IdCliente) references clientes (IdCliente)
)Engine = InnoDB;

create table ventadetalle(
Orden int not null,
CodigoVenta int not null,
IdProducto int not null,
CantidadFacDet int not null,
CostoFacDet double (10,2) not null,
PrecioFactDet double(10,2) not null,
primary key (Orden, CodigoVenta, IdProducto),
foreign key (CodigoVenta) references ventaencabezado (CodigoVenta),
foreign key (IdProducto) references producto (IdProducto)
)Engine = InnoDB;