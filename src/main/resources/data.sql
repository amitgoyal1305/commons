
insert into orders values (10001,'Amit Goyal',sysdate(),'Pune',30);
insert into orders values (10002,'Akash',sysdate(),'Pune',50);
insert into orders values (10003,'Sachin',sysdate(),'Pune',60);
insert into orders values (10004,'Rohan',sysdate(),'Pune',20);



insert into order_item values(11101,'CR','Card Reader',10,10001);
insert into order_item values(11102,'PD','Pen Drive',10,10001);
insert into order_item values(11103,'HD','Hard Disk',10,10001);
insert into order_item values(11104,'CR','Card Reader',10,10002);
insert into order_item values(11105,'PD','Pen Drive',10,10002);
insert into order_item values(11106,'HD','Hard Disk',10,10003);
insert into order_item values(11107,'CR','Card Reader',10,10001);
insert into order_item values(11108,'PD','Pen Drive',10,10004);
insert into order_item values(11109,'HD','Hard Disk',10,10001);


/*
 create sequence hibernate_sequence start with 1 increment by 1

create table order_item (
id integer not null, 
product_code varchar(255), 
product_name varchar(255), 
quantity integer not null, 
order_id integer not null, 
primary key (id))

create table orders (
id integer not null, 
customer_name varchar(255), 
order_date timestamp, 
shipping_address varchar(255), 
total integer, primary key (id));

alter table order_item add constraint FKt4dc2r9nbvbujrljv3e23iibt foreign key (order_id) references orders
 
 
 
 
 
 
 
insert into orders values (10001,'Amit Goyal',sysdate(),'Pune',30,11101);
insert into orders values (10002,'Akash',sysdate(),'Pune',50,11102);
insert into orders values (10003,'Sachin',sysdate(),'Pune',60,11103);
insert into orders values (10004,'Rohan',sysdate(),'Pune',20,11102);
 
create table orders 
(id integer not null, 
customer_name varchar(255), 
order_date timestamp, 
shipping_address varchar(255), 
total integer, 
item_id integer,
primary key (id))

insert into orders values (10001,'Amit Goyal',11101,sysdate(),'Pune',30);
insert into orders values (10002,'Akash',11102,sysdate(),'Pune',50);
insert into orders values (10003,'Sachin',11103,sysdate(),'Pune',60);
insert into orders values (10004,'Rohan',11102,sysdate(),'Pune',20);





 create table order (
 id integer not null, 
 customer_name varchar(255), 
 item_id integer, 
 order_date timestamp, 
 shipping_address varchar(255), 
 total integer, primary key (id))
 */
