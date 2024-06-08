# Write your MySQL query statement below
select 
query_name,
round(sum(rating/position)/count(query_name),2)as quality,
round(
    sum(
        case when rating<3
        then 1
        else 0
        end
    )*100/count(*),2
)AS poor_query_percentage
from Queries
where query_name IS NOT NULL
group by query_name;