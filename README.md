# how to run

### 1. install java 21

```
$ brew tap homebrew/cask-versions
$ brew install --cask temurin21
```

### 2. set JAVA_HOME

```
export JAVA_HOME=$(/usr/libexec/java_home -v 21)
```

### 3. install project dependencies

```
$ ./mvnw clean install
```

### 4. run project

```
$ ./mvnw spring-boot:run
```

### 5. access it

`http://localhost:8080/demo.html`
