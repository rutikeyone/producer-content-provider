plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false

    id("com.google.dagger.hilt.android") version "2.51.1" apply false
    alias(libs.plugins.jetbrains.kotlin.jvm) apply false

}