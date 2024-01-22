

drop table if exists post_likes cascade;
drop table if exists user_role cascade;
drop table if exists post_comment cascade;
drop table if exists post cascade;
drop table if exists meal_pic cascade;
drop table if exists user_pic cascade;
drop table if exists restaurant cascade;
drop table if exists meal cascade;
drop table if exists usr cascade;




CREATE TABLE usr (
    user_id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    username VARCHAR(50) NOT NULL,
    passwd VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    is_active VARCHAR(50) NOT NULL,
    is_not_locked VARCHAR(50) NOT NULL
);

CREATE TABLE meal (
	meal_id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    meal_name VARCHAR(50) NOT NULL
);

CREATE TABLE restaurant (
    restaurant_id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    restaurant_name VARCHAR(50) NOT NULL,
    description VARCHAR(200) NOT NULL,
    restaurant_rating VARCHAR(10) NOT NULL,
    cusine VARCHAR(50) NOT NULL
);

CREATE TABLE user_pic ( 
	image_id SERIAL PRIMARY KEY UNIQUE NOT NULL,
	image_url VARCHAR(500),
	user_id INTEGER NOT NULL REFERENCES usr,
	description VARCHAR(500)
);

CREATE TABLE meal_pic ( 
	meal_image_id SERIAL PRIMARY KEY UNIQUE NOT NULL,
	meal_image_url VARCHAR(500),
	user_id INTEGER NOT NULL REFERENCES usr,
	meal_id INTEGER NOT NULL REFERENCES meal,
	description VARCHAR(500),
	liked BOOL NOT NULL
);

CREATE TABLE post (
    post_id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    title VARCHAR(50),    
    user_id INTEGER NOT NULL REFERENCES usr,
    meal_id INTEGER NOT NULL REFERENCES meal,
    restaurant_id INTEGER NOT NULL REFERENCES restaurant,
    post_text VARCHAR(500),
    post_rating INTEGER NOT NULL,
    meal_pic_id INTEGER NOT NULL REFERENCES meal_pic,
    sent_at TIMESTAMP WITHOUT TIME ZONE NOT NULL
);

CREATE TABLE post_comment ( 
	comment_id SERIAL PRIMARY KEY UNIQUE NOT NULL,
	user_id INTEGER NOT NULL REFERENCES usr,
	post_id INTEGER NOT NULL REFERENCES post,
	comment_text VARCHAR(500)
);

CREATE TABLE user_role ( 
	follower_id SERIAL PRIMARY KEY UNIQUE NOT NULL,
	user_id INTEGER NOT NULL REFERENCES usr,
	post_id INTEGER NOT NULL REFERENCES post
);

CREATE TABLE post_likes (
    liked BOOL NOT NULL,
    user_id INTEGER NOT NULL REFERENCES usr,
    post_id INTEGER NOT NULL REFERENCES post
);






















