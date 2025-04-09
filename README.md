# ConfigController

# Gerenciamento de Montagem de Computadores

## Descrição
Este projeto tem como objetivo a criação de um sistema de gerenciamento de montagem de computadores utilizando **Programação Orientada a Objetos (POO)** em **Java**. O sistema permite o cadastro e manipulação de componentes de um computador, incluindo **processador, memória, placa de vídeo e armazenamento**.

## Tecnologias Utilizadas
- **Java** (JDK 8+)
- **Paradigma POO** (Herança, Encapsulamento e Polimorfismo)
- **UML** (Diagrama de classes para modelagem do sistema)

## Estrutura do Projeto
O sistema segue a estrutura **MVC (Model-View-Controller)**, dividindo as responsabilidades em diferentes camadas:

### 1. **Modelo (Model)**
Responsável pela representação dos componentes do computador.

- **Computador**: Classe principal que agrupa os componentes.
- **Processador**: Define fabricante, modelo e frequência.
- **Memória**: Define fabricante e frequência.
- **Placa de Vídeo**: Define fabricante e modelo.
- **Armazenamento**: Define tipo e tamanho.

### 2. **Visão (View)**
Responsável pela interação com o usuário.
- **Leitura**: Classe que captura entradas do usuário.

### 3. **Controle (Controller)**
Controla o fluxo de informações entre modelo e visão.
- **TstComp**: Classe principal que inicializa o sistema.

## Funcionalidades
- Criar objetos para representar componentes de um computador.
- Definir e obter atributos como marca, modelo, tamanho e frequência.
- Utilização de relações de **herança** e **composição** entre classes.

## Como Executar o Projeto
1. **Clone o repositório:**
   ```sh
   git clone https://github.com/seu-usuario/projeto-computador.git
   ```
2. **Compile os arquivos Java:**
   ```sh
   javac src/*.java
   ```
3. **Execute o programa principal:**
   ```sh
   java src.TstComp
   ```

## Melhorias Futuras
- Implementar interface gráfica (GUI) para melhor usabilidade.
- Criar um banco de dados para armazenar configurações salvas.
- Adicionar suporte a mais componentes de hardware.



