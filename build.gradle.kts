plugins {
    id("java-library")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
}

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "org.example.Main"  // Replace with your actual main class
        )
    }
}



tasks.test {
    useJUnitPlatform()
}