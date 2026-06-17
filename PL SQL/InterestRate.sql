DECLARE
    age NUMBER;
BEGIN
    FOR cust IN (
        SELECT
            customers.customerid,
            customers.name,
            customers.dob,
            loans.loanid
        FROM
                 customers
            JOIN loans ON customers.customerid = loans.customerid
    ) LOOP
        age := floor(months_between(sysdate, cust.dob) / 12);
        IF ( age > 60 ) THEN
            UPDATE loans
            SET
                interestrate = interestrate - 1
            WHERE
                loanid = cust.loanid;

        END IF;

    END LOOP;
END;
/
