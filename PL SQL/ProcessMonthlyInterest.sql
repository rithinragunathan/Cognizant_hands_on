CREATE
OR REPLACE PROCEDURE ProcessMonthlyInterest
       AS
BEGIN
UPDATE Accounts
set balance = balance + (balance * 0.01)
WHERE accounts = 'Savings'
END;
/