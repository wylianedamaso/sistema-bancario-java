# Sistema Bancário em Java
## Descrição

Projeto desenvolvido com objetivo de praticar lógica de programação e conceitos fundamentais da linguagem de Java 
e desenvolvimento backend.

O sistema funciona no terminal e simula operações bancárias básicas, como consulta de saldo, depósito e saque.

Durante a evolução do projeto foram aplicados conceitos como tratamento de exceções, organização de código em pacotes 
e princípios iniciais de Programação Orientada a Objetos (POO), separando responsabilidades entre as classes do sistema.

Este projeto continuará evoluindo com novas funcionalidades e melhorias de arquitetura conforme o aprendizado avança.

---
## Funcionalidades

- Consultar saldo
- Realizar depósito
- Realizar saque
- Validação de valores inválidos
- Validação de saldo insuficiente
- Tratamento de entradas inválidas do usuário
- Menu interativo no terminal
---

## Conceitos Aplicados
Durante o desenvolvimento deste projeto foram aplicados diversos conceitos importantes da linguagem Java:

- Variáveis e tipos primitivos (`int`, `double`)
- Estruturas de repetição (`while`)
- Estruturas de decisão (`switch`)
- Condicionais (`if / else`)
- Entrada de dados com `Scanner`
- Tratamento de exceções (`try / catch`)
- Programação Orientada a Objetos (POO)
- Encapsulamento
- Organização de código em **pacotes**

---

## Estrutura do Projeto
```
src
└── br.com.wyliane
    ├── banco
    │   └── ContaBancaria.java
    └── sistemabancario
        └── SistemaBancario.java
```

### Responsabilidade das Classes

**ContaBancaria**

Responsável pela lógica da conta:

- consultar saldo
- realizar depósitos
- realizar saques

**SistemaBancario**

Responsável pelo fluxo do programa:

- exibir menu
- receber entrada do usuário
- chamar os métodos da conta bancária

---

## Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

---

## Como Executar

1. Clone este repositório:
   git clone https://github.com/wylianedamaso/sistema-bancario-java.git

2. Acesse o diretório do projeto:
   cd sistema-bancario-java
 
3. Compile o arquivo:
```
javac br/com/wyliane/sistemabancario/SistemaBancario.java
```
4. Execute o programa:
```
java br.com.wyliane.sistemabancario.SistemaBancario
```

---

## Melhorias Futuras

Algumas melhorias planejadas para evolução do projeto:

- Implementar múltiplas contas bancárias
- Adicionar transferência entre contas
- Criar histórico de transações
- Implementar persistência de dados (arquivo ou banco de dados)
- Criar interface gráfica
- Aplicar princípios de **Clean Code**

---

## 👩‍💻 Autor

**Wyliane Damaso Da Silva**

Estudante de Desenvolvimento Backend Java