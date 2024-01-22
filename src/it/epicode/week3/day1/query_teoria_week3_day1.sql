select * from public.studenti;

select * from public.corsi;

Select * from public.esami;

select * from public.corsi;

select * from public.corsi where aula='a12';

select nome from public.corsi where aula='a12';

select * from public.corsi where id>1;

select * from public.corsi where nome like '__s%';

select * from public.corsi where aula in('a11','a12');

select * from public.esami inner join public.studenti on matricola=studente;

select * from public.esami e inner join public.corsi c on e.corso=c.id;

select * from public.corsi order by nome desc;

select count(*) from public.corsi;

select max(id) from public.corsi;

