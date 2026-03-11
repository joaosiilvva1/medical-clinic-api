# 🩺 Voll.med API - Clínica Médica

Uma **API REST profissional** para o gerenciamento de uma clínica médica, desenvolvida com **Java 21** e **Spring Boot 3**.

O projeto segue boas práticas utilizadas no mercado, como **separação de responsabilidades, validações rigorosas de dados, documentação interativa da API e tratamento padronizado de erros**.

---

# 🚀 Novidades da Versão Atual

### 📖 Documentação Interativa

Implementação do **Swagger UI** para visualização e testes rápidos dos endpoints da API.

### ⚠️ Tratamento de Erros

Padronização das respostas de erro da aplicação, incluindo códigos como:

* 400 – Bad Request
* 404 – Not Found
* 500 – Internal Server Error

Isso facilita a integração com aplicações **Front-end**.

### 🔒 Segurança e Validação de Dados

Uso de **Bean Validation** para garantir a integridade das informações recebidas pela API.

Exemplos de validações:

* campos obrigatórios
* validação de e-mail
* validação de CPF

---

# 🏗 Arquitetura e Organização

A aplicação segue o padrão **arquitetura em camadas**, amplamente utilizado em aplicações backend com Spring.

```
Controllers  → Exposição dos endpoints REST
Services     → Regras de negócio da aplicação
Repositories → Acesso e manipulação do banco de dados
DTOs         → Transferência de dados entre camadas
Infra        → Configurações globais e tratamento de exceções
```

Essa estrutura facilita:

* manutenção
* escalabilidade
* organização do código

---

# 🛠 Tecnologias Utilizadas

| Tecnologia        | Descrição                                     |
| ----------------- | --------------------------------------------- |
| Java 21           | Versão moderna da linguagem Java              |
| Spring Boot 3.2   | Framework para desenvolvimento rápido de APIs |
| Spring Data JPA   | Abstração para persistência de dados          |
| Hibernate         | ORM para mapeamento objeto-relacional         |
| MySQL             | Banco de dados relacional                     |
| Flyway            | Controle de versão e migração de banco        |
| Swagger (OpenAPI) | Documentação automática da API                |

---

# 📡 Endpoints Principais

## 🧑‍⚕️ Médicos & Pacientes

### Criar registro

```
POST /medicos
POST /pacientes
```

### Listar registros

```
GET /medicos
GET /pacientes
```

A listagem é **paginada** e retorna apenas registros ativos.

### Atualizar registro

```
PUT /medicos
PUT /pacientes
```

### Exclusão lógica

```
DELETE /medicos/{id}
DELETE /pacientes/{id}
```

Os registros não são removidos permanentemente, apenas **desativados** no sistema.

---

# 📖 Acessar Documentação da API

Com a aplicação em execução, acesse:

```
http://localhost:8080/swagger-ui/index.html
```

A interface do **Swagger UI** permite:

* visualizar endpoints
* testar requisições
* analisar respostas da API

---

# ⚙️ Configuração do Projeto

### 1️⃣ Criar banco de dados

No MySQL:

```
CREATE DATABASE medical_clinic_api;
```

---

### 2️⃣ Configurar credenciais

Edite o arquivo:

```
src/main/resources/application.properties
```

Adicione suas credenciais de banco.

---

### 3️⃣ Executar a aplicação

Execute via IDE ou usando Maven Wrapper:

```
./mvnw spring-boot:run
```

---

# 👨‍💻 Autor

Desenvolvido por **João Vitor** como parte da evolução contínua em **Engenharia de Software e desenvolvimento Backend com Java**.

---

⭐ Se este projeto foi útil para você, considere deixar uma estrela no repositório.
