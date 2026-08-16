# Write your MySQL query statement below
/*select salary as SecondHighestSalary
from Employee
select max(salary) from Employee;
where SecondHighestSalary>300;
*/
select(
    select distinct salary 
from Employee
order by salary DESC
limit 1 offset 1
)
as SecondHighestSalary;