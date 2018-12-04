package example;

import javax.inject.Singleton;

@Singleton
public class Service2 implements Service {
    @Override
    public String someMethod() {

        return "Service 2";
    }
}
