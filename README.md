# Java-Spring

Sprint 4 of the Java Bootcamp at IT Academy (Barcelona Activa).

## Enunciats

### Ex 1.1: Spring i Maven

- Crea un projecte amb Spring Initialzr sota el package: `cat.barcelonactiva.itacademy`, packaging en Jar, Java mínim versió 11 i dependències: Spring Boot DevTools i Spring Web.
- A l’arxiu application.properties, configura la variable server.port amb el valor 9000.
- Convertirem aquesta aplicació en una API REST:
  - Depenent del package principal, crea un altre subpackage anomenat Controllers, i dins seu, afegeix la classe HelloWorldController. 
  - Haurà de tenir dos mètodes:
    - String saluda
    - String saluda2
  - Aquests dos mètodes rebran un paràmetre String anomenat nom, i retornaran la frase:
    - “Hola, “ + nom + “. Estàs executant un projecte Maven”.
  -  El primer mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com un RequestParam. El paràmetre "nom" tindrà el valor per defecte “UNKNOWN”.
  - Haurà de respondre a:
    - http://localhost:9000/HelloWorld
    - http://localhost:9000/HelloWorld?nom=El meu nom
  - El segon mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com una PathVariable. El paràmetre "nom" serà opcional.
  - Haurà de respondre a:
    - http://localhost:9000/HelloWorld2
    - http://localhost:9000/HelloWorld2/el meu nom
  

### Ex 1.2: Spring i Gradle

Fes el mateix fent servir Gradle en comptes de Maven.

### Ex 1.3: Postman

Prova els dos projectes anteriors amb Postman.

### Ex 2.1: CRUD amb H2

Implementa el CRUD amb un projecte creat a partir d'Spring Initialzr amb les mateixes característiques que l'exercici 1.1 i 1.2 i afegint les dependències addicionals: Spring Data JPA i H2 Database.

#### Model

Tenim una entitat anomenada "Fruita", que disposa de les següents propietats:

- int id
- String nom
- int quantitatQuilos

Aprofitant l’especificació JPA, hauràs de persistir aquesta entitat a una base de dades H2, seguint el patró MVC. Per a això, depenent del Package principal, crearàs una estructura de packages, on ubicaràs les classes que necessitis:

- cat.itacademy.barcelonactiva.ex2_1.controllers
- cat.itacademy.barcelonactiva.ex2_1.model.domain
- cat.itacademy.barcelonactiva.ex2_1.model.services
- cat.itacademy.barcelonactiva.ex2_1.model.repository

La classe ubicada al paquet controllers (FruitaController, per exemple), haurà de ser capaç de donar resposta a les següents peticions per actualitzar i consultar informació:

- http://localhost:8080/fruita/add
- http://localhost:8080/fruita/update
- http://localhost:8080/fruita/delete/{id}
- http://localhost:8080/fruita/getOne/{id}
- http://localhost:8080/fruita/getAll

**Important**: Hauràs de tenir en compte les bones pràctiques de disseny de les API, fent servir correctament els codis d'error i les respostes en cas d'invocacions incorrectes. (Pots consultar informació sobre ResponseEntity).

### Ex 2.2: CRUD amb MySQL

Fes el mateix que a 2.1, però persistint les dades a MySQL.

A Spring Initializr, substitueix la dependència `H2 Database` per `MySQL Driver`.

### Ex 2.3: CRUD amb MongoDB

Fes el mateix que a 2.1, però persistint les dades a MongoDB.

A Spring Initializr, substitueix la dependència `H2 Database` per `Spring Data MongoDB`.










