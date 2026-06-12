# Java-Classes

Tiny educational Android sample written in Java. Two activities pass a name string between them via an `Intent` extra to demonstrate basic Android navigation and data passing.

## What It Does

- **`MainActivity`** — shows an `EditText`, a "Send" button, and a `TextView`. On click, it trims the input, validates that it is not empty, sets the `TextView` to a greeting, and starts `SecondActivity` with the name in an `Intent` extra (`user_name`). When the input is empty it shows a prompt and a `Toast`.
- **`SecondActivity`** — reads the `user_name` extra and displays `"Welcome <name>!"` in a `TextView`.

That is the entire app surface.

## Project Layout

```
app/
  src/
    main/
      AndroidManifest.xml
      java/com/example/javaclasses/
        MainActivity.java
        SecondActivity.java
      res/layout/
        activity_main.xml
        activity_second.xml
    test/java/com/example/javaclasses/ExampleUnitTest.java
    androidTest/java/com/example/javaclasses/ExampleInstrumentedTest.java
build.gradle.kts
settings.gradle.kts
gradle/
```

## Tech Stack

- Java, source/target compatibility `JAVA_11`.
- AndroidX `appcompat`, Material Components, `androidx.activity`, ConstraintLayout (declared dependency, not used in the two layouts).
- Android Gradle Plugin via `libs.versions.toml`.
- `compileSdk 36`, `minSdk 24`, `targetSdk 36`, `versionName 1.0`, `versionCode 1`.
- Namespace and application id: `com.example.javaclasses`.

## Build / Run

1. Open the project in Android Studio (any version that supports AGP from `gradle/libs.versions.toml`).
2. Sync Gradle and let Android Studio fetch dependencies.
3. Run on an emulator or device with `Run` (the `app` configuration). The launcher activity is `MainActivity`.

## Tests

Only the default-generated stubs are present:

- `ExampleUnitTest.java` — local JUnit `addition_isCorrect` test.
- `ExampleInstrumentedTest.java` — instrumentation test asserting the package name.

There is no meaningful automated coverage of the activity logic.

## Honest Limitations

- This is a starter scratchpad, not a curated collection of Java samples or a "starter pack" for new Android developers.
- The greeting in `MainActivity` reads `"Hello" + name + "!"` (no space between `Hello` and the name). Treat this as a known cosmetic bug rather than an intended behavior.
- There is no `LICENSE` file in the repository, despite earlier README text claiming MIT licensing. The license status is therefore unspecified until a `LICENSE` file is added.
- `androidx.activity` and `constraintlayout` are pulled in via dependencies but are not exercised by the current layouts.

## License

No `LICENSE` file is present in the repository. Treat the licensing status as **unspecified** until one is added.
