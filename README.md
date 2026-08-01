# Minecraft Plugins

Paper plugin development server for Minecraft Java Edition 26.2.

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
