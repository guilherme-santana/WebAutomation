Feature: Comprar Produto
		Fluxo de compras no site Petz
		
		Scenario: Compra a partir de uma busca
		Given que acesso o site Petz
		When busco por "coleira" e pressiono Enter
		Then exibe uma lista de produtos relacionados com "coleira"
		When escolho "Coleira Petz Azul para Cães"
		Then exibe para o "Tamanho P" o preco de "R$ 39,99"
		