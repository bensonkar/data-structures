SELECT * FROM customers ORDER BY ScoredAmount DESC;
SELECT DATEDIFF('2017/08/25', '2011/08/25') AS DOB;
SELECT FirstName,LastName FROM customers;


#SAF SOLUTION
SELECT id,city,price
FROM (
         SELECT *, ROW_NUMBER() OVER
             (PARTITION BY city ORDER BY
             price ASC,id ASC) AS n
         FROM flats
     ) AS x

WHERE n <=3
ORDER by id