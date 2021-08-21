-- set schema 'public';
--DROP TABLE IF EXISTS public.jsons;
--CREATE TABLE public.jsons(id serial PRIMARY KEY, string VARCHAR(255));
INSERT INTO public.jsons(string) VALUES('Bratislava');
INSERT INTO public.jsons(string) VALUES('Budapest');
INSERT INTO public.jsons(string) VALUES('Prague');
INSERT INTO public.jsons(string) VALUES('Warsaw');
INSERT INTO public.jsons(string) VALUES('Los Angeles');
INSERT INTO public.jsons(string) VALUES('New York');
INSERT INTO public.jsons(string) VALUES( 'Edinburgh');
INSERT INTO public.jsons(string) VALUES('Berlin');

CREATE TABLE public.xmls(id serial PRIMARY KEY, string VARCHAR(255));
INSERT INTO public.xmls(string) VALUES('AXML1')