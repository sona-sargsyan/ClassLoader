import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        List<Class<? extends Animal>> animals = new ArrayList<Class<? extends Animal>>();
        MyClassLoader myClassLoader = new MyClassLoader();

        animals.add(myClassLoader.findClass("Cat"));
        animals.add(myClassLoader.findClass("Dog"));
        for (Class animal : animals) {

            Object animalObject = animal.getDeclaredConstructor().newInstance();
            Method playMethod = animal.getDeclaredMethod("play");
            Method voiceMethod = animal.getDeclaredMethod("voice");
            playMethod.invoke(animalObject);
            voiceMethod.invoke(animalObject);
        }
    }
}
