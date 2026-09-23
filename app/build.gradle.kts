plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "ru.tvoyhod.app"
    compileSdk = 35
    defaultConfig {
        applicationId = "ru.tvoyhod.app"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.22"))
    implementation("androidx.webkit:webkit:1.12.1")
}
