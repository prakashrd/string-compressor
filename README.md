# string-compressor
For a given string compresses the occurrences of characters if minimum occurrence of character exceeds the threshold

### Examples
If the given string is *QQQFAAABEEEDFFC* and the minimum occurrences is *3* then the it outputs
**3QF3AB3ED2FC**

Few more examples
*ABBCDD*, *2* --> outputs **A2BC2D**
*ABBBCCDDD*, *3* --> outputs **A3BCC3D**

### Requirements for Development Environment
 1. Install [Java8 SDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
 1. Install [Scala](https://www.scala-lang.org/download/install.html).
 1. Install [sbt](http://www.scala-sbt.org/release/docs/Setup.html)
 
### Usage
Having installed the above mentioned dependencies. Checkout the code from [String-Compressor](https://github.com/prakashrd/string-compressor)

**checkout the code**
- `git clone git@github.com:prakashrd/string-compressor.git`
**issue the follow**
- `cd string-compressor`
- `make build`
- `scala target/scala-2.12/string-compressor-assembly-0.1.jar -i <input-string> -m <minimum-occurency>`

### ToDo's
1. Have used ListBuffer need to investigate other options if any from performance perspective.