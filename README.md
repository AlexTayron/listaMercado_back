#Sistema  Lista de Mercado
##  Requisitos
- Ser capaz de gerenciar várias listas de mercado (e marcar seu status como concluída ou não)
- Ser capaz de cadastrar produtos e consultar-los
- Ser capaz de incluir nas listas e especificar os seus produtos, bem como a marca se já foi compradora ou não
- Ser capaz de atribuir valores aos itens comprados para depois ter uma gestão dos custos da lista
- Ser capaz de adicionar, quantidades (kg, unidades, litros etc)

##  Casos de Uso - Produto
###  Cadastrar Produtos
Informar ou nome de um determinado produto e sistema ou armazenamento no banco

Entrada
  - nome do produto

Saída
  - id do produto
  - nome do produto

###  Consulte produtos
informar palavras chaves para consultar ou mesmo buscar produtos a partir de uma lista

Entrada
  - palavra-chave

Saída
  - com lista de produtos que estão chave

###  Consulte produtos pelo ID
informar o ID do produto e receber sua descrição

Entrada
  - id do produto

Saída
  - id do produto
  - nome do produto

Saída alternativa
  - vazio (produto não encontrado)

##  Casos de Uso - Lista
###  Criação de listas
Criar uma nova lista inserindo os dados e o local onde foi feita a compra (nome do supermercado/feira, etc)

Entrada:
  - nome do local

Saída: Saída
  - numero da lista
  - dados da criação
  - nome do local
  - valor total = 0

###  Apagar uma lista
Remover uma lista que foi criada por engano e remover todos os seus itens que foram criados

Entrada:
  - ID da lista

Saída
  - nenhuma

###  Inserção de itens na lista
Criar um item associando uma lista e um produto como deixar disponível uma possibilidade de modificação, quantidade e preço que foi pago

Entrada:
  - código do produto
  - quantidade (opcional)
  - número da lista

Saída
  - numero sequencial do item
  - quantidade (opcional)
  - preço zerado
  - número da lista correspondente

###  alteração de itens da lista
Change apenas quantidade, preço pago e status

Entrada
  - numero sequencial do item
  - novo preço
  - nova quantidade
  - código do produto
  - numero da lista

Saída
  - numero sequencial do item
  - novo preço
  - nova quantidade
  - código do produto
  - numero da lista

###  remoção de itens da lista
poder removedor um item que foi cadastrado na lista

Entrada
  - numero sequencial do item

Saída
  - nenhum
###  fechamento da lista
gerar sua lista como sendo completa e custo total a partir dos itens comprados

Entrada
  - numero da lista
Saída
  - Objeto contendo todos os seus atributos e com o valor total correspondente à somatória dos itens


