# Write your MySQL query statement below
/*select name from customer where name not in(select name 
from customer
where referee_id=2);*/
select name 
from customer
where referee_id not in(2) or referee_id is null ;