drop table if exists notification;
drop table if exists admin;
drop table if exists position;
drop table if exists chat_message;
drop table if exists `user`;
create table `user`
(
    id        int primary key auto_increment,
    username  varchar(20) unique,
    password  varchar(20),
    is_active tinyint
);
create table `position`
(
    id          int primary key auto_increment,
    user_id     int,
    longitude   float,
    latitude    float,
    altitude    float,
    insert_time datetime,
    foreign key (user_id) references user (id)
);
create table `chat_message`
(
    id          int primary key auto_increment,
    sender_id   int,
    receiver_id int,
    message varchar(10000),
    send_time   datetime,
    foreign key (sender_id) references user (id),
    foreign key (receiver_id) references user (id)
);
create table `admin`
(
    id       int primary key auto_increment,
    username varchar(20) unique,
    password varchar(20)

);
create table notification
(
    id           int primary key auto_increment,
    admin_id     int,
    content      text(10000),
    publish_time datetime,
    foreign key (admin_id) references admin (id)
);

insert into `user`
values (1, 'zhangsan', '123456', 1),
       (2, 'lisi', '123456', 1),
       (3, 'lisi1', '123456', 0);
insert into position
values (1, 1, 1.1, 2.2, 3.3, '2018-12-22 12:21:34'),
       (2, 1, 1.1, 2.3, 3.3, '2018-12-22 12:22:35'),
       (3, 1, 1.1, 2.4, 3.3, '2018-12-22 12:23:36'),
       (4, 1, 1.1, 2.5, 3.3, '2018-12-22 12:25:37'),
       (5, 1, 1.1, 2.6, 3.3, '2018-12-22 12:26:34'),
       (6, 1, 1.1, 2.7, 3.3, '2018-12-22 12:27:35'),
       (7, 1, 1.1, 2.8, 3.3, '2018-12-22 12:28:36'),
       (8, 1, 1.1, 2.9, 3.3, '2018-12-22 12:29:34'),
       (9, 1, 1.1, 3.2, 3.3, '2018-12-22 12:30:35'),
       (10, 1, 1.1, 4.3, 3.3, '2018-12-22 12:11:36');



insert into chat_message
values (1, 1, 2, '你好', '2019-11-22 12:32:33'),
       (2, 2, 1, '你也好', '2019-11-22 12:36:33');
insert into `admin`
values (1, 'wangwu', '123456');
insert into `notification`
values (1, 1, '123456', '2019-11-22 13:23:44'),
       (2, 1, '12345611', '2019-11-23 13:23:44');
