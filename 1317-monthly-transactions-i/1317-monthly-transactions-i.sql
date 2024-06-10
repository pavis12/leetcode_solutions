# Write your MySQL query statement below
select left(trans_date,7) as month,country,
count(distinct(id)) trans_count,
sum(
    case when state='approved' then 1 else 0
    end
)approved_count,
sum(amount)trans_total_amount,
sum(
    case when state='approved' then amount else 0
    end
)
approved_total_amount
from transactions 
group by left(trans_date,7),country;