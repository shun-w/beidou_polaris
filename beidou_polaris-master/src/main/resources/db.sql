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
    message     varchar(2000),
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
    id      int primary key auto_increment,
    admin_id int,
    content text(10000),
    foreign key (admin_id) references admin(id)
);
