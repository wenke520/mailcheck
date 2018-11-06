--创建用户信息表
create table userinfo (
       user_id number not null,
       user_name varchar2(30),
       user_pwd varchar2(30),
       user_email varchar2(30),
       user_addr varchar2(50),
       user_sex varchar2(3),
       user_bir date,
       user_type number,
       user_coin number,
       user_head varchar2(100),
       primary key(user_id)
       
);

--文章发表时间，默认值，开挂，系统时间
create table article (
       article_id number,
       article_title varchar2(100),
       article_content varchar2(4000),
       article_visible varchar2(5),
       article_tag varchar2(30),
       article_file number,
       article_date date,
       article_bro number,
       user_id number,
       primary key(article_id)
);
--评论表,评论时间，默认开挂
create table commenter (
       commenter_id number,
       article_id number,
       commenter_content varchar2(4000),
       commenter_file varchar2(300),
       user_id number,
       commenter_date number,
       primary key (commenter_id)
       
);
--收藏中间表
create table collecter (
       user_id number,
       article_id number
);
--点赞中间表
create table agree(
       userid number,
       article_id number
);
--用户关注关系表
create table relationship(
       follow_id number  REFERENCES UserInfo(user_id),
       fans_id number  REFERENCES userinfo(user_id)
);

--文件表格

create table files(
       file_id number,
       file_title varchar2(50),
       file_src varchar2(60),
       file_coin number,
       file_downtime number
) ;

--金币详情表
create table coin(
       coin_id number,
       coin_date date,
       user_id number,
       file_id number,
       coin_number number，
       primary key(coin_id)
);
--创建序列
create sequence user_id_seq;
create sequence article_id_seq;
create sequence commenter_id_seq;
create sequence file_id_seq;
create sequence coin_id_seq;

--添加外键
alter table article add constraint fk_article_file
foreign key (files) references files(file_id);

alter table article add constraint fk_article_userinfo
foreign key (user_id) references userinfo(user_id);

alter table commenter add constraint fk_commenter_article
foreign key (article_id) references article(article_id);

alter table collecter add constraint fk_collecter_article
foreign key (article_id) references article(article_id);

alter table great add constraint fk_great_article
foreign key (article_id) references article(article_id);

alter table collecter add constraint fk_collecter_userinfo
foreign key (user_id) references userinfo(user_id);

alter table great add constraint fk_great_userinfo
foreign key (user_id) references userinfo(user_id);

alter table commenter add
constraints fk_commenter_userinfo
foreign key (user_id) references userinfo(user_id);



