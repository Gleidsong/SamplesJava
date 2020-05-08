insert into cozinha(id, nome) values(1, 'Brasileira');
insert into cozinha(id, nome) values(2, 'Arabe');
insert into cozinha(id, nome) values(3, 'Japonesa');
insert into cozinha(id, nome) values(4, 'Tailandesa');
insert into cozinha(id, nome) values(5, 'Espanhola');

insert into restaurante(nome, taxa_frete, cozinha_id) values('Thai Gourmet', 10, 1);
insert into restaurante(nome, taxa_frete, cozinha_id) values('Thai Delivery', 9.50, 1);
insert into restaurante(nome, taxa_frete, cozinha_id) values('Tuk Tuk Comida Arabe', 15, 2);

insert into forma_pagamento(id, descricao) values(1, 'Cartao de Credito');
insert into forma_pagamento(id, descricao) values(2, 'cartao de Debito');
insert into forma_pagamento(id, descricao) values(3, 'Pay Pal');
insert into forma_pagamento(id, descricao) values(4, 'Boleto');
insert into forma_pagamento(id, descricao) values(5, 'Dinheiro');

insert into permissao(id, nome, descricao) values(1, 'admin', 'Permissao Full');
insert into permissao(id, nome, descricao) values(2, 'user', 'Permissao somente a telas especificas');
insert into permissao(id, nome, descricao) values(3, 'system', 'Permissao para acesso do sistema');

insert into estado(id, nome) values(1, 'Sao Paulo');
insert into estado(id, nome) values(2, 'Rio Grande do Sul');
insert into estado(id, nome) values(3, 'Rio de Janeiro');
insert into estado(id, nome) values(4, 'Alagoas'); 

insert into cidade(id, nome, estado_id) values(1, 'Monte Verde', 1);
insert into cidade(id, nome, estado_id) values(2, 'Gramado', 2);
insert into cidade(id, nome, estado_id) values(3, 'Copacabana', 3);
insert into cidade(id, nome, estado_id) values(4, 'Maceio', 4);