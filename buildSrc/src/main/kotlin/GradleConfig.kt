import org.gradle.api.JavaVersion

object GradleConfig {
    val minSdkVersion = 21
    val compileSdkVersion = 29
    val targetSdkVersion = 29
    val javaVersion = JavaVersion.VERSION_1_8
    val kotlinVersion = "1.3.61"
    val gradlePluginVersion = "3.5.3"
    val buildToolsVersion = "29.0.2"

    val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}