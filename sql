CREATE DATABASE Shop;
GO
USE Shop;
GO

CREATE TABLE Product (
    id INT PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(50),
    price INT,
    quantity INT
);

INSERT INTO Product (name, price, quantity) VALUES (N'球鞋01', 1000, 1);
INSERT INTO Product (name, price, quantity) VALUES (N'球鞋02', 2000, 2);
INSERT INTO Product (name, price, quantity) VALUES (N'球鞋03', 3000, 3);
INSERT INTO Product (name, price, quantity) VALUES (N'球鞋04', 4000, 4);
INSERT INTO Product (name, price, quantity) VALUES (N'球鞋05', 5000, 5);
INSERT INTO Product (name, price, quantity) VALUES (N'球鞋06', 6000, 6);
INSERT INTO Product (name, price, quantity) VALUES (N'球鞋07', 7000, 7);
INSERT INTO Product (name, price, quantity) VALUES (N'球鞋08', 8000, 8);
INSERT INTO Product (name, price, quantity) VALUES (N'球鞋09', 9000, 9);
INSERT INTO Product (name, price, quantity) VALUES (N'球鞋10', 10000, 10);
