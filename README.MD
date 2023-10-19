#  Alunos Generation Brasil

[![GitHub license](https://img.shields.io/github/license/RennanMendes/fastmoney.svg)](https://github.com/RennanMendes/fastmoney/blob/master/LICENSE)

##  Sobre

Este projeto foi criado como parte do desafio do processo seletivo para o curso de AWS da Generation Brasil. O objetivo principal deste projeto é desenvolver um CRUD para armazenar os dados dos alunos de uma escola. Os dados a serem coletados e armazenados incluem:

- ID
- Nome
- Idade
- Nota do primeiro semestre
- Nota do segundo semestre
- Nome do professor
- Número da sala

## Tecnologias utilizadas

| <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-plain.svg" alt="Java Icon" width="40" height="40" /> | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" alt="Spring Icon" width="48" height="48" /> | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-plain.svg" alt="`PostgreSQL` Icon" width="40" height="40" /> | ![Docker](https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-plain.svg) | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/intellij/intellij-original.svg" alt="Intellij Icon" width="40" height="40" /> |
| :--: | :--: | :--: | :--: | :--: |
| Java | Spring | PostgreSQL | Docker | IntelliJ |

## Instalação

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)

Siga estas etapas para instalar e executar o projeto:
1. Clone o repositório: `git clone git@github.com:RennanMendes/fastmoney.git`

2. Compile o projeto usando o Maven: `mvn clean install`

3. Execute o projeto: `java -jar target/fastmoney.jar`

O aplicativo Spring será executado na porta padrão 8080. Você pode acessá-lo em http://localhost:8080.

## Banco de Dados PostgreSQL

A escolha do banco de dados relacional para este projeto é devido a sua modelagem organizada, coesão, integridade e segurança dos dados.

## Você também pode testar a aplicação em deploy:

- [API Alunos Generation Brasil](https://api-test-generation.onrender.com/swagger-ui/index.html#/)
