plugins {
  `kotlin-dsl`
}

java {
  sourceCompatibility = JavaVersion.VERSION_17
  targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
  jvmToolchain(jdkVersion = 17)
}

dependencies {
  implementation(libs.plugin.agp)
  implementation(libs.plugin.blueprint)
  implementation(libs.plugin.compose)
  implementation(libs.plugin.dependencyGraph)
  implementation(libs.plugin.dependencyGuard)
  implementation(libs.plugin.detekt)
  implementation(libs.plugin.hilt)
  implementation(libs.plugin.kotlin)
  implementation(libs.plugin.kover)
  implementation(libs.plugin.ksp)
  implementation(libs.plugin.ktlint)
  implementation(libs.plugin.licensee)
  implementation(libs.plugin.spotless)
  implementation(libs.plugin.turtle)

  // https://stackoverflow.com/a/70878181/15634757
  implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
