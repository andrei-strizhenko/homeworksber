create table orders
(
    id        serial primary key,
    name      varchar(30) not null,
    surname      varchar(30) not null,
    birthday     varchar(30) not null,
    phone    bigint  not null,
    email  varchar(30) not null,
    list_id  bigint REFERENCES books

);
create table books
(
    id       serial primary key,
    title     varchar(30) not null,

);