# Write your MySQL query statement below
select name Employee
from employee e
where 
e.salary > (select salary from employee where id = e.managerId);