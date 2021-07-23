plugins {
    kotlin("multiplatform") version "1.5.21"
}

allprojects {
    repositories {
        jcenter()
        mavenCentral()
    }
}

kotlin {
    ios()

    sourceSets {
        val commonMain by getting {
            dependencies {
                api("com.louiscad.splitties:splitties-bitflags:3.0.0-beta03")
            }
        }
    }
}
