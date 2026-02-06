SELECT 
    department_name AS Department,
    name AS Employee,
    salary AS Salary
FROM (
    SELECT
        e.name,
        e.salary,
        d.name AS department_name,
        DENSE_RANK() OVER (PARTITION BY d.id ORDER BY e.salary DESC) AS rnk
    FROM Employee e
    JOIN Department d 
        ON e.departmentId = d.id
) ranked
WHERE rnk <= 3;