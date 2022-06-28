package example

import gossamer.*, stdouts.stdout

@main
def hello(): Unit = for i <- 1 to 10 do Out.println(t"Hello world!")
