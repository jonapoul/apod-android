plugins {
  id("module-android")
}

android {
  namespace = "nasa.test.android"
}

dependencies {
  api(libs.alakazam.android.core)
  api(libs.flowpreferences)
  api(libs.kotlinx.coroutines)
  api(libs.kotlinx.datetime)
  implementation(libs.test.androidx.coreKtx)
}
