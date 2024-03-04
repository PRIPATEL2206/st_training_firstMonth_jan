--String fuctions
SELECT ASCII('name') AS asciiName;
SELECT REVERSE('Hello, World!') AS ReversedString;
SELECT CONCAT('SQL ', 'Tutorial ', 'is ', 'fun!') AS ConcatenatedString;
SELECT SOUNDEX('hello') AS SoundexCode;
SELECT LEN('Hello, World!') AS Length;
SELECT LEFT('Hello, World!', 5) AS LeftSubstring;
SELECT RIGHT('Hello, World!', 6) AS RightSubstring;
SELECT LTRIM('   Trimmed String') AS TrimmedString;
SELECT RTRIM('Trimmed String   ') AS TrimmedString;
SELECT SUBSTRING('Hello, World!', 7, 5) AS SubstringResult;
SELECT CHARINDEX('World', 'Hello, World!') AS SubstringPosition;
SELECT REPLACE('Hello, World!', 'Hello', 'Hi') AS ReplacedString;
SELECT REPLICATE('La', 3) AS RepeatedString;
SELECT STUFF('Hello, World!', 7, 5, 'Universe') AS ModifiedString;
SELECT UPPER('Hello, World!') AS UppercaseString;
SELECT LOWER('Hello, World!') AS LowercaseString;

-- Math Functions
SELECT ABS(-5) AS AbsoluteValue;
SELECT ROUND(3.14159, 2) AS RoundedValue;
SELECT CEILING(4.25) AS CeilingValue;
SELECT FLOOR(4.75) AS FloorValue;
SELECT POWER(2, 3) AS PowerResult;
SELECT SQRT(25) AS SquareRoot;
SELECT EXP(1) AS ExponentialValue;
SELECT LOG(10) AS NaturalLogarithm;
SELECT LOG10(100) AS LogBase10;
SELECT SIGN(-15) AS SignValue;
SELECT RAND() AS RandomValue;
SELECT PI() AS PiValue;
SELECT DEGREES(1.047) AS DegreesValue;
SELECT RADIANS(60) AS RadiansValue;
SELECT RAND(42) AS RandomValueWithSeed;

--Date Functions:
SELECT GETDATE() AS CurrentDateTime;
SELECT SYSDATETIME() AS CurrentDateTime;
SELECT CONVERT(VARCHAR, GETDATE(), 101) AS FormattedDate;
SELECT DATEADD(DAY, 7, GETDATE()) AS DateAfter7Days;
SELECT DATEDIFF(YEAR, '2000-01-01', GETDATE()) AS YearsDifference;
SELECT DATEPART(MONTH, GETDATE()) AS CurrentMonth;
SELECT DAY(GETDATE()) AS DayOfMonth;
SELECT MONTH(GETDATE()) AS CurrentMonth;
SELECT YEAR(GETDATE()) AS CurrentYear;
SELECT FORMAT(GETDATE(), 'MM/dd/yyyy') AS FormattedDate;
SELECT DATENAME(WEEKDAY, GETDATE()) AS DayOfWeek;

-- 4. Advance Functions
use social_media
SELECT username, email_id , ROW_NUMBER() OVER (ORDER BY username, email_id) AS RowNum FROM  Users;
SELECT username, email_id, RANK() OVER (ORDER BY username, email_id) AS RankNum FROM [Users];
SELECT username, email_id, DENSE_RANK() OVER (ORDER BY username, email_id) AS DenseRankNum FROM [Users];
SELECT username,  email_id, LAG(email_id) OVER (ORDER BY email_id, username) AS PreviousLastName FROM [Users];
use inventory_management;
WITH ExpensiveProducts AS (
    SELECT product_name, prize
    FROM products
    WHERE prize > 100
)
SELECT * FROM ExpensiveProducts;
