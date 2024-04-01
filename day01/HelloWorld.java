public class HelloWorld {
  public static void main(String[] args) {
    // javac 去编译(有后缀)会产生字节码文件，java 去运行(没后缀)
    // javac 是 JDK 提供的编译工具，我们可以通过这个工具，把当前路径下的 HelloWorld.java 文件编译成 class 文件
    // java 也是 JDK 提供的一个工具，作用是用来运行代码的，运行当前路径下的 HelloWorld.class 这个文件。在运行的时候不加后缀名
    System.out.println("Hello World");
  }
}
