# Write your MySQL query statement below
#select class from courses 
#select class from courses 
#where (class,student)
select class from courses
group by class
having count(student)>=5
;