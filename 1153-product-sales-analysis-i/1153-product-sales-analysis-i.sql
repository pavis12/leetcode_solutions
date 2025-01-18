# Write your MySQL query statement below
select product_name,year,price
from sales
inner join
Product
on
sales.product_id = product.product_id
order by
sales.product_id;