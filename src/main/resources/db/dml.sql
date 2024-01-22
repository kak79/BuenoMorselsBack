



insert into usr 
(first_name, last_name, username, passwd, email, is_active, is_not_locked) 
values 
('Berti', 'Clampton', 'bclampton0', 'yV2.gZuH1,', 'bclampton0@yandex.ru', false, true),
('Meagan', 'Bagnall', 'mbagnall1', 'mT5@>~F''1', 'mbagnall1@ehow.com', false, false),
('Otis', 'Sivewright', 'osivewright2', 'uD9&iY2q}t"', 'osivewright2@icio.us', false, true),
('Jolyn', 'Tidey', 'jtidey3', 'yN9*n@Zw?HpC?', 'jtidey3@example.com', true, true),
('Jennee', 'Harrismith', 'jharrismith4', 'bR2}LRHkG`O8P', 'jharrismith4@skyrock.com', false, false),
('Kendra', 'Robjents', 'krobjents5', 'wC1''FSYO', 'krobjents5@so-net.ne.jp', false, true),
('Colette', 'Lucian', 'clucian6', 'yI1_Zp/|r', 'clucian6@newyorker.com', false, true),
('Merci', 'Yakovich', 'myakovich7', 'yM5"VcX5U%~RE*', 'myakovich7@skype.com', false, true),
('Galvin', 'Frearson', 'gfrearson8', 'dU1_1lY`\', 'gfrearson8@msn.com', false, true),
('Antoni', 'Scaice', 'ascaice9', 'uO2$crhW', 'ascaice9@mayoclinic.com', true, false);

insert into meal 
(meal_name) 
values 
('Egg White Omlette with Spinach and Mushrooms'),
('Beef Stroganoff'),
('Eggs Benedict'),
('Ribeye Steak'),
('Seafood Alfredo with Brocolli'),
('Baked Spagetti'),
('Loaded BBQ Baked Potato'),
('Seared Cedar Plank Salmon'),
('Steak Asagio Ceasar Salad'),
('Sweet Potato Suffle');

insert into restaurant 
(restaurant_name, description, restaurant_rating, cusine)
values 
('Osinski-Koelpin', 'Vestibulum ante ipsum primis in faucibus orci .', 1, 'Chinese'),
('Bosco, Botsford and McDermott', 'Etiam faucibus cursus urna.', 1, 'Italian'),
('Balistreri, Huels and Swaniawski', 'Duis consequat dui nec nisi volutpat eleifend.', 4, 'Chinese'),
('Pollich, Lemke and Skiles', 'Maecenas leo odio, luctus nec, molestie sed, justo.', 1, 'American'),
('Cartwright and Lakin', 'Maecenas ut massa quis. Nulla mollis molestie lorem.', 2, 'Fusion'),
('Stanton, Bauch and Mills', 'Donec dapibus. Duis at velit eu est congue elementum.', 4, 'American'),
('McDermott-Simonis', 'Vivamus vel nulla eget eros. Quisque porta volutpat erat.', 3, 'Fusion'),
('Braun-Blick', 'Proin at turpis a pede posuere nonummy. Integer non velit.', 2, 'Fusion'),
('Rowe LLC', 'Curabitur in libero ut massa volutpat convallis.', 3, 'American'),
('Block-Hirthe', 'Nulla mollis molestie lorem. Quisque ut erat.', 5, 'Italian');

insert into user_pic 
(image_url, user_id, description) 
values 
('https://robohash.org/fugaquiaet.png?size=50x50&set=set1', 1, 'Praesent blandit lacinia erat.'),
('https://robohash.org/auttemporibusut.png?size=50x50&set=set1', 2, 'Aliquam augue quam, rutrum at, lorem.'),
('https://robohash.org/eosteneturvoluptas.png?size=50x50&set=set1', 3, 'Phasellus sit amet erat.'),
('https://robohash.org/doloresdolorest.png?size=50x50&set=set1', 4, 'Integer ac neque.'),
('https://robohash.org/quosetvoluptatem.png?size=50x50&set=set1', 5, 'Nullam orci pede, venenatis non.'),
('https://robohash.org/corruptianiminon.png?size=50x50&set=set1', 6, 'In tempor.'),
('https://robohash.org/quitemporehic.png?size=50x50&set=set1', 7, 'Integer aliquet, massa id lobortis convallis.'),
('https://robohash.org/nesciuntmolestiaetempore.png?size=50x50&set=set1', 8, 'Pellentesque viverra pede ac diam.'),
('https://robohash.org/essefacilisducimus.png?size=50x50&set=set1', 9, 'Donec posuere metus vitae ipsum.'),
('https://robohash.org/quiaplaceatsint.png?size=50x50&set=set1', 10, 'Pellentesque ultrices mattis odio.');

insert into meal_pic 
(meal_image_url, user_id, meal_id, description, liked) 
values 
('http://dummyimage.com/203x100.png/5fa2dd/ffffff', 3, 8, 'Vestibulum rutrum rutrum neque.', false),
('http://dummyimage.com/141x100.png/5fa2dd/ffffff', 8, 4, 'Donec posuere metus vitae ipsum.', false),
('http://dummyimage.com/163x100.png/dddddd/000000', 2, 2, 'Pellentesque eget nunc.', true),
('http://dummyimage.com/119x100.png/5fa2dd/ffffff', 5, 8, 'Aenean fermentum.', false),
('http://dummyimage.com/141x100.png/ff4444/ffffff', 2, 6, 'Suspendisse potenti.', true),
('http://dummyimage.com/110x100.png/cc0000/ffffff', 5, 1, 'Vestibulum quam sapien, interdum in, ante.', false),
('http://dummyimage.com/108x100.png/ff4444/ffffff', 8, 2, 'Suspendisse potenti.', false),
('http://dummyimage.com/233x100.png/dddddd/000000', 4, 8, 'Proin interdum mauris non ligula pellentesque ultrices.', true),
('http://dummyimage.com/114x100.png/dddddd/000000', 6, 10, 'Duis bibendum.', true),
('http://dummyimage.com/249x100.png/ff4444/ffffff', 3, 5, 'Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.', false);

insert into post 
(title, user_id, meal_id, restaurant_id, post_text, post_rating, meal_pic_id, sent_at) 
values 
('Schmedeman', 6, 8, 6, 'In blandit ultrices enim.', 3, 6, '2023-08-21 16:23:02'),
('Melody', 5, 2, 6, 'Cras non velit nec nisi vulputate nonummy.', 1, 5, '2023-03-01 02:48:51'),
('4th', 4, 2, 8, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', 3, 7, '2023-02-01 07:05:22'),
('Vidon', 4, 6, 8, 'Donec ut mauris eget massa tempor convallis.', 1, 6, '2023-06-09 09:16:34'),
('Luster', 10, 5, 4, 'Nunc rhoncus dui vel sem.', 4, 4, '2023-03-11 18:36:26'),
('Bultman', 3, 2, 2, 'Duis bibendum, felis sed interdum venenatis.', 1, 4, '2023-12-09 07:59:32'),
('Fremont', 3, 10, 5, 'Aenean fermentum.', 5, 6, '2023-02-17 04:28:07'),
('Homewood', 4, 6, 4, 'Curabitur at ipsum ac tellus semper interdum.', 1, 4, '2023-10-29 05:07:20'),
('Summit', 1, 8, 4, 'Phasellus sit amet erat.', 4, 3, '2023-10-05 23:30:13'),
('Lerdahl', 3, 7, 4, 'Fusce posuere felis sed lacus.', 4, 8, '2023-07-11 12:37:27');

insert into post_comment 
(user_id,post_id,comment_text)
values 
(6, 8,'In blandit ultrices enim.'),
(5, 2,'Cras non velit nec nisi vulputate nonummy.'),
(4, 2,'Lorem ipsum dolor sit amet, consectetuer adipiscing elit.'),
(4, 6,'Donec ut mauris eget massa tempor convallis.'),
(10, 5,'Nunc rhoncus dui vel sem.'),
(3, 2, 'Duis bibendum, felis sed interdum venenatis.'),
(3, 10, 'Aenean fermentum.'),
(4, 6,'Curabitur at ipsum ac tellus semper interdum.'),
(1, 8, 'Phasellus sit amet erat.'),
(3, 7,'Fusce posuere felis sed lacus.');

insert into user_role 
(user_id,post_id)
values 
(6, 8),
(5, 2),
(4, 2),
(4, 6),
(10, 5),
(3, 2),
(3, 10),
(4, 6),
(1, 8),
(3, 7);

insert into post_likes 
(liked,user_id,post_id)
values 
(true, 6, 8),
(false, 5, 2),
(true, 4, 2),
(false, 4, 6),
(true, 10, 5),
(true, 3, 2),
(true, 3, 10),
(false, 4, 6),
(true, 1, 8),
(false, 3, 7);













