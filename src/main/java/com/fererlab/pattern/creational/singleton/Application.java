package com.fererlab.pattern.creational.singleton;

public class Application {

    /**
     * this static instance will holt the single object
     */
    private static Application instance;

    /**
     * private constructor will disable creation of objects from this class using new keyword
     */
    private Application() {
    }

    /**
     *
     * @return Application object's thread safe static singleton instance
     */
    public static Application getInstance() {
        // check if the instance is null
        if (instance == null) {
            // synchronized block is inside the if condition
            // thats because the synchronized block might slow down this method's call
            synchronized (Application.class) {
                // the catch with this approach is we had to check the same condition here again
                if (instance == null) {
                    // create and assign the instance
                    instance = new Application();
                }
            }
        }
        // return instance, at this point it shold not be null
        return instance;
    }

}
