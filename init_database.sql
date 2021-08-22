-- Database: project_test_db

-- DROP DATABASE project_test_db;

CREATE DATABASE project_test_db
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Russian_Russia.1251'
    LC_CTYPE = 'Russian_Russia.1251'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


-- public.resident definition

-- Drop table

-- DROP TABLE public.resident;

CREATE TABLE public.resident (
	id serial NOT NULL,
	"name" varchar NOT NULL,
	arrived timestamp NULL,
	CONSTRAINT resident_pk PRIMARY KEY (id)
);
CREATE UNIQUE INDEX resident_id_idx ON public.resident USING btree (id);


-- public."event" definition

-- Drop table

-- DROP TABLE public."event";

CREATE TABLE public."event" (
	id serial NOT NULL,
	"name" varchar NOT NULL,
	momentstart timestamp NULL,
	momentend timestamp NULL,
	resident_id int4 NULL,
	CONSTRAINT id_pk PRIMARY KEY (id)
);
CREATE UNIQUE INDEX event_id_idx ON public.event USING btree (id);


-- public."event" foreign keys

ALTER TABLE public."event" ADD CONSTRAINT event_fk FOREIGN KEY (resident_id) REFERENCES resident(id);


-- public.sale definition

-- Drop table

-- DROP TABLE public.sale;

CREATE TABLE public.sale (
	id serial NOT NULL,
	"name" varchar NOT NULL,
	event_id int4 NOT NULL,
	summ int4 NOT NULL,
	"timestamp" timestamp NULL,
	CONSTRAINT sales_pk PRIMARY KEY (id)
);
CREATE UNIQUE INDEX sales_id_idx ON public.sale USING btree (id);


-- public.sale foreign keys

ALTER TABLE public.sale ADD CONSTRAINT sales_fk FOREIGN KEY (event_id) REFERENCES event(id);


-- public.room definition

-- Drop table

-- DROP TABLE public.room;

CREATE TABLE public.room (
	id serial NOT NULL,
	"number" varchar NOT NULL,
	floor int4 NOT NULL,
	square float8 NOT NULL,
	CONSTRAINT room_pk PRIMARY KEY (id)
);


-- public.resident_room definition

-- Drop table

-- DROP TABLE public.resident_room;

CREATE TABLE public.resident_room (
	resident_id int4 NOT NULL,
	room_id int4 NOT NULL,
	CONSTRAINT resident_room_pk PRIMARY KEY (resident_id, room_id)
);


-- public.resident_room foreign keys

ALTER TABLE public.resident_room ADD CONSTRAINT resident_room_fk FOREIGN KEY (resident_id) REFERENCES resident(id);
ALTER TABLE public.resident_room ADD CONSTRAINT resident_room_fk_1 FOREIGN KEY (room_id) REFERENCES room(id);


-- public.event_seq definition

-- DROP SEQUENCE public.event_seq;

CREATE SEQUENCE public.event_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 7
	CACHE 1
	NO CYCLE;

ALTER TABLE public.event ALTER COLUMN id set default nextval('event_seq');
select setval('event_seq', 1);


-- public.resident_seq definition

-- DROP SEQUENCE public.resident_seq;

CREATE SEQUENCE public.resident_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 3
	CACHE 1
	NO CYCLE;

ALTER TABLE public.resident ALTER COLUMN id set default nextval('resident_seq');
select setval('resident_seq', 1);


-- public.room_seq definition

-- DROP SEQUENCE public.room_seq;

CREATE SEQUENCE public.room_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 2
	CACHE 1
	NO CYCLE;

ALTER TABLE public.room ALTER COLUMN id set default nextval('room_seq');
select setval('room_seq', 1);


-- public.sale_seq definition

-- DROP SEQUENCE public.sale_seq;

CREATE SEQUENCE public.sale_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 3
	CACHE 1
	NO CYCLE;

ALTER TABLE public.sale ALTER COLUMN id set default nextval('sale_seq');
select setval('sale_seq', 1);