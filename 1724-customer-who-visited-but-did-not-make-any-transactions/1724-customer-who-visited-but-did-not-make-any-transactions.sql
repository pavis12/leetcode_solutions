# Write your MySQL query statement below
select distinct(customer_id),count(customer_id) as count_no_trans
from 
Visits
left join
Transactions
on 
Visits.visit_id = transactions.visit_id
where
transaction_id is null
GROUP BY 
Visits.customer_id;;