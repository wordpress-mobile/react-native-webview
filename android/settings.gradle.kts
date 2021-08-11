pluginManagement {
    gradle.ext.kotlinVersion = "1.5.20"

    plugins {
        id("com.android.library") version "4.2.2"
        id "org.jetbrains.kotlin.android" version gradle.ext.kotlinVersion
    }
    repositories {
        gradlePluginPortal()
        google()
    }
}
