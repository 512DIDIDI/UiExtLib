# UiExtLib
ui lib & ext lib 

kotlin lib

Step 1. Add the JitPack repository to your build file

    allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
Step 2. Add the dependency ( *uiExtLibVersion = 1.0.0* ) 

    dependencies {
      implementation "com.github.512DIDIDI:UiExtLib:$uiExtLibVersion"
    }
