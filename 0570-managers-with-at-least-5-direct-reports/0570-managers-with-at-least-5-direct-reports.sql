# Write your MySQL query statement below
select name from employee where id in
(select distinct(managerId) from employee
group by managerId
having managerId is not null and count(managerId)>=5);