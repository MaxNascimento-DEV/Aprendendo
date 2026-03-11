select
CodigoDocliente,
NomeDaEmpresa,
cep
from clientes 
order by NomeDaEmpresa;

insert into transportadoras(NomeDaEmpresa, telefone)
values("Mercado Livre" , "40201735"); 

select CodigoDaTransportadora, 
NomeDaEMpresa,
telefone
from transportadoras
where NomeDaEmpresa like 'Mercado%';

update transportadoras set NomeDaEmpresa = "Mercado Livre" where CodigoDaTransportadora = 4;

delete from transportadoras where CodigoDaTransportadora = 4; 

select * from transportadoras;


select * from clientes;  

Select NomeDaEmpresa,
cidade,
pais
from clientes
order by NomeDaEmpresa;

select 
NomeDaEmpresa,
Cidade
from clientes 
where Cidade = "London";


select
CodigoDoFuncionario,
Nome
from Funcionarios
order by CodigoDoFuncionario
limit 10; 

select clientes.NomeDaEmpresa,
Pedidos.NumeroDoPedido
from clientes 
inner join pedidos 
on clientes.CodigoDoCliente = pedidos.CodigoDoCliente
where pedidos.NumeroDoPedido = 10429;




