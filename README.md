# 🩺 Medical Clinic API (Voll.med)

Uma API REST para gerenciamento de médicos de uma clínica médica.

Este projeto foi desenvolvido utilizando **Java 21** e **Spring Boot 3**, com foco em boas práticas de desenvolvimento, organização de código, separação de responsabilidades e persistência de dados em banco relacional.

A API permite cadastrar, listar, atualizar e desativar médicos, mantendo a integridade dos dados históricos através de **exclusão lógica**.

---

# 🚀 Funcionalidades

A API fornece um **CRUD completo de médicos**.

### ✔ Cadastro de médicos

Permite registrar novos médicos com validação de dados como:

* Nome
* Email
* Telefone
* Especialidade

### ✔ Listagem paginada

Consulta de médicos ativos com suporte a:

* Paginação
* Ordenação

### ✔ Atualização de dados

Atualização de informações como:

* Nome
* Telefone
* Endereço

### ✔ Exclusão lógica

Os médicos não são removidos do banco de dados.
Eles são **desativados**, preservando o histórico.

---

# 🏗 Arquitetura do Projeto

A aplicação segue uma **arquitetura em camadas**, muito utilizada em aplicações backend Java.

```
Controller → Recebe requisições HTTP

Service → Contém as regras de negócio

Repository → Responsável pelo acesso ao banco de dados

DTO → Objetos de transferência de dados

Entity → Representação das entidades do banco
```

Essa estrutura facilita:

* manutenção
* organização
* escalabilidade do projeto

---

# 🛠 Tecnologias Utilizadas

| Tecnologia      | Descrição                     |
| --------------- | ----------------------------- |
| Java 21         | Linguagem principal           |
| Spring Boot 3   | Framework backend             |
| Spring Data JPA | Abstração de persistência     |
| Hibernate       | ORM                           |
| MySQL           | Banco de dados relacional     |
| Maven           | Gerenciamento de dependências |
| Postman         | Teste da API                  |

---

# 📡 Endpoints da API

### Criar médico

```
POST /medicos
```

### Listar médicos

```
GET /medicos
```

### Atualizar médico

```
PUT /medicos/{id}
```

### Desativar médico

```
DELETE /medicos/{id}
```

---

# 📥 Exemplo de requisição (Cadastro de médico)

```json
{
  "nome": "Dr. João Silva",
  "email": "joao@email.com",
  "telefone": "11999999999",
  "especialidade": "CARDIOLOGIA"
}
```

---

# 🗄 Banco de Dados

O projeto utiliza **MySQL**.

Crie o banco antes de executar a aplicação:

```sql
CREATE DATABASE vollmed_api;
```

---

# ⚙ Configuração

Configure o arquivo:

```
src/main/resources/application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_api
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# ▶ Como executar o projeto

### 1️⃣ Clonar o repositório

```
git clone https://github.com/joaosiilvva1/medical-clinic-api.git
```

### 2️⃣ Entrar na pasta do projeto

```
cd medical-clinic-api
```

### 3️⃣ Executar a aplicação

Utilizando Maven:

```
mvn spring-boot:run
```

Ou execute diretamente pela sua IDE.

---

# 🧪 Testando a API

Você pode testar os endpoints usando:

* Postman
* Insomnia
* Thunder Client (VSCode)

---

# 📚 Melhorias futuras

Algumas melhorias planejadas para o projeto:

* Autenticação com **Spring Security + JWT**
* Documentação da API com **Swagger / OpenAPI**
* Cadastro de pacientes
* Sistema de consultas médicas
* Docker para execução do projeto
* Testes automatizados

---

# 👨‍💻 Autor

Desenvolvido por **João** como projeto de aprendizado em **Backend Java**.

---

⭐ Se este projeto te ajudou ou foi interessante, considere dar uma estrela no repositório.
