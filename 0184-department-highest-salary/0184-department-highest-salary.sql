WITH cte AS (
    SELECT 
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary DESC) AS rnk
    FROM employee e
    INNER JOIN department d
    ON e.departmentId = d.id
)
SELECT Department, Employee, Salary
FROM cte
WHERE rnk = 1;
