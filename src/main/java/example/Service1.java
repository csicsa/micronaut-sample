package example;

import io.micronaut.context.annotation.Requires;

import javax.inject.Singleton;

@Singleton
@Requires(notEnv = {"test", "other"})
public class Service1 implements Service{
    @Override
    public String someMethod() {

        return "Service 1";
    }
}
