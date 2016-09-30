# Commands

## Java 8
### Compile

```sh
$ javac -cp "mlib/*:." src/com/github/cchacin/jigsaw/internal/MyUtility.java src/com/github/cchacin/jigsaw/MyAPI.java -d target
```

### Run

```sh
$ cd target && java com.github.cchacin.jigsaw.MyAPI && cd ..
```

### Create JAR

```sh
$ cd target && jar cfm myapi.jar ../manifest.txt com/github/cchacin/internal/MyUtility.class com/github/cchacin/jigsaw/MyAPI.class && cd ..
```

### Run the app

```sh
$ java -jar target/myapi.jar
```
