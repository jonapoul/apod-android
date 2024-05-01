plugins {
  kotlin("android")
  id("com.android.library")
  id("convention-compose")
  id("convention-style")
  id("com.dropbox.dependency-guard")
}

dependencyGuard {
  configuration("releaseRuntimeClasspath")
}
