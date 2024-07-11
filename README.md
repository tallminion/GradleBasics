# Setup of basic gradle using CLI
```agsl
gradle -init --use-defaults --type -java-application 
```
The above command will setup basic gradle project

```agsl
./gradlew build
```
The above command will build the project.
```agsl
jar {
    manifest {
        attributes(
            'Main-Class': 'com.example.MainKt'  // Replace with your actual main class
        )
    }
}
```
```agsl
tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "org.example.Main"  // Replace with your actual main class
        )
    }
}
```
To prepare a jar which is executable, we need to add above manifest code in `build.gradle` or `build.gradle.kts` respectively for groovy or Kotlin DSL.

```agsl
./gradlew jar
```
The above command creates a new jar file in `build/lib` folder.

```agsl
java -jar build/libs/filename.jar
```
The above command will execute the code

