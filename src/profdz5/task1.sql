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
    id          serial primary key,
    name_client varchar(30),
    phone       bigint
);
insert into clients (name_client, phone)
values ('Andrey', 89159625425);
insert into clients (name_client, phone)
values ('Oleg', 89159624232);
insert into clients (name_client, phone)
values ('Mariia', 89159626335);
insert into clients (name_client, phone)
values ('Kira', 89159626300);

create table orders
(
    id        serial primary key,
    flower_id integer REFERENCES flowers,
    name_id   integer REFERENCES clients,
    name      varchar(30) not null,
    quantity  integer     not null CHECK (quantity > 1 and quantity < 1000),
    total     integer     not null
);

insert into orders (flower_id, name_id, name, quantity, total)
values (1, 1, (select name_client from clients where id = 1), 7, (select price from flowers where id = 1) * 7);

insert into orders (flower_id, name_id, name, quantity, total)
values (3, 2, (select name_client from clients where id = 2), 11, (select price from flowers where id = 3) * 11);

insert into orders (flower_id, name_id, name, quantity, total)
values (1, 3, (select name_client from clients where id = 3), 5, (select price from flowers where id = 1) * 5);

insert into orders (flower_id, name_id, name, quantity, total)
values (2, 2, (select name_client from clients where id = 2), 3, (select price from flowers where id = 2) * 3);

insert into orders (flower_id, name_id, name, quantity, total)
values (2, 4, (select name_client from clients where id = 4), 81, (select price from flowers where id = 2) * 81);


-- 1 запрос:

select *
from orders o,
     clients c,
     flowers f
where o.id = 2
  and c.id = o.name_id
  and f.id = o.flower_id;

-- 2 запрос:

select *
from orders,
     clients,
     flowers
where name = 'Mariia'
  and clients.id = name_id
  and flowers.id = flower_id;

-- 3 запрос:
select o.name, f.title, o.quantity
from orders o,
     flowers f
where quantity =
      (select max(quantity) from orders)
  and f.id = flower_id;

-- 4 запрос:
select sum(total) as "Total cost"
from orders;
