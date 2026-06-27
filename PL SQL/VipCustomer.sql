BEGIN
    FOR cus in (
        SELECT CUSTOMERS.CUSTOMERID, CUSTOMERS.NAME, LOANS.CUSTOMERID, LOANS.ENDDATE
        FROM CUSTOMERS join LOANS on CUSTOMERS.CUSTOMERID = LOANS.CUSTOMERID where LOANS.ENDDATE = sysdate + 30)
        loop
            DBMS_OUTPUT.PUT_LINE( cus.NAME || ' has last date of ' || cus.ENDDATE );

        end loop;

end;