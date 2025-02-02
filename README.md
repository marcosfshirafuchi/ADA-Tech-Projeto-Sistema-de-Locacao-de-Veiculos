# <a href="https://imgbb.com/"><img src="https://i.ibb.co/wNCRx9z/image-2025-01-04-T23-13-02-901-Z.png" alt="image-2025-01-04-T23-13-02-901-Z" border="0" width =150 heigth = 100></a> Desenvolva + : Sistema de Locação de Veículos

#### Desenvolvido na linguagem Java por:
- Alan Cleber
- Bruno Ferreira
- Claudia Bispo 
- [Marcos Shirafuchi](https://github.com/marcosfshirafuchi)
- Mattheus Tiberio Lima
- Raquel Correa 

## Principais Tecnologias

- <img width="70px" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" title = "Java" /> <b>Java 21 :</b> Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
- <img width="70px" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" title = "IntelliJIDEA" /> <b>IntelliJIDEA :</b> Utilizei o IntelliJIDEA como a IDEA para fazer os programas em Java;



## Descrição Geral 
O objetivo deste projeto é desenvolver um sistema para uma locadora de veículos, 
aplicando os conceitos de Programação Orientada a Objetos (POO) em Java. O sistema 
permitirá o cadastro de veículos, clientes e locações, além de oferecer serviços adicionais 
para veículos de luxo. Praticar conceitos essenciais, como encapsulamento, herança, 
polimorfismo e interfaces, além de dividir as responsabilidades do projeto em equipe. 

## Requisitos Funcionais 
O sistema deve permitir as seguintes funcionalidades: 

### Cadastro de Veículos

- Os veículos podem ser de diferentes tipos, como CarroComun, CarroPremium, 
SUV, Moto e Caminhão. 
- Apenas Carros Premium e SUVs podem oferecer serviços de luxo (Carros Comuns 
não podem oferecer comportamentos de serviços de luxo). 
- Cada veículo possui: 
  - Modelo 
  - Placa 
  - Valor da diária 
  - Disponibilidade

### Cadastro de Clientes

- Dois tipos de clientes: 
  - Pessoa Física (CPF) 
  - Pessoa Jurídica (CNPJ) 
- Informações comuns: 
  - Nome 
  - Documento (CPF/CNPJ) 
  - Endereço 
  - Telefone

### Locação de Veículos 

- Um cliente pode alugar um veículo por um período específico. 
- O sistema deve calcular o valor total da locação com base no número de dias e na 
tarifa diária do veículo. 
- Deve verificar se o veículo está disponível antes de alugar.

### Serviços de Luxo

- Apenas veículos premium (CarroPremium e SUV) podem oferecer serviços adicionais.( VeiculoLuxo -> oferecerServicoPremium() ). 

### Relatórios e Consultas  

- Listagem de veículos disponíveis. 
- Listagem de veículos alugados. 
- Listagem de veículos de luxo.

## Diagrama de classes
<p align = center>
<img src="https://i.ibb.co/XxL2m5sp/Whats-App-Image-2025-02-02-at-3-21-59-PM.jpg" alt="Whats-App-Image-2025-02-02-at-3-21-59-PM" border="0">
</p>
