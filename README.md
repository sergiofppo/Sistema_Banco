# 🏦 Simulador de Sistema Bancário em Java  

![Java](https://img.shields.io/badge/Java-17-orange?logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-blue)
![POO](https://img.shields.io/badge/POO-100%25-success)
![License](https://img.shields.io/badge/Licen%C3%A7a-MIT-green)
![Made with Love](https://img.shields.io/badge/Made%20with-%E2%9D%A4-red)

Este projeto é uma **simulação de um sistema bancário básico**, desenvolvido em **Java** como um exercício prático para aplicar e demonstrar os principais conceitos de **Programação Orientada a Objetos (POO)**.  

O sistema é uma aplicação de **console** que permite a criação e gerenciamento de contas bancárias, realizando operações como **saques, depósitos, transferências** e **processamento de taxas e rendimentos**.  

---

## ✨ Funcionalidades Principais  

✅ **Abertura de Contas:** Criação de diferentes tipos de contas (Conta Corrente e Conta Poupança).  
✅ **Operações Básicas:** Realização de depósitos e saques, com validação de saldo.  
✅ **Transferências:** Transferência de valores entre contas com segurança.  
✅ **Busca de Contas:** Localização de contas específicas através do número.  
✅ **Processamento em Lote:**  
   - Cobrança de taxas de manutenção mensais (apenas para Contas Corrente).  
   - Aplicação de rendimentos mensais (apenas para Contas Poupança).  
✅ **Gerenciamento de Clientes:** Associação de contas a clientes (nome e CPF).  
✅ **Tratamento de Erros:** Sistema robusto de exceções para lidar com operações inválidas (ex: saldo insuficiente, conta não encontrada, valor inválido).  

---

## 🔧 Tecnologias e Conceitos Aplicados  

🚀 **Java** – linguagem de programação principal  
🧠 **Abstração:** Uso de classes abstratas (`Conta`) para modelar comportamentos comuns  
🔒 **Encapsulamento:** Proteção dos atributos com `private` e `protected` + getters/setters  
🏛️ **Herança:** Especialização da classe `Conta` nas classes `ContaCorrente` e `ContaPoupanca`  
🎭 **Polimorfismo:** Lista de `Conta` armazenando objetos de subtipos e operações em lote  
📜 **Interfaces:** `Transacionavel`, `Tributavel`, `Rentavel` para contratos de comportamento  
⚙️ **Composição:** Uma `Conta` tem um `Cliente`  
⚠️ **Tratamento de Exceções:** `SaldoInsuficienteException`, `ContaNaoEncontradaException`  
📚 **Java Collections:** Uso de `ArrayList` para gerenciar a lista de contas  

## 📂 Estrutura do Projeto  

src/
├── Banco.java              # Classe principal que orquestra todas as operações
├── Conta.java              # Classe abstrata base
├── ContaCorrente.java      # Implementa lógica de taxa mensal
├── ContaPoupanca.java      # Implementa lógica de rendimento mensal
├── Cliente.java            # Modelo de dados do cliente
├── interfaces/
│    ├── Transacionavel.java
│    ├── Tributavel.java
│    └── Rentavel.java
├── exceptions/
│    ├── SaldoInsuficienteException.java
│    └── ContaNaoEncontradaException.java
└── SimulacaoBancaria.java  # Classe com método main para testes




## 🚀 Como Executar  

### 1️⃣ Clone o repositório  
```bash
git clone https://github.com/sergiofppo/Sistema_Banco.git
````

### 2️⃣ Navegue até o diretório do projeto

```bash
cd Sistema_Banco
```

### 3️⃣ Compile os arquivos `.java`

(Navegue até a pasta `src/`)

```bash
javac *.java */*.java
```

💡 **Dica:** Se estiver usando **IntelliJ, Eclipse ou VS Code**, basta abrir o projeto e clicar em **Run** na classe `SimulacaoBancaria`.

### 4️⃣ Execute a simulação

```bash
java SimulacaoBancaria
```

O terminal exibirá o log completo de todas as operações realizadas no cenário de teste.

---

## ✒️ Autor

👤 **Sérgio Mendes Filippo**
🔗 [LinkedIn](https://www.linkedin.com/in/sergiofppo/)
💻 [GitHub](https://github.com/sergiofppo)

---

💡 *Este projeto foi desenvolvido como parte de um estudo aprofundado em Programação Orientada a Objetos com Java.*

```
