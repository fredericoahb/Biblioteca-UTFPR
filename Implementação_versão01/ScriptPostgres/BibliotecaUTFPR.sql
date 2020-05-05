--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12.2

-- Started on 2020-04-30 19:51:02 -03

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
-- TOC entry 218 (class 1259 OID 18654)
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
-- TOC entry 202 (class 1259 OID 18480)
-- Name: tb_aluno; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_aluno (
    ra_aluno integer,
    id_usuario integer NOT NULL
);


ALTER TABLE public.tb_aluno OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 18485)
-- Name: tb_autor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_autor (
    id_autor integer NOT NULL,
    nome_autor character varying(100)
);


ALTER TABLE public.tb_autor OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 18490)
-- Name: tb_autor_obra; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_autor_obra (
    id_autor integer NOT NULL,
    id_obra integer NOT NULL
);


ALTER TABLE public.tb_autor_obra OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 18493)
-- Name: tb_categoria_leitor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_categoria_leitor (
    id_categoria_leitor integer NOT NULL,
    descricao_categoria_leitor character varying(50),
    dias_obra_categoria_leitor integer
);


ALTER TABLE public.tb_categoria_leitor OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 18498)
-- Name: tb_categoria_obra; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_categoria_obra (
    id_categoria_obra integer NOT NULL,
    descricao_categoria_obra character varying(50),
    multa_dia_categoria_obra real,
    nro_categoria_obra integer
);


ALTER TABLE public.tb_categoria_obra OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 18503)
-- Name: tb_cidade; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_cidade (
    id_cidade integer NOT NULL,
    descricao_cidade character varying(200),
    id_estado integer
);


ALTER TABLE public.tb_cidade OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 18508)
-- Name: tb_devolucao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_devolucao (
    id_devolucao integer NOT NULL,
    data_devolucao timestamp without time zone
);


ALTER TABLE public.tb_devolucao OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 18513)
-- Name: tb_emprestimo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_emprestimo (
    id_emprestimo integer NOT NULL,
    dt_emprestimo timestamp without time zone,
    dt_previsao_dev_emprestimo timestamp without time zone,
    ra_aluno integer,
    matricula_siape_servidor integer
);


ALTER TABLE public.tb_emprestimo OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 18518)
-- Name: tb_emprestimo_obra; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_emprestimo_obra (
    id_emprestimo integer NOT NULL,
    id_obra integer NOT NULL
);


ALTER TABLE public.tb_emprestimo_obra OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 18521)
-- Name: tb_estado; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_estado (
    id_estado integer NOT NULL,
    descricao_estado character varying(50),
    sigla_estado character varying(5)
);


ALTER TABLE public.tb_estado OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 18526)
-- Name: tb_obra; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_obra (
    id_obra integer NOT NULL,
    isbn_obra character varying(20),
    dt_publicacao_obra timestamp without time zone,
    edicao_obra character varying(50),
    editora_obra character varying(50),
    nro_paginas_obra integer,
    palavras_chave_obra character varying(200),
    titulo_obra character varying(50),
    id_categoria_obra integer
);


ALTER TABLE public.tb_obra OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 18531)
-- Name: tb_obra_autor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_obra_autor (
    id_obra integer NOT NULL,
    id_autor integer NOT NULL
);


ALTER TABLE public.tb_obra_autor OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 18534)
-- Name: tb_reserva; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_reserva (
    id_reserva integer NOT NULL,
    dt_prevista_devolucao timestamp without time zone,
    dt_prevista_retirada timestamp without time zone,
    dt_reserva timestamp without time zone,
    ra_aluno integer,
    matricula_siape_servidor integer
);


ALTER TABLE public.tb_reserva OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 18539)
-- Name: tb_servidor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_servidor (
    matricula_siape_servidor integer,
    id_usuario integer NOT NULL
);


ALTER TABLE public.tb_servidor OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 18544)
-- Name: tb_tefefone; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_tefefone (
    id_telefone integer NOT NULL,
    numero_telefone character varying(255),
    id_usuario integer
);


ALTER TABLE public.tb_tefefone OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 18549)
-- Name: tb_usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_usuario (
    id_usuario integer NOT NULL,
    dt_nascimento_usuario timestamp without time zone,
    endereco_usuario character varying(200),
    nome_usuario character varying(100),
    situacao_usuario boolean,
    id_categoria_leito integer,
    id_cidade integer,
    id_estado integer
);


ALTER TABLE public.tb_usuario OWNER TO postgres;

--
-- TOC entry 3289 (class 0 OID 18480)
-- Dependencies: 202
-- Data for Name: tb_aluno; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_aluno (ra_aluno, id_usuario) FROM stdin;
\.


--
-- TOC entry 3290 (class 0 OID 18485)
-- Dependencies: 203
-- Data for Name: tb_autor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_autor (id_autor, nome_autor) FROM stdin;
\.


--
-- TOC entry 3291 (class 0 OID 18490)
-- Dependencies: 204
-- Data for Name: tb_autor_obra; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_autor_obra (id_autor, id_obra) FROM stdin;
\.


--
-- TOC entry 3292 (class 0 OID 18493)
-- Dependencies: 205
-- Data for Name: tb_categoria_leitor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_categoria_leitor (id_categoria_leitor, descricao_categoria_leitor, dias_obra_categoria_leitor) FROM stdin;
\.


--
-- TOC entry 3293 (class 0 OID 18498)
-- Dependencies: 206
-- Data for Name: tb_categoria_obra; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_categoria_obra (id_categoria_obra, descricao_categoria_obra, multa_dia_categoria_obra, nro_categoria_obra) FROM stdin;
\.


--
-- TOC entry 3294 (class 0 OID 18503)
-- Dependencies: 207
-- Data for Name: tb_cidade; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_cidade (id_cidade, descricao_cidade, id_estado) FROM stdin;
\.


--
-- TOC entry 3295 (class 0 OID 18508)
-- Dependencies: 208
-- Data for Name: tb_devolucao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_devolucao (id_devolucao, data_devolucao) FROM stdin;
\.


--
-- TOC entry 3296 (class 0 OID 18513)
-- Dependencies: 209
-- Data for Name: tb_emprestimo; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_emprestimo (id_emprestimo, dt_emprestimo, dt_previsao_dev_emprestimo, ra_aluno, matricula_siape_servidor) FROM stdin;
\.


--
-- TOC entry 3297 (class 0 OID 18518)
-- Dependencies: 210
-- Data for Name: tb_emprestimo_obra; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_emprestimo_obra (id_emprestimo, id_obra) FROM stdin;
\.


--
-- TOC entry 3298 (class 0 OID 18521)
-- Dependencies: 211
-- Data for Name: tb_estado; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_estado (id_estado, descricao_estado, sigla_estado) FROM stdin;
\.


--
-- TOC entry 3299 (class 0 OID 18526)
-- Dependencies: 212
-- Data for Name: tb_obra; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_obra (id_obra, isbn_obra, dt_publicacao_obra, edicao_obra, editora_obra, nro_paginas_obra, palavras_chave_obra, titulo_obra, id_categoria_obra) FROM stdin;
\.


--
-- TOC entry 3300 (class 0 OID 18531)
-- Dependencies: 213
-- Data for Name: tb_obra_autor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_obra_autor (id_obra, id_autor) FROM stdin;
\.


--
-- TOC entry 3301 (class 0 OID 18534)
-- Dependencies: 214
-- Data for Name: tb_reserva; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_reserva (id_reserva, dt_prevista_devolucao, dt_prevista_retirada, dt_reserva, ra_aluno, matricula_siape_servidor) FROM stdin;
\.


--
-- TOC entry 3302 (class 0 OID 18539)
-- Dependencies: 215
-- Data for Name: tb_servidor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_servidor (matricula_siape_servidor, id_usuario) FROM stdin;
\.


--
-- TOC entry 3303 (class 0 OID 18544)
-- Dependencies: 216
-- Data for Name: tb_tefefone; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_tefefone (id_telefone, numero_telefone, id_usuario) FROM stdin;
\.


--
-- TOC entry 3304 (class 0 OID 18549)
-- Dependencies: 217
-- Data for Name: tb_usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_usuario (id_usuario, dt_nascimento_usuario, endereco_usuario, nome_usuario, situacao_usuario, id_categoria_leito, id_cidade, id_estado) FROM stdin;
\.


--
-- TOC entry 3311 (class 0 OID 0)
-- Dependencies: 218
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.hibernate_sequence', 1, false);


--
-- TOC entry 3118 (class 2606 OID 18484)
-- Name: tb_aluno tb_aluno_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_aluno
    ADD CONSTRAINT tb_aluno_pkey PRIMARY KEY (id_usuario);


--
-- TOC entry 3120 (class 2606 OID 18489)
-- Name: tb_autor tb_autor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_autor
    ADD CONSTRAINT tb_autor_pkey PRIMARY KEY (id_autor);


--
-- TOC entry 3122 (class 2606 OID 18497)
-- Name: tb_categoria_leitor tb_categoria_leitor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_categoria_leitor
    ADD CONSTRAINT tb_categoria_leitor_pkey PRIMARY KEY (id_categoria_leitor);


--
-- TOC entry 3124 (class 2606 OID 18502)
-- Name: tb_categoria_obra tb_categoria_obra_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_categoria_obra
    ADD CONSTRAINT tb_categoria_obra_pkey PRIMARY KEY (id_categoria_obra);


--
-- TOC entry 3126 (class 2606 OID 18507)
-- Name: tb_cidade tb_cidade_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_cidade
    ADD CONSTRAINT tb_cidade_pkey PRIMARY KEY (id_cidade);


--
-- TOC entry 3128 (class 2606 OID 18512)
-- Name: tb_devolucao tb_devolucao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_devolucao
    ADD CONSTRAINT tb_devolucao_pkey PRIMARY KEY (id_devolucao);


--
-- TOC entry 3130 (class 2606 OID 18517)
-- Name: tb_emprestimo tb_emprestimo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_emprestimo
    ADD CONSTRAINT tb_emprestimo_pkey PRIMARY KEY (id_emprestimo);


--
-- TOC entry 3132 (class 2606 OID 18525)
-- Name: tb_estado tb_estado_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_estado
    ADD CONSTRAINT tb_estado_pkey PRIMARY KEY (id_estado);


--
-- TOC entry 3134 (class 2606 OID 18530)
-- Name: tb_obra tb_obra_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_obra
    ADD CONSTRAINT tb_obra_pkey PRIMARY KEY (id_obra);


--
-- TOC entry 3136 (class 2606 OID 18538)
-- Name: tb_reserva tb_reserva_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_reserva
    ADD CONSTRAINT tb_reserva_pkey PRIMARY KEY (id_reserva);


--
-- TOC entry 3138 (class 2606 OID 18543)
-- Name: tb_servidor tb_servidor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_servidor
    ADD CONSTRAINT tb_servidor_pkey PRIMARY KEY (id_usuario);


--
-- TOC entry 3140 (class 2606 OID 18548)
-- Name: tb_tefefone tb_tefefone_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_tefefone
    ADD CONSTRAINT tb_tefefone_pkey PRIMARY KEY (id_telefone);


--
-- TOC entry 3142 (class 2606 OID 18553)
-- Name: tb_usuario tb_usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_usuario
    ADD CONSTRAINT tb_usuario_pkey PRIMARY KEY (id_usuario);


--
-- TOC entry 3156 (class 2606 OID 18619)
-- Name: tb_reserva fk1b77e7e79600e2fd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_reserva
    ADD CONSTRAINT fk1b77e7e79600e2fd FOREIGN KEY (matricula_siape_servidor) REFERENCES public.tb_servidor(id_usuario);


--
-- TOC entry 3155 (class 2606 OID 18614)
-- Name: tb_reserva fk1b77e7e7fb9955d1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_reserva
    ADD CONSTRAINT fk1b77e7e7fb9955d1 FOREIGN KEY (ra_aluno) REFERENCES public.tb_aluno(id_usuario);


--
-- TOC entry 3149 (class 2606 OID 18584)
-- Name: tb_emprestimo fk22bae4209600e2fd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_emprestimo
    ADD CONSTRAINT fk22bae4209600e2fd FOREIGN KEY (matricula_siape_servidor) REFERENCES public.tb_servidor(id_usuario);


--
-- TOC entry 3148 (class 2606 OID 18579)
-- Name: tb_emprestimo fk22bae420a73171cc; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_emprestimo
    ADD CONSTRAINT fk22bae420a73171cc FOREIGN KEY (id_emprestimo) REFERENCES public.tb_usuario(id_usuario);


--
-- TOC entry 3147 (class 2606 OID 18574)
-- Name: tb_emprestimo fk22bae420fb9955d1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_emprestimo
    ADD CONSTRAINT fk22bae420fb9955d1 FOREIGN KEY (ra_aluno) REFERENCES public.tb_aluno(id_usuario);


--
-- TOC entry 3152 (class 2606 OID 18599)
-- Name: tb_obra fk8267e73b089e3b5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_obra
    ADD CONSTRAINT fk8267e73b089e3b5 FOREIGN KEY (id_categoria_obra) REFERENCES public.tb_categoria_obra(id_categoria_obra);


--
-- TOC entry 3146 (class 2606 OID 18569)
-- Name: tb_cidade fk8462da158737c5c5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_cidade
    ADD CONSTRAINT fk8462da158737c5c5 FOREIGN KEY (id_estado) REFERENCES public.tb_estado(id_estado);


--
-- TOC entry 3153 (class 2606 OID 18604)
-- Name: tb_obra_autor fk8e23e7b7b551a3bd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_obra_autor
    ADD CONSTRAINT fk8e23e7b7b551a3bd FOREIGN KEY (id_obra) REFERENCES public.tb_obra(id_obra);


--
-- TOC entry 3154 (class 2606 OID 18609)
-- Name: tb_obra_autor fk8e23e7b7f3699b2d; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_obra_autor
    ADD CONSTRAINT fk8e23e7b7f3699b2d FOREIGN KEY (id_autor) REFERENCES public.tb_autor(id_autor);


--
-- TOC entry 3144 (class 2606 OID 18559)
-- Name: tb_autor_obra fk98ed7efb551a3bd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_autor_obra
    ADD CONSTRAINT fk98ed7efb551a3bd FOREIGN KEY (id_obra) REFERENCES public.tb_obra(id_obra);


--
-- TOC entry 3145 (class 2606 OID 18564)
-- Name: tb_autor_obra fk98ed7eff3699b2d; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_autor_obra
    ADD CONSTRAINT fk98ed7eff3699b2d FOREIGN KEY (id_autor) REFERENCES public.tb_autor(id_autor);


--
-- TOC entry 3157 (class 2606 OID 18624)
-- Name: tb_servidor fkba9ca005fca4f283; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_servidor
    ADD CONSTRAINT fkba9ca005fca4f283 FOREIGN KEY (id_usuario) REFERENCES public.tb_usuario(id_usuario);


--
-- TOC entry 3150 (class 2606 OID 18589)
-- Name: tb_emprestimo_obra fkce6ed021b551a3bd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_emprestimo_obra
    ADD CONSTRAINT fkce6ed021b551a3bd FOREIGN KEY (id_obra) REFERENCES public.tb_obra(id_obra);


--
-- TOC entry 3151 (class 2606 OID 18594)
-- Name: tb_emprestimo_obra fkce6ed021cf41b1d7; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_emprestimo_obra
    ADD CONSTRAINT fkce6ed021cf41b1d7 FOREIGN KEY (id_emprestimo) REFERENCES public.tb_emprestimo(id_emprestimo);


--
-- TOC entry 3159 (class 2606 OID 18634)
-- Name: tb_tefefone fkd12e1e18df0b407; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_tefefone
    ADD CONSTRAINT fkd12e1e18df0b407 FOREIGN KEY (id_telefone) REFERENCES public.tb_usuario(id_usuario);


--
-- TOC entry 3158 (class 2606 OID 18629)
-- Name: tb_tefefone fkd12e1e1fca4f283; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_tefefone
    ADD CONSTRAINT fkd12e1e1fca4f283 FOREIGN KEY (id_usuario) REFERENCES public.tb_usuario(id_usuario);


--
-- TOC entry 3162 (class 2606 OID 18649)
-- Name: tb_usuario fkd228ce5d54a96a63; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_usuario
    ADD CONSTRAINT fkd228ce5d54a96a63 FOREIGN KEY (id_categoria_leito) REFERENCES public.tb_categoria_leitor(id_categoria_leitor);


--
-- TOC entry 3161 (class 2606 OID 18644)
-- Name: tb_usuario fkd228ce5d7f3c0141; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_usuario
    ADD CONSTRAINT fkd228ce5d7f3c0141 FOREIGN KEY (id_cidade) REFERENCES public.tb_cidade(id_cidade);


--
-- TOC entry 3160 (class 2606 OID 18639)
-- Name: tb_usuario fkd228ce5d8737c5c5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_usuario
    ADD CONSTRAINT fkd228ce5d8737c5c5 FOREIGN KEY (id_estado) REFERENCES public.tb_estado(id_estado);


--
-- TOC entry 3143 (class 2606 OID 18554)
-- Name: tb_aluno fkfbe89fdafca4f283; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_aluno
    ADD CONSTRAINT fkfbe89fdafca4f283 FOREIGN KEY (id_usuario) REFERENCES public.tb_usuario(id_usuario);


-- Completed on 2020-04-30 19:51:02 -03

--
-- PostgreSQL database dump complete
--

