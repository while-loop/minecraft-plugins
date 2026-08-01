# Minecraft Plugins

A single Paper plugin containing multiple independently organized features for
Minecraft Java Edition 26.2.

## Requirements

- Java 25
- A Minecraft Java Edition 26.2 client

## Running

```bat
.\gradlew.bat runServer
```

On the first run, Paper creates `run/eula.txt` and exits. Review the
[Minecraft EULA](https://aka.ms/MinecraftEULA), change `eula=false` to
`eula=true` if you agree, and run the command again.

Connect from Minecraft using the server address `localhost`.

## Building

```bat
.\gradlew.bat build
```

The plugin JAR is written to `build/libs`.

## Adding a feature

Each event-based feature is a class in
`src/main/java/dev/whileloop/minecraftplugins/features` that implements
Paper's `Listener` interface. Add an instance of the class to the `features`
list in `MinecraftPlugins.java`. The single `runServer` task builds and loads
all listed features as one plugin JAR.
