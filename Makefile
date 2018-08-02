.PHONY: default build clean test package

build:
	sbt assembly:assembly

clean:
	sbt clean

compile:
	sbt compile

test:
	sbt test

package:
	sbt package

