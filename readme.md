## Scala 3 Workshop

### Requirements
 - A terminal
 - A text editor (an IDE is not required, but you may prefer it)
 - Git
 - Java, version 11 or later

## Getting started

To get started, clone this repository, and change to the `work` directory:

```sh
git clone git@github.com:propensive/workshop
cd workshop/work
```

You can open `src/helloworld.scala` file in your text editor.

### Fonts

For the build tool, it is recommended that you use a font with a comprehensive set of Unicode
glyphs for your terminal, since the default Mac OS X font is missing certain glyphs. I recommend
[JetBrains Mono](https://www.jetbrains.com/lp/mono/). (This will be fixed in a later version of the
build tool.)

### Building for the first time

To build and run the sample code for the first time, run the build tool launcher script,
```sh
./irk
```
to launch it.

This will download the highly experimental [Irk](https://github.com/propensive/irk) build tool,
which is written in Scala 3, and includes all the Scala 3 binaries. It will replace the launcher
script with a full executable, and run the first build, which will clone some other source
repositories in the process.

You can always run Irk by calling `./irk`, but it may be convenient to copy the `irk` executable to
`/usr/local/bin` or somewhere else on your path, so that it can be run from anywhere. It's
entirely self-contained, so you just need to move one file.

### Continuous development

Running `irk -w` will watch for changes to source directories, and automatically recompile if they
change. It will even recompile if the build file, `build.irk` changes.

### Known issue

On Mac OS X, after every time you run `irk`, an `Interrupted system call` message is reported. This
looks like a bug in the script, and seems to be innocuous. It does not seem to occur on Linux.

## Cleaning up

The build tool is experimental, and is certainly not bug-free. If anything goes wrong, follow these
steps to get back to safety.

1. Kill Irk with `killall irk`
2. After a few seconds, check that it's not listed when you run `jps`
3. If not, try `killall -9 irk`

When you no longer need to use Irk, you can delete its cache files which are stored in `~/.cache/irk`.
```sh
rm -r ~/.cache/irk
```
