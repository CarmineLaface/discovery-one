import com.sailor.buildsrc.AndroidConfig
import com.sailor.buildsrc.Dependencies

plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(AndroidConfig.targetSdkVersion)

    defaultConfig {
        minSdkVersion(AndroidConfig.minSdkVersion)
        targetSdkVersion(AndroidConfig.targetSdkVersion)
        testInstrumentationRunner = AndroidConfig.testInstrumentationRunner
    }

    testOptions.unitTests.isIncludeAndroidResources = true
}

dependencies {
    api(project(":destination"))

    implementation(Dependencies.kotlinStdLib)
    implementation(Dependencies.kotlinReflect)
    implementation(Dependencies.appCompat)
}