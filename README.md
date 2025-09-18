🏦 Simulador de Sistema Bancário em Java
Este projeto é uma simulação de um sistema bancário básico, desenvolvido em Java como um exercício prático para aplicar e demonstrar os principais conceitos de Programação Orientada a Objetos (POO).

O sistema é uma aplicação de console que permite a criação e gerenciamento de contas bancárias, realizando operações como saques, depósitos, transferências e processamento de taxas e rendimentos.

✨ Funcionalidades Principais
Abertura de Contas: Criação de diferentes tipos de contas (Conta Corrente e Conta Poupança).

Operações Básicas: Realização de depósitos e saques, com validação de saldo.

Transferências: Transferência de valores entre contas com segurança.

Busca de Contas: Localização de contas específicas através do número.

Processamento em Lote:

Cobrança de taxas de manutenção mensais (apenas para Contas Corrente).

Aplicação de rendimentos mensais (apenas para Contas Poupança).

Gerenciamento de Clientes: Associação de contas a clientes, que possuem dados como nome, CPF e endereço.

Tratamento de Erros: Sistema robusto de exceções para lidar com operações inválidas (ex: saldo insuficiente, conta não encontrada, valor inválido).

🔧 Tecnologias e Conceitos Aplicados
Este projeto foi construído utilizando Java e foca na aplicação dos seguintes conceitos de POO e engenharia de software:

Abstração: Uso de classes abstratas (Conta) para modelar comportamentos e atributos comuns.

Encapsulamento: Proteção dos atributos das classes com modificadores de acesso (private, protected) e exposição controlada através de métodos (getters).

Herança: Especialização da classe Conta nas classes filhas ContaCorrente e ContaPoupanca.

Polimorfismo: Utilização de uma lista de Conta para armazenar objetos de seus subtipos, e aplicação de operações em lote com o operador instanceof.

Interfaces: Definição de contratos de comportamento com as interfaces Transacionavel, Tributavel e Rentavel, promovendo um design desacoplado e flexível.

Composição: Relação "tem-um" entre as classes (uma Conta tem um Cliente, um Cliente tem um Endereco).

Tratamento de Exceções: Criação e utilização de exceções customizadas (SaldoInsuficienteException, ContaNaoEncontradaException) para um controle de fluxo de erros robusto.

Java Collections Framework: Uso de ArrayList para gerenciar a coleção de contas na classe Banco.

📂 Estrutura do Projeto
O código está organizado da seguinte forma:

Banco: Classe principal que atua como controladora, orquestrando todas as operações e gerenciando a lista de contas.

Conta (abstrata): Superclasse que define a estrutura e os comportamentos base de todas as contas.

ContaCorrente e ContaPoupanca: Subclasses que herdam de Conta e implementam lógicas específicas, como cobrança de taxas e aplicação de rendimentos.

Cliente e Endereco: Classes de modelo que representam os dados do titular da conta e seu endereço.

Interfaces (Transacionavel, Tributavel, Rentavel): Contratos que definem as capacidades que uma classe pode implementar.

Exceptions: Classes de exceções customizadas para um tratamento de erros específico do domínio do problema.

SimulacaoBancaria: Classe executável com o método main para testar e demonstrar o funcionamento do sistema.

🚀 Como Executar
Para compilar e executar este projeto, você precisará de um JDK (Java Development Kit) instalado em sua máquina (versão 8 ou superior).

Clone o repositório:

Bash

git clone https://github.com/seu-usuario/nome-do-repositorio.git
Navegue até o diretório do projeto:

Bash

cd nome-do-repositorio
Compile os arquivos .java:
(Navegue até a pasta onde estão os arquivos fontes, ex: src)

Bash

javac *.java */*.java  # Compila os arquivos na pasta atual e em subpastas
Se você estiver usando uma IDE como IntelliJ, Eclipse ou VS Code, basta abrir o projeto e clicar em "Run" na classe SimulacaoBancaria.

Execute a simulação:

Bash

java SimulacaoBancaria
O terminal exibirá o log completo de todas as operações realizadas no cenário de teste.

✒️ Autor
[Seu Nome Completo Aqui]

LinkedIn: https://www.linkedin.com/in/seu-usuario/

GitHub: https://github.com/seu-usuario

Este projeto foi desenvolvido como parte de um estudo aprofundado em Programação Orientada a Objetos com Java.
