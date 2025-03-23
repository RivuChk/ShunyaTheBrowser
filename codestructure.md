# Code Structure

## Browser Engine
- Android: Gecko
- iOS: Default/Webkit/Safari. Refactor to a custom Gecko engine later on. 
- JVM (low priority): jxbrowser/Chromium to start. Refactor to a custom Gecko engine later on.

## DB
- SQLDelight

## Architecture
- Clean, single module for now, we'll refactor to multimodular later on
- Structure
  - DB
  - Data
  - Feature based packaging
    - Domain (Usecases)
    - Presentation & UI
 
### Dependency Management & build tool
- Gradle, toml

### DI
- Kotlin-inject - https://github.com/evant/kotlin-inject
  
### Navigation
- Custom built, since it's not traditional app.
- Compose-Nav when required
- Handle back press to go back to previous web address, like any other browser.

### Concurrency & data-stream
- Coroutines, Flow

### Remote config (when required, we'll try to avoid)
- Firebase Remote Config

### Tests
- Unit Tests: Kotest + Mockk
- UI Testing: Maestro
