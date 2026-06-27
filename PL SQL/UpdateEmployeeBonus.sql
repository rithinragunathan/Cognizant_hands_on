CREATE
OR REPLACE PROCEDURE UpdateEmployeeBonus(bonus IN Number, dept IN VARCHAR)
       IS (
       begin
       UPDATE employees set salary = salary + (bonus * 0.01) where department = dept;
       )
end;
/