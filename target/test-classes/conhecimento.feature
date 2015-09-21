Feature: Agrupamento de Notas Fiscais na composição de CT-e

	Scenario: Compondo um CT-e com duas Notas Fiscais com parâmetros iguais
		Given uma nova composição de CT-e
		When um usuário entra com duas notas fiscais com os mesmos parâmetros: 
		|numero	|cliente	|destinatario	|dataEntrega	|
		|1		|GDC		|EXTRA			|22/08/2015		|
		|2		|GDC		|EXTRA			|22/08/2015		|
		Then somente 1 pré-conhecimento deve ser composto
 	
 	Scenario: Compondo um CT-e com duas Notas Fiscais com parâmetros diferentes
		Given uma nova composição de CT-e
		When um usuário entra com duas notas fiscais com os mesmos parâmetros: 
		|numero	|cliente	|destinatario	|dataEntrega	|
		|1		|GDC		|EXTRA			|22/08/2015		|
		|2		|GDC		|EXTRA			|23/08/2015		|
		Then somente 2 pré-conhecimento deve ser composto
