--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12.2

-- Started on 2020-05-05 16:55:20 -03

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3282 (class 1262 OID 18833)
-- Name: BibliotecaUTFPR; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "BibliotecaUTFPR" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'C' LC_CTYPE = 'C';


ALTER DATABASE "BibliotecaUTFPR" OWNER TO postgres;

\connect "BibliotecaUTFPR"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 215 (class 1259 OID 18999)
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 202 (class 1259 OID 18834)
-- Name: tb_aluno; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_aluno (
    ra_aluno integer,
    id_usuario integer NOT NULL
);


ALTER TABLE public.tb_aluno OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 18839)
-- Name: tb_autor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_autor (
    id_autor integer NOT NULL,
    nome_autor character varying(120),
    id_obra integer
);


ALTER TABLE public.tb_autor OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 18844)
-- Name: tb_categoria_leitor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_categoria_leitor (
    id_categoria_leitor integer NOT NULL,
    descricao_categoria_leitor character varying(50),
    dias_categoria_leitor integer,
    qtde_emprestimo_categoria_leitor integer
);


ALTER TABLE public.tb_categoria_leitor OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 18849)
-- Name: tb_categoria_obra; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_categoria_obra (
    id_categoria_obra integer NOT NULL,
    descricao_categoria_obra character varying(50),
    multa_dia_categoria_obra double precision,
    nro_dias_categoria_obra integer
);


ALTER TABLE public.tb_categoria_obra OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 18854)
-- Name: tb_cidade; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_cidade (
    id_cidade integer NOT NULL,
    descricao_cidade character varying(200),
    id_estado integer
);


ALTER TABLE public.tb_cidade OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 18859)
-- Name: tb_emprestimo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_emprestimo (
    id_emprestimo integer NOT NULL,
    situacao_emprestimo character varying(10),
    ra_aluno integer,
    siape_funcionario integer,
    reserva_id integer
);


ALTER TABLE public.tb_emprestimo OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 18864)
-- Name: tb_estado; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_estado (
    id_estado integer NOT NULL,
    descricao_estado character varying(50),
    sigla_estado character varying(2)
);


ALTER TABLE public.tb_estado OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 18869)
-- Name: tb_funcionario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_funcionario (
    siape_funcionario integer,
    id_usuario integer NOT NULL
);


ALTER TABLE public.tb_funcionario OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 18874)
-- Name: tb_item_emprestimo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_item_emprestimo (
    id_item_emprestimo integer NOT NULL,
    dt_devolucao_item_emprestimo timestamp without time zone,
    dt_emprestimo_item_emprestimo timestamp without time zone,
    dt_prev_devolucao_item_emprestimo timestamp without time zone,
    situacao_item_emprestimo boolean,
    valor_multa_item_emprestimo double precision,
    id_emprestimo integer,
    id_reserva integer
);


ALTER TABLE public.tb_item_emprestimo OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 18879)
-- Name: tb_obra; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_obra (
    id_obra integer NOT NULL,
    disponivel_obra boolean,
    dt_publicacao_obra timestamp without time zone,
    edicao_obra character varying(50),
    editora_obra character varying(50),
    isbn_obra character varying(20),
    nro_paginas_obra integer,
    palavras_chave_obra character varying(200),
    titulo_obra character varying(50),
    id_categoria_obra integer
);


ALTER TABLE public.tb_obra OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 18884)
-- Name: tb_reserva; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_reserva (
    id_reserva integer NOT NULL,
    dt_prevista_retirada timestamp without time zone,
    dt_reserva timestamp without time zone,
    ra_aluno integer
);


ALTER TABLE public.tb_reserva OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 18889)
-- Name: tb_tefefone; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_tefefone (
    id_telefone integer NOT NULL,
    ddd_telefone integer,
    nro_telefone integer,
    id_usuario integer
);


ALTER TABLE public.tb_tefefone OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 18894)
-- Name: tb_usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_usuario (
    id_usuario integer NOT NULL,
    bairro_usuario character varying(60),
    cep_usuario integer,
    cpf_usuario character varying(15),
    dt_nascimento_usuario timestamp without time zone,
    email_usuario character varying(50),
    logradouro_usuario character varying(200),
    nome_usuario character varying(100),
    senha_usuario character varying(20),
    situacao_usuario boolean,
    id_categoria_leito integer,
    id_cidade integer,
    id_emprestimo integer,
    id_estado integer
);


ALTER TABLE public.tb_usuario OWNER TO postgres;

--
-- TOC entry 3106 (class 2606 OID 18838)
-- Name: tb_aluno tb_aluno_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_aluno
    ADD CONSTRAINT tb_aluno_pkey PRIMARY KEY (id_usuario);


--
-- TOC entry 3108 (class 2606 OID 18843)
-- Name: tb_autor tb_autor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_autor
    ADD CONSTRAINT tb_autor_pkey PRIMARY KEY (id_autor);


--
-- TOC entry 3110 (class 2606 OID 18848)
-- Name: tb_categoria_leitor tb_categoria_leitor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_categoria_leitor
    ADD CONSTRAINT tb_categoria_leitor_pkey PRIMARY KEY (id_categoria_leitor);


--
-- TOC entry 3112 (class 2606 OID 18853)
-- Name: tb_categoria_obra tb_categoria_obra_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_categoria_obra
    ADD CONSTRAINT tb_categoria_obra_pkey PRIMARY KEY (id_categoria_obra);


--
-- TOC entry 3114 (class 2606 OID 18858)
-- Name: tb_cidade tb_cidade_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_cidade
    ADD CONSTRAINT tb_cidade_pkey PRIMARY KEY (id_cidade);


--
-- TOC entry 3116 (class 2606 OID 18863)
-- Name: tb_emprestimo tb_emprestimo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_emprestimo
    ADD CONSTRAINT tb_emprestimo_pkey PRIMARY KEY (id_emprestimo);


--
-- TOC entry 3118 (class 2606 OID 18868)
-- Name: tb_estado tb_estado_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_estado
    ADD CONSTRAINT tb_estado_pkey PRIMARY KEY (id_estado);


--
-- TOC entry 3120 (class 2606 OID 18873)
-- Name: tb_funcionario tb_funcionario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_funcionario
    ADD CONSTRAINT tb_funcionario_pkey PRIMARY KEY (id_usuario);


--
-- TOC entry 3122 (class 2606 OID 18878)
-- Name: tb_item_emprestimo tb_item_emprestimo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_item_emprestimo
    ADD CONSTRAINT tb_item_emprestimo_pkey PRIMARY KEY (id_item_emprestimo);


--
-- TOC entry 3124 (class 2606 OID 18883)
-- Name: tb_obra tb_obra_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_obra
    ADD CONSTRAINT tb_obra_pkey PRIMARY KEY (id_obra);


--
-- TOC entry 3126 (class 2606 OID 18888)
-- Name: tb_reserva tb_reserva_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_reserva
    ADD CONSTRAINT tb_reserva_pkey PRIMARY KEY (id_reserva);


--
-- TOC entry 3128 (class 2606 OID 18893)
-- Name: tb_tefefone tb_tefefone_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_tefefone
    ADD CONSTRAINT tb_tefefone_pkey PRIMARY KEY (id_telefone);


--
-- TOC entry 3130 (class 2606 OID 18898)
-- Name: tb_usuario tb_usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_usuario
    ADD CONSTRAINT tb_usuario_pkey PRIMARY KEY (id_usuario);


--
-- TOC entry 3144 (class 2606 OID 18964)
-- Name: tb_reserva fk1b77e7e7fb9955d1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_reserva
    ADD CONSTRAINT fk1b77e7e7fb9955d1 FOREIGN KEY (ra_aluno) REFERENCES public.tb_aluno(id_usuario);


--
-- TOC entry 3137 (class 2606 OID 18929)
-- Name: tb_emprestimo fk22bae4203e5a3a05; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_emprestimo
    ADD CONSTRAINT fk22bae4203e5a3a05 FOREIGN KEY (reserva_id) REFERENCES public.tb_reserva(id_reserva);


--
-- TOC entry 3135 (class 2606 OID 18919)
-- Name: tb_emprestimo fk22bae4208b9463c2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_emprestimo
    ADD CONSTRAINT fk22bae4208b9463c2 FOREIGN KEY (siape_funcionario) REFERENCES public.tb_funcionario(id_usuario);


--
-- TOC entry 3136 (class 2606 OID 18924)
-- Name: tb_emprestimo fk22bae420fb9955d1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_emprestimo
    ADD CONSTRAINT fk22bae420fb9955d1 FOREIGN KEY (ra_aluno) REFERENCES public.tb_aluno(id_usuario);


--
-- TOC entry 3141 (class 2606 OID 18949)
-- Name: tb_item_emprestimo fk5c279aaa654425bb; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_item_emprestimo
    ADD CONSTRAINT fk5c279aaa654425bb FOREIGN KEY (id_item_emprestimo) REFERENCES public.tb_emprestimo(id_emprestimo);


--
-- TOC entry 3140 (class 2606 OID 18944)
-- Name: tb_item_emprestimo fk5c279aaa8682ff3a; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_item_emprestimo
    ADD CONSTRAINT fk5c279aaa8682ff3a FOREIGN KEY (id_item_emprestimo) REFERENCES public.tb_reserva(id_reserva);


--
-- TOC entry 3142 (class 2606 OID 18954)
-- Name: tb_item_emprestimo fk5c279aaa8f432597; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_item_emprestimo
    ADD CONSTRAINT fk5c279aaa8f432597 FOREIGN KEY (id_reserva) REFERENCES public.tb_reserva(id_reserva);


--
-- TOC entry 3139 (class 2606 OID 18939)
-- Name: tb_item_emprestimo fk5c279aaacf41b1d7; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_item_emprestimo
    ADD CONSTRAINT fk5c279aaacf41b1d7 FOREIGN KEY (id_emprestimo) REFERENCES public.tb_emprestimo(id_emprestimo);


--
-- TOC entry 3143 (class 2606 OID 18959)
-- Name: tb_obra fk8267e73b089e3b5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_obra
    ADD CONSTRAINT fk8267e73b089e3b5 FOREIGN KEY (id_categoria_obra) REFERENCES public.tb_categoria_obra(id_categoria_obra);


--
-- TOC entry 3134 (class 2606 OID 18914)
-- Name: tb_cidade fk8462da158737c5c5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_cidade
    ADD CONSTRAINT fk8462da158737c5c5 FOREIGN KEY (id_estado) REFERENCES public.tb_estado(id_estado);


--
-- TOC entry 3146 (class 2606 OID 18974)
-- Name: tb_tefefone fkd12e1e18df0b407; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_tefefone
    ADD CONSTRAINT fkd12e1e18df0b407 FOREIGN KEY (id_telefone) REFERENCES public.tb_usuario(id_usuario);


--
-- TOC entry 3145 (class 2606 OID 18969)
-- Name: tb_tefefone fkd12e1e1fca4f283; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_tefefone
    ADD CONSTRAINT fkd12e1e1fca4f283 FOREIGN KEY (id_usuario) REFERENCES public.tb_usuario(id_usuario);


--
-- TOC entry 3150 (class 2606 OID 18994)
-- Name: tb_usuario fkd228ce5d54a96a63; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_usuario
    ADD CONSTRAINT fkd228ce5d54a96a63 FOREIGN KEY (id_categoria_leito) REFERENCES public.tb_categoria_leitor(id_categoria_leitor);


--
-- TOC entry 3148 (class 2606 OID 18984)
-- Name: tb_usuario fkd228ce5d7f3c0141; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_usuario
    ADD CONSTRAINT fkd228ce5d7f3c0141 FOREIGN KEY (id_cidade) REFERENCES public.tb_cidade(id_cidade);


--
-- TOC entry 3147 (class 2606 OID 18979)
-- Name: tb_usuario fkd228ce5d8737c5c5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_usuario
    ADD CONSTRAINT fkd228ce5d8737c5c5 FOREIGN KEY (id_estado) REFERENCES public.tb_estado(id_estado);


--
-- TOC entry 3149 (class 2606 OID 18989)
-- Name: tb_usuario fkd228ce5dcf41b1d7; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_usuario
    ADD CONSTRAINT fkd228ce5dcf41b1d7 FOREIGN KEY (id_emprestimo) REFERENCES public.tb_emprestimo(id_emprestimo);


--
-- TOC entry 3138 (class 2606 OID 18934)
-- Name: tb_funcionario fkf984c98afca4f283; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_funcionario
    ADD CONSTRAINT fkf984c98afca4f283 FOREIGN KEY (id_usuario) REFERENCES public.tb_usuario(id_usuario);


--
-- TOC entry 3131 (class 2606 OID 18899)
-- Name: tb_aluno fkfbe89fdafca4f283; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_aluno
    ADD CONSTRAINT fkfbe89fdafca4f283 FOREIGN KEY (id_usuario) REFERENCES public.tb_usuario(id_usuario);


--
-- TOC entry 3133 (class 2606 OID 18909)
-- Name: tb_autor fkfbecb3923fc4d456; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_autor
    ADD CONSTRAINT fkfbecb3923fc4d456 FOREIGN KEY (id_autor) REFERENCES public.tb_obra(id_obra);


--
-- TOC entry 3132 (class 2606 OID 18904)
-- Name: tb_autor fkfbecb392b551a3bd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_autor
    ADD CONSTRAINT fkfbecb392b551a3bd FOREIGN KEY (id_obra) REFERENCES public.tb_obra(id_obra);


-- Completed on 2020-05-05 16:55:21 -03

--
-- PostgreSQL database dump complete
--

