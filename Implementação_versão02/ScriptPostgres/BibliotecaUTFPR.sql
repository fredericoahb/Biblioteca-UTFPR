PGDMP     0    	                x            BibliotecaUTFPR    12.2    12.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    18833    BibliotecaUTFPR    DATABASE     o   CREATE DATABASE "BibliotecaUTFPR" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'C' LC_CTYPE = 'C';
 !   DROP DATABASE "BibliotecaUTFPR";
                postgres    false            �          0    19001    tb_aluno 
   TABLE DATA           8   COPY public.tb_aluno (ra_aluno, id_usuario) FROM stdin;
    public          postgres    false    202   �       �          0    19016    tb_categoria_obra 
   TABLE DATA           �   COPY public.tb_categoria_obra (id_categoria_obra, descricao_categoria_obra, multa_dia_categoria_obra, nro_dias_categoria_obra) FROM stdin;
    public          postgres    false    205   �       �          0    19046    tb_obra 
   TABLE DATA           �   COPY public.tb_obra (id_obra, disponivel_obra, dt_publicacao_obra, edicao_obra, editora_obra, isbn_obra, nro_paginas_obra, palavras_chave_obra, titulo_obra, id_categoria_obra) FROM stdin;
    public          postgres    false    211   �       �          0    19006    tb_autor 
   TABLE DATA           A   COPY public.tb_autor (id_autor, nome_autor, id_obra) FROM stdin;
    public          postgres    false    203          �          0    19011    tb_categoria_leitor 
   TABLE DATA           �   COPY public.tb_categoria_leitor (id_categoria_leitor, descricao_categoria_leitor, dias_categoria_leitor, qtde_emprestimo_categoria_leitor) FROM stdin;
    public          postgres    false    204   8       �          0    19031 	   tb_estado 
   TABLE DATA           N   COPY public.tb_estado (id_estado, descricao_estado, sigla_estado) FROM stdin;
    public          postgres    false    208   U       �          0    19021 	   tb_cidade 
   TABLE DATA           K   COPY public.tb_cidade (id_cidade, descricao_cidade, id_estado) FROM stdin;
    public          postgres    false    206   r       �          0    19051 
   tb_reserva 
   TABLE DATA           \   COPY public.tb_reserva (id_reserva, dt_prevista_retirada, dt_reserva, ra_aluno) FROM stdin;
    public          postgres    false    212   �       �          0    19026    tb_emprestimo 
   TABLE DATA           t   COPY public.tb_emprestimo (id_emprestimo, situacao_emprestimo, ra_aluno, siape_funcionario, reserva_id) FROM stdin;
    public          postgres    false    207   �       �          0    19061 
   tb_usuario 
   TABLE DATA           �   COPY public.tb_usuario (id_usuario, bairro_usuario, cep_usuario, cpf_usuario, dt_nascimento_usuario, email_usuario, logradouro_usuario, nome_usuario, senha_usuario, situacao_usuario, id_categoria_leito, id_cidade, id_emprestimo, id_estado) FROM stdin;
    public          postgres    false    214   �       �          0    19036    tb_funcionario 
   TABLE DATA           G   COPY public.tb_funcionario (siape_funcionario, id_usuario) FROM stdin;
    public          postgres    false    209   �       �          0    19041    tb_item_emprestimo 
   TABLE DATA           �   COPY public.tb_item_emprestimo (id_item_emprestimo, dt_devolucao_item_emprestimo, dt_emprestimo_item_emprestimo, dt_prev_devolucao_item_emprestimo, situacao_item_emprestimo, valor_multa_item_emprestimo, id_emprestimo, id_obra, id_reserva) FROM stdin;
    public          postgres    false    210          �          0    19056    tb_tefefone 
   TABLE DATA           Z   COPY public.tb_tefefone (id_telefone, ddd_telefone, nro_telefone, id_usuario) FROM stdin;
    public          postgres    false    213           �           0    0    hibernate_sequence    SEQUENCE SET     A   SELECT pg_catalog.setval('public.hibernate_sequence', 1, false);
          public          postgres    false    215            �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �     