plugins {
	java
	id("org.springframework.boot") version "3.4.0-M2"
	id("io.spring.dependency-management") version "1.1.6"
	id("com.diffplug.spotless") version "6.25.0"
	id("com.github.ben-manes.versions") version "0.51.0"
}

group = "de.claudioaltamura"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("ch.qos.logback:logback-classic:1.5.7")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}