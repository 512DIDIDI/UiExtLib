# UiExtLib

[![](https://jitpack.io/v/512DIDIDI/UiExtLib.svg)](https://jitpack.io/#512DIDIDI/UiExtLib)

ui lib & ext lib 

kotlin lib $ androidX lib

Step 1. Add the JitPack repository to your build file

    allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
Step 2. Add the dependency ( *uiExtLibVersion = JitPackVersion* ) 

    dependencies {
      implementation "com.github.512DIDIDI:UiExtLib:$uiExtLibVersion"
    }
    
如果使用support库依赖此库会出现`Manifest merger failed : Attribute application@appComponentFactory`，请自行搜索更新项目到AndroidX

