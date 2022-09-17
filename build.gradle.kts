buildscript {


    dependencies {
        classpath(Build.androidBuildTools)
        classpath(Build.hiltAndroidGradlePlugin)
        classpath(Build.kotlinGradlePlugin)
    }

}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {

    id("com.android.library") version "7.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.7.0" apply false
}

allprojects {

}

tasks.register("clean", Delete::class) {
    delete (rootProject.buildDir)
}