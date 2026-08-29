# Projeto Cadastro de Clientes
Tarefa atribuída pelo professor da matéria de Linguagem de Programação 2
## O que faz

Este projeto demonstra a criação e utilização de uma classe `Cliente` em Java.

A classe `Cliente` possui quatro informações:

* Nome
* Endereço
* Telefone
* E-mail

Essas informações são armazenadas em atributos privados e podem ser acessadas ou alteradas através dos métodos `get` e `set`.
A classe `Principal` é responsável por executar o programa. Ela cria três objetos da classe `Cliente`, cadastra os dados de cada um e depois mostra essas informações no console.

## Tecnologias Usadas

* **Java** — linguagem utilizada para desenvolver o projeto.
* **Programação Orientada a Objetos (POO)** — utilizada através da criação da classe `Cliente` e de seus objetos.
* **Getters e Setters** — utilizados para acessar e modificar os atributos privados da classe.
* **NetBeans** — IDE utilizada para desenvolver/executar o projeto Java.

## Como executar o código

### Pelo NetBeans

1. Abra o **NetBeans**.
2. Abra ou importe o projeto Java.
3. Certifique-se de que os arquivos `Cliente.java` e `Principal.java` estão dentro do pacote `cliente`.
4. Execute a classe `Principal.java`.
5. O programa exibirá no console os dados dos três clientes cadastrados.

### Pelo terminal

Caso esteja utilizando o terminal do VS Code ou outro terminal:

1. Entre na pasta onde está o código.
2. Compile os arquivos Java:

```bash
javac -d . Cliente.java Principal.java
```

3. Execute a classe principal:

```bash
java cliente.Principal
```

O programa então exibirá no terminal os dados dos três clientes.
