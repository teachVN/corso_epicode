select * from public.clienti where nome like '%Mario%';

select nome, cognome from public.clienti where anno_di_nascita=1982;

select numero_fattura from public.fatture where iva=20;

select count(*) conteggio_fatture  from public.fatture where iva=20;

select * from public.prodotti 
where extract(year from data_attivazione)=2017 and (in_produzione=true or in_commercio=true);

select * from public.fatture f join public.clienti c on f.id_cliente=c.numero_cliente
where importo<1000;

select numero_fattura, importo, iva, data_fattura, denominazione
from public.fatture fa inner join public.fornitori fo on fa.numero_fornitore = fo.numero_fornitore;

select count(*), extract(year from data_fattura) anno
from public.fatture
where iva=20
group by anno;

select count(*), sum(importo), extract(year from data_fattura) anno
from public.fatture
group by anno;

select extract(year from data_fattura) anno
from public.fatture
where tipologia='A'
group by anno
having count(*)>2;

select sum(importo), regione_residenza
from public.fatture inner join public.clienti
on id_cliente=numero_cliente
group by regione_residenza;

select count(distinct numero_cliente)
from public.fatture inner join public.clienti
on id_cliente=numero_cliente
where anno_di_nascita=1980 and importo>50;







