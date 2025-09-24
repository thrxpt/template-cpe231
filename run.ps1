# Clean up bin
if (Test-Path bin) {
	Remove-Item bin -Recurse -Force
}

# Compile
javac -d bin -sourcepath src .\src\th\ac\kmutt\cpe\algorithm\theeraphat\*.java

# Run
java -cp bin th.ac.kmutt.cpe.algorithm.theeraphat.Main
