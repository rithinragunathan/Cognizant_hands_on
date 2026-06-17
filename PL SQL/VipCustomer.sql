ALTER TABLE CUSTOMERS
    ADD isVip boolean;

BEGIN
    FOR cust IN ( SELECT CustomerID, Balance FROM Customers )
        LOOP
            IF cust.Balance > 10000 THEN UPDATE Customers SET IsVIP = true WHERE CustomerID = cust.CustomerID; END IF;
        END LOOP;
    COMMIT;
END;
/