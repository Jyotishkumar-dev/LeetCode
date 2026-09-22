# Write your MySQL query statement below
select t.teacher_id , count(distinct(t.subject_id)) as cnt 
from teacher as t 
group by teacher_id;