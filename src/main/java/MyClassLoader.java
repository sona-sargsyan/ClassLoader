public class MyClassLoader extends ClassLoader {

    @Override
    public Class findClass(String className) throws ClassNotFoundException {
        System.out.println(className + " have been found!");
        return getSystemClassLoader().loadClass(className);
    }
}
