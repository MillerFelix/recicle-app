<h1>Recicle</h1>

>> ## Status: Finalizado ✅

O projeto em desenvolvimento para disciplina de Modelagem de Software e Programação de Soluções Computacionais do primeiro semestre do curso de TI. 
O Recicle é um sistema feito para os interessados em reciclagem e o descarte adequado dos Resíduos. O programa permite que o usuário possa realizar um login e cadastro, também é possível o agendamento para postos de descarte, ter acesso a cada resíduos para saber mais sobre o mesmo, podendo fazer anotações.

## Tecnologias utilizadas foram 💻 
  
- Java
- Mysql

### ⚠️ Utilizar branch principal: master ⚠️ 

<h2>Scripts</h2>

#### Execute os script a seguir no SGB do Mysql ⚠️

CREATE DATABASE recicle_bd;

USE recicle_bd;

-- Tabela de usuários
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(20) NOT NULL 
);

-- Tabela de categoria_residuos
CREATE TABLE categoria_residuos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    informacao01 VARCHAR(450) NOT NULL,
    informacao02 VARCHAR(450) NOT NULL
);

-- Tabela de resíduos
CREATE TABLE residuos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    categoria_residuos_id INT NOT NULL,
    FOREIGN KEY (categoria_residuos_id) REFERENCES categoria_residuos(id)
);

-- Tabela de dicas
CREATE TABLE dicas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descricao VARCHAR(600) NOT NULL,
    categoria_residuos_id INT NOT NULL,
    FOREIGN KEY (categoria_residuos_id) REFERENCES categoria_residuos(id)
);

-- Tabela de anotações
CREATE TABLE anotacoes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(600) NOT NULL,
    categoria_residuos_id INT NOT NULL,
    usuario_id INT NOT NULL,
    FOREIGN KEY (categoria_residuos_id) REFERENCES categoria_residuos(id),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

INSERT INTO categoria_residuos (nome, informacao01, informacao02)
VALUES ('Papel e Cartão', 'Importância da reciclagem: A reciclagem de papel e cartão ajuda a reduzir o corte de árvores, conserva recursos naturais, economiza energia e reduz a quantidade de resíduos enviados para aterros sanitários.',
'Processo de reciclagem: O papel e o cartão reciclados são processados em uma polpa de papel que pode ser utilizada para produzir novos produtos de papel, como papel higiênico, papel de escritório e papelão.'),
	('Vidro', '
Durabilidade: O vidro é um material durável que pode ser reciclado infinitas vezes sem perder qualidade.',
'Vantagens da reciclagem: Além de conservar recursos naturais, a reciclagem de vidro reduz a poluição do ar (em comparação com a produção de vidro a partir de matérias-primas virgens) e economiza energia.'),
	('Plástico', 'Desafios da reciclagem: O plástico apresenta desafios significativos para reciclagem devido à sua diversidade de tipos e à contaminação por outros materiais.',
'Alternativas sustentáveis: Reduzir o consumo de plástico descartável e optar por alternativas mais sustentáveis, como produtos reutilizáveis e embalagens biodegradáveis, pode ajudar a mitigar o problema do plástico.
'),
	('Metal', 'Valor econômico: O metal é um material valioso para reciclagem devido ao seu valor econômico e à sua capacidade de ser reciclado repetidamente sem perder qualidade.',
'Eficiência energética: A reciclagem de metal consome menos energia do que a produção de metal a partir de minérios, resultando em uma redução significativa nas emissões de gases de efeito estufa.
'),
	('Orgânico', 'Compostagem: A compostagem de resíduos orgânicos é uma forma eficaz de transformar resíduos em recursos, produzindo adubo orgânico para uso em jardins e hortas.',
'Redução de resíduos: A compostagem de resíduos orgânicos reduz a quantidade de resíduos enviados para aterros sanitários, contribuindo para a sustentabilidade ambiental.'),
	('Resíduos Eletrônicos (e-lixo)', 'Crescimento do e-lixo: O aumento da produção de dispositivos eletrônicos contribui para o aumento do e-lixo em todo o mundo, tornando o descarte adequado e a reciclagem de resíduos eletrônicos uma preocupação ambiental importante.',
'Recuperação de materiais: A reciclagem de e-lixo permite a recuperação de materiais valiosos, como metais preciosos e metais raros, que podem ser reutilizados na fabricação de novos produtos eletrônicos.
'),
	('Pilhas e Baterias', 'Poluição ambiental: Pilhas e baterias descartadas inadequadamente podem causar poluição do solo e da água devido aos metais pesados e substâncias tóxicas que contêm.',
'Programas de reciclagem: Muitos países têm programas de reciclagem de pilhas e baterias para garantir que sejam descartadas e recicladas de forma segura.
'),
	('Tetra Pak (embalagens cartonadas)', 'Composição: As embalagens Tetra Pak são compostas por papel, plástico e alumínio, o que as torna complexas de reciclar.',
'Processo de reciclagem: As embalagens Tetra Pak são trituradas e processadas para separar e reciclar as diferentes camadas de materiais.'),
	('Resíduos Perigosos', '
Riscos à saúde: Resíduos perigosos podem representar riscos à saúde humana e ao meio ambiente devido à presença de substâncias tóxicas, inflamáveis, corrosivas e reativas.',
'Regulamentações: Muitos países têm regulamentações específicas para o manuseio, transporte e descarte de resíduos perigosos para minimizar seus impactos negativos.
'),
	('Madeira', 'Reutilização: A madeira pode ser reutilizada para fabricar móveis, artesanatos e materiais de construção, prolongando sua vida útil e reduzindo a necessidade de extração de novas árvores.',
'Reciclagem: A madeira também pode ser reciclada para produzir energia por meio da queima em usinas de biomassa ou ser transformada em outros produtos de madeira.
');

INSERT INTO residuos (nome, categoria_residuos_id)
VALUES ('Jornais', 1),
       ('Revistas', 1),
       ('Folha de papel', 1),
       ('Envelopes', 1),
       ('Cadernos', 1),
       ('Papéis de embrulho', 1),
       ('Vidro', 2),
       ('Garrafas de vidro', 2),
       ('Potes de vidro', 2),
       ('Vidros de perfumes', 2),
       ('Frascos de remédios', 2),
       ('Copos de vidro', 2),
       ('Garrafas PET', 3),
       ('Sacolas plásticas', 3),
       ('Embalagens plásticas de alimentos', 3),
       ('Potes e tampas plásticas', 3),
       ('Filmes plásticos', 3),
       ('Brinquedos de plástico', 3),
       ('Latas de alumínio', 4),
       ('Latas de aço', 4),
       ('Tampinhas metálicas', 4),
       ('Utensílios domésticos metálicos', 4),
       ('Ferragens e peças de metal', 4),
       ('Latas de alumínio', 4),
       ('Restos de frutas', 5),
       ('Restos de vegetais', 5),
       ('Folhas e grama', 5),
       ('Cascas de ovos', 5),
       ('Folhas e grama cortada', 5),
       ('Pó de café usado', 5),
       ('Celulares e smartphones', 6),
       ('Computadores e laptops', 6),
       ('Monitores e televisores', 6),
       ('Carregadores e cabos eletrônicos', 6),
       ('UTablets e e-readers', 6),
       ('Teclados e mouses', 6),
       ('Pilhas alcalinas' , 7),
       ('Pilhas recarregáveis' , 7),
       ('Baterias de chumbo-ácido' , 7),
       ('Baterias de lítio' , 7),
       ('Baterias de celulares' , 7),
       ('Baterias de notebook' , 7),
       ('Caixas de leite' , 8),
       ('Caixas de suco' , 8),
       ('Caixas de vinho' , 8),
       ('Embalagens de molhos' , 8),
       ('Embalagens de cremes' , 8),
       ('Embalagens de alimentos líquidos' , 8),
       ('Lâmpadas fluorescentes' , 9),
       ('Termômetros com mercúrio' , 9),
       ('Agrotóxicos e pesticidas' , 9),
       ('Tintas e solventes' , 9),
       ('Produtos de limpeza tóxicos' , 9),
       ('Óleo de motor e lubrificantes' , 9),
       ('Paletes de madeira' , 10),
       ('Caixotes de madeira' , 10),
       ('Móveis de madeira'  , 10),
       ('Madeiras de construção', 10),
       ('Portas de madeira', 10),
       ('Estrados de camas',10);

INSERT INTO dicas (titulo, descricao, categoria_residuos_id)
VALUES ('Separação de Resíduos', 'Separe o papel e o cartão dos outros resíduos recicláveis em casa.
Coloque o papel e o cartão limpos e secos em um recipiente de reciclagem ou em um saco de reciclagem fornecido pelo serviço de coleta de resíduos.
Evite misturar papel e cartão com outros materiais que possam contaminá-los, como alimentos ou produtos químicos.', 1),
       ('Como separar?', 'Lave as embalagens de vidro para remover resíduos de alimentos.
Separe o vidro colorido do vidro transparente, se possível.
Coloque as embalagens de vidro limpas e secas em um recipiente de reciclagem ou em um local designado para coleta de vidro.
', 2),
       ('Modos de separar', 'Verifique os símbolos de reciclagem nas embalagens de plástico para identificar o tipo de plástico.
Lave as embalagens de plástico para remover resíduos de alimentos.
Separe os diferentes tipos de plástico, se possível, e coloque-os em um recipiente de reciclagem ou em um saco de reciclagem.', 3),
       ('Como devo reciclar?', 'Compacte latas de alumínio e aço para economizar espaço.
Separe os diferentes tipos de metal, como alumínio e aço, se possível.
Coloque as latas e outros itens de metal limpos e secos em um recipiente de reciclagem ou em um local designado para coleta de metal.', 4),
       ('Você pode adubar!', 'Inicie uma pilha de compostagem em sua casa para reciclar resíduos orgânicos em adubo.
Separe os resíduos orgânicos dos outros resíduos e coloque-os em um recipiente de compostagem ou em uma pilha de compostagem em seu jardim.', 5),
       ('Como descartar?', '
Procure pontos de coleta de e-lixo em sua comunidade, como lojas de eletrônicos, supermercados ou centros de reciclagem.
Não descarte dispositivos eletrônicos no lixo comum ou os deixe ao ar livre, pois podem liberar substâncias tóxicas no meio ambiente.
', 6),
       ('Descarte consciente', 'Procure pontos de coleta de pilhas e baterias em sua comunidade, como lojas de eletrônicos, supermercados ou postos de reciclagem específicos.
Não descarte pilhas e baterias no lixo comum, pois podem vazar substâncias tóxicas no solo e na água.', 7),
       ('Orientações de Descarte Tetra Park', 'Verifique se há pontos de coleta de embalagens Tetra Pak em sua área, como supermercados ou centros de reciclagem.
Se não houver pontos de coleta específicos, entre em contato com o serviço de coleta de resíduos da sua cidade para obter orientações sobre como descartar embalagens Tetra Pak corretamente.', 8),
       ('Descarte seguro', 'Siga as instruções fornecidas pelos fabricantes de produtos químicos e outros materiais perigosos para descartá-los adequadamente.
Procure programas de reciclagem ou eventos de descarte de resíduos perigosos em sua comunidade para descartá-los de forma segura.
', 9),
       ('Reutilização?', 'Reutilize peças de madeira em projetos de bricolagem ou construção.
Procure pontos de coleta de resíduos de madeira em sua área, como empresas de reciclagem de madeira ou centros de reciclagem de materiais de construção.', 10);



## Pessoas Desenvolvedoras do Projeto 💼

- André de França Rodrigues

- Bruna de Oliveira Silva

- Bruno Venâncio da Silva

- Giovanna Perinetto Aguiar

- Ingrid Lopes Sudario

- Miller Redigolo Felix

- Rodrigo Mendola Bassini
