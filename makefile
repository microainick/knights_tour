clean:
	clear
	rm *.class

build:
	javac BaseBank.java

run:
	clear
	java -cp . BaseBank
