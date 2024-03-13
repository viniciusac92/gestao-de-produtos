## Gestao de Produtos

### Objetivo do projeto
Desenvolver uma aplicação prática em Java para criação, listagem e busca de produtos, com a particularidade de que cada produto deve possuir um nome único, utilizando dos métodos nativos e orientação a objetos.

### Executando o projeto - Ubuntu

    find src -name "*.java" -print | 
    xargs javac -d compiled | 
    sleep 2 && 
    java -cp compiled Main
