# KToDo

TODO

## Setup

### Install Software

- Git
- Java 11 (e.g. install manually or via [SDKMan](https://sdkman.io/))
- IntelliJ IDEA (community edition is fine)

### Clone and Open the Project

```bash
git clone https://github.com/phauer/ktodo.git
```

In IntelliJ IDEA, use `File > Open...` and open the created `ktodo` folder.

### Start the Project

- On the left `Project` panel, navigate to `src/main/kotlin/com.phauer.ktodo/KToDoApplication.kt`, right-click on the file and execute `Run KToDoApplication.kt`.
- In the browser, open [http://localhost:8080/](http://localhost:8080/). You should see a simple HTML site.

## Look into the Database with the H2 Console

- [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- JDBC URL: "jdbc:h2:mem:testdb"
- username: "sa"
- password: "password"
