# Projeto: Aplicação de Design Patterns com Java e Spring

O objetivo desse projeto foi a criação de uma API que consome outra, com integração de um banco de dados relacional em memória utilizando JPA, e aproveitar dessas premissas para colocar em prática alguns padrões de projeto.

Na primeira etapa foram estruturados exemplos de aplicação dos _Design Patterns Singleton_, _Strategy_ e _Facade_, utilizando a linguagem Java.

A outra etapa consistiu em replicar os passos com os conceitos apresentados anteriormente utilizando o framework Spring, mas dessa vez consumindo a [API do ViaCEP](https://viacep.com.br/) para auxiliar na obtenção de dados relacionados a endereço, e fazendo uso do banco de dados H2.

Projeto criado seguindo a mentoria de [Venilton FalvoJr](https://github.com/falvojr).

### Ferramentas utilizadas:
 - Java
 - Spring com os seguintes módulos:
    - Spring Data Jpa
    - Spring Web
    - H2 Database
    - OpenFeign

### Inicialização o projeto:

#### Java:

Execute o: 

#### `Test.main()`


#### Spring:

Execute o: 

#### `Application.main()`

No navegador, insira a URL:

#### `http://127.0.0.1:8080/swagger-ui/index.html`

Esse projeto foi criado com a utilização do [Spring Initializr](https://start.spring.io/).



 
