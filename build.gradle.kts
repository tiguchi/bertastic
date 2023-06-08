plugins { id("io.vacco.oss.gitflow") version "0.9.8" }

group = "io.vacco.bertastic"
version = "0.1.0"

configure<io.vacco.oss.gitflow.GsPluginProfileExtension> {
  addJ8Spec()
  sharedLibrary(true, false)
}

val api by configurations

dependencies {
  implementation("org.tensorflow:tensorflow-core-api:0.4.1")
  testImplementation("com.robrua.nlp.models:easy-bert-uncased-L-12-H-768-A-12:1.0.0")
}
