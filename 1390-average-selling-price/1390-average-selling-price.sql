# Write your MySQL query statement below
select p.product_id,IFNULL(ROUND(SUM(price * units) / SUM(units), 2), 0) as average_price 
from prices p 
left join unitssold u
on 
p.product_id=u.product_id
and 
purchase_date BETWEEN start_date AND end_date
group by p.product_id;

