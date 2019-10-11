import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    java
    kotlin("jvm") version "1.3.50"
}

group = "com.alekseysamoylov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("io.cucumber:cucumber-java8:4.7.4")
    testImplementation("io.cucumber:cucumber-junit:4.7.4")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.2")

}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
