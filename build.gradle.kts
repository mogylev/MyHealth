buildscript {


    dependencies {
        classpath(Build.androidBuildTools)
        classpath(Build.hiltAndroidGradlePlugin)
        classpath(Build.kotlinGradlePlugin)
    }

}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {

    id("com.android.library") version "7.3.0" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
}

allprojects {

}

tasks.register("clean", Delete::class) {
    delete (rootProject.buildDir)
}