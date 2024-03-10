
# Backend do Trabalho de Engenharia de Software 2

Este repositório contém o código-fonte do backend desenvolvido como parte do trabalho da disciplina de Engenharia de Software 2 (ES2). O backend foi construído utilizando Java, Spring Framework, JPA, Hibernate e PostgreSQL.

> Sistema de Gerenciamento de Projetos

Configuração de Ambiente
------------

Certifique-se de ter as seguintes ferramentas instaladas antes de executar o projeto:

- Java
- Maven
- PostgreSQL

Além disso, é necessário configurar o arquivo application.properties dentro da pasta resources com as informações do banco de dados PostgreSQL:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

Executando o Projeto
------------

### Executando com Maven

1. Clone este repositório.

2. Execute o comando Maven para baixar as dependências:
``` mvn clean install ```

3. Inicie a aplicação SpringBoot:

``` mvn spring-boot:run ```

### Executando com Docker/Docker-Compose

Também é possível executar o projeto usando Docker e Docker-Compose, Siga os passos abaixo:

1. Certifique-se de ter o Docker e o Docker-Compose instalados em sua máquina.

2. Clone este repositório.

3. No diretório raiz do projeto, execute o seguinte comando para construir a imagem Docker:

```docker build -t nome-do-repositorio-backend .```

4. No diretório raiz do projeto, execute o seguinte comando para construir a imagem Docker:

``` docker-compose up ```

Isso iniciará o contêiner do backend juntamente com um contêiner PostgreSQL. A aplicação estará disponível em http://localhost:8080.

Certifique-se de que não há nenhum serviço em execução na porta 8080 e 5432 antes de iniciar o Docker-Compose.

Estrutura do Projeto
------------

O projeto segue uma estrutura organizada para facilitar a manutenção e escalabilidade. Os principais pacotes incluem:

- Controller: Contém os controladores responsáveis por lidar com as - requisições HTTP.
- Service: Camada de serviço que implementa a lógica de negócios.
- Repository: Repositórios JPA para interação com o banco de dados.
- Domain: Modelos de entidades que representam os dados persistentes.

## Documentation

[Documentation](https://linktodocumentation)

