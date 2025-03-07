# Write your MySQL query statement below
select name Customers from customers c
where
id 
not in
(select customerId from orders);