create table flowers
(
    id    serial primary key,
    title varchar(30),
    price integer
);

insert into flowers (title, price)
values ('Rose', 100);
insert into flowers (title, price)
values ('Liliya', 50);
insert into flowers (title, price)
values ('Romashka', 25);

create table clients
(
    id    serial primary key,
    name  varchar(30),
    phone bigint
);
insert into clients (name, phone)
values ('Andrey', 89159625425);
insert into clients (name, phone)
values ('Oleg', 89159624232);
insert into clients (name, phone)
values ('Mariia', 89159626335);

create table orders
(
    id        serial primary key,
    num_order int,
    name    varchar(30),
    flower    varchar(30),
    quantity  integer,
    cost      bigint
);
insert into orders (num_order, name, flower, quantity, cost)
values (1040, 'Andrey', 'Rose', 7, 700);
insert into orders (num_order, name, flower, quantity, cost)
values (1041, 'Oleg', 'Romashka', 11, 275);
insert into orders (num_order, name, flower, quantity, cost)
values (1042, 'Mariia', 'Rose', 5, 500);
insert into orders (num_order, name, flower, quantity, cost)
values (1043, 'Oleg', 'Liliya', 3, 150);
insert into orders (num_order, name, flower, quantity, cost)
values (1044, 'Kira', 'Liliya', 81, 4050);

-- 1 запрос:
select num_order, flower, quantity, cost, orders.name, phone
from orders, clients
where orders.name = clients.name and orders.name = (select name from orders where num_order = 1042);

-- 2 запрос:
select *
from orders
where name = (select name from clients where id = 2);

-- 3 запрос:
select name, flower, quantity, cost
from orders
where cost =
      (select max(cost) from orders);

-- 4 запрос:
select sum(cost) as "Total cost"
from orders;
