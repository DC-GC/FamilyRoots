plugins {
	java
	id("org.springframework.boot") version "3.4.2"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.medilla"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.springframework.data:spring-data-jpa:3.4.1")

	// "@Entity" will not exist without this dependency
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.4.1")

	testImplementation("com.h2database:h2:2.2.224")

}

tasks.withType<Test> {
	useJUnitPlatform()
}

