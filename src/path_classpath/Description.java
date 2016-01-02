package path_classpath;

public class Description {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
// //TITBIT : PATH and CLASSPATH are environment variables, PATH is for
// Operating system and CLASSPATH is for running application/run time
// environment.

// CLASSPATH are used to instruct/communicate run time environment where they
// should look for user classes/jars.The default value of the classpath is ".",
// meaning that only the current directory is searched.

// PATH environment variable is used to instruct Operating system , where they
// should look for executables like javac.exe, java.exe, javadoc.exe.

// A follow-up question popup :
// Can we run our java program without specifying PATH environment variable ?
// Yes, we can. But every time we have to specify full path of javac, java
// executables. For example, for compiling our FirstProgram.java we have to do
// something like this : (From command line)

// C:\Java\jdk1.6.0\bin\javac FirstProgram.java , however if you have set PATH
// variables OS will take care of it and we can directly use javac executables
// like : javac FirstProgram.java.