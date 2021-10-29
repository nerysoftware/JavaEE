-Tutorial de como execultar o projeto.

-Pré-requisitos

	JDK8+
	Tomcat 8.5+ 
	Postgres 
	
-------------------------------------------------
1 - Importe o arquivo WAR para sua IDE (Eclipse) 

2 - Configure o projeto no server Tomcat

3 - Na pasta src/main/resources/META-INF/ abra o arquivo persistence.xml e altere o password do banco de dados ->>
* EX:  property name="javax.persistence.jdbc.password" value="SUA SENHA"

4 - No seu banco de dados Postgres crie uma base de dados com o nome "db_magna"

5 - Execulte o server Tomcat e acesse o barramento --->>

* http://localhost:8080/jsf-primefaces/primefaces/Medicamento.xhtml




------------------------------------------------
EXPLICANDO A ALICAÇÃO

- O sitema é um cadastro de medicamentos.
- Nele o usuario deve informar:
* Nome do Medicamento, no campo {Medicamento}.
* Apresentação "Que é a forma como usar o Medicamento", no campo {Apresentação}.
* O laboratório onde é fabricado o medicamento, no campo {Laboratório}.
* Marca do medicamento, elas tem que ser cadastradas separadamente clicando em {Cadastrar Marca}.
* Fornecedor do medicamento, eles tem que ser cadastrados separadamento clicando em {Cadastrar Fornecedor}.
* Registro no ministerio da saude, informar a numeração do registro, no campo {Registro MS}.
* Perço do medicamento, no campo {Preço}.
- Depois de tudo preenchido é só clicar em {Cadastrar}.
* As informações cadastradas serão listadas em uma tabela abaixo.
* Na ultima coluna do lado direito de cada produto listado terá dois botões, um de editar e outro de excluir.
* A função de editar retorna as informações do medicamento para os mesmo campos do cadastro, é só fazer a alteração que deseja
e clicar em {Cadastrar}.


------------------------------------------------------------
PROPOSTA DO PROJETO

Escolha 3 entidades para o banco de dados, elas precisam ter relacionamentos {AS ENTIDADES}:
- medicamento
- marca
- fornecedor
* "medicamento" se relaciona com "marca" e "fornecedor"

faça um CRUD completo das 3 entidades usando a plataforma do Java EE, esse CRUD deverá ter uma tela JSF (Oriento usar PrimeFaces):
- As três entidades tem seus Cruds completos, segui a oriêntação e usei o PrimeFace.
- o projeto seguiu o padão MVC.



