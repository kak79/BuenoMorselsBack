



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

insert into restaurant 
(restaurant_name, description, rating, cusine)
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
(image_url, user_id, meal_id, description, liked) 
values 
('http://dummyimage.com/203x100.png/5fa2dd/ffffff', 3, 8, 'Vestibulum rutrum rutrum neque.', false),
('http://dummyimage.com/141x100.png/5fa2dd/ffffff', 8, 4, 'Donec posuere metus vitae ipsum.', false),
('http://dummyimage.com/163x100.png/dddddd/000000', 2, 2, 'Pellentesque eget nunc.', true),
('http://dummyimage.com/119x100.png/5fa2dd/ffffff', 5, 8, 'Aenean fermentum.', false),
('http://dummyimage.com/141x100.png/ff4444/ffffff', 2, 6, 'Suspendisse potenti.', true),
('http://dummyimage.com/110x100.png/cc0000/ffffff', 5, 18, 'Vestibulum quam sapien, interdum in, ante.', false),
('http://dummyimage.com/108x100.png/ff4444/ffffff', 8, 20, 'Suspendisse potenti.', false),
('http://dummyimage.com/233x100.png/dddddd/000000', 4, 8, 'Proin interdum mauris non ligula pellentesque ultrices.', true),
('http://dummyimage.com/114x100.png/dddddd/000000', 6, 10, 'Duis bibendum.', true),
('http://dummyimage.com/249x100.png/ff4444/ffffff', 3, 20, 'Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.', false);











