



CREATE TABLE usr (
    user_id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    username VARCHAR(50) NOT NULL,
    passwd VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    role_id INTEGER NOT NULL REFERENCES user_role,
    is_active VARCHAR(50) NOT NULL,
    is_not_locked VARCHAR(50) NOT NULL,
    user_pic_id INTEGER NOT NULL REFERENCES user_pic,
    meal_id INTEGER NOT NULL REFERENCES meal
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

CREATE TABLE restaurant (
    restaurant_id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    restaurant_name VARCHAR(50) NOT NULL,
    description VARCHAR(200) NOT NULL,
    restaurant_rating VARCHAR(10) NOT NULL,
    cusine VARCHAR(50) NOT NULL
);

CREATE TABLE post_likes (
    liked BOOL NOT NULL,
    user_id INTEGER NOT NULL REFERENCES usr,
    post_id INTEGER NOT NULL REFERENCES post
);

CREATE TABLE rol (  --role?

);

CREATE TABLE meal (

);

--CREATE TABLE public.user_comment (
--    id integer NOT NULL,
--    review_id integer,
--    user_id integer,
--    comment_text character varying(50) NOT NULL,
--    sent_at timestamp without time zone NOT NULL
--);


--CREATE TABLE public.user_rank (
--    id integer NOT NULL,
--    rank_title character varying(50) NOT NULL
--);


--CREATE TABLE public.movie_rating (
--    rating integer NOT NULL,
--    user_id integer NOT NULL,
--    movie_id integer NOT NULL
--);


















