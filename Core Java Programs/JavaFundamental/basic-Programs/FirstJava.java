package basicPrograms;

//Java features
//1.class based
//2.object oriented
//3.high level
//
//4.compiled => javac and interpreted/JVM => java
//                  compiler             interpreter/JVM
//source code(.java) => byte code(.class) => machine/native code(.exe)
//
//****JVM(Java Virtual Machine)
//- virtual bcz,it doesn't exists physically
//-converts byte code(.class) into machine/native code(.exe)
// - abstract/hidden machine
//-JVM-> platform depdendent
//JVM is designed using c and cpp, and c and cpp are the platform dependent languages
//that's why JVM is also platform dependent
//
//- JVM is heart of the java programming
//-for diff OS we need to install diff JVM 
//
//
//5.java=>Platform(OS+processor) independent language
//=> that java's byte code is platform independent bcz, we can crete that byte code on one platform and execute it on any other platforms without making any changes into that code
//WORA(Write Once Run Anywhere)
//windows
//Linux
//mac
//
//*** JVM, ,JSDK,JRE
//
//JSDK(Java Standard DEVELOPMENT/code Kit)  => consists of tools which are used to DEVELOP an application
//
//JRE (Java RUNTIME Environment)  => consists of tools which are used to RUN an application e.g javac, java/JVM

public class FirstJava {

	public static void main(String[] args) {
		
		System.out.println("Welcome To First Java Programs");

	}

}
