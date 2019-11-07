package org.sapphon.adapterexample.factory;

import org.sapphon.adapterexample.model.*;

public class DomainObjectFactory {

    public static Orange fromApple(Apple apple) {
        return new AppleOrangeAdapter(apple);
    }

    public static PublicUserAdapter fromUser(User input) {
        return new PublicUserAdapter(input);
    }
}
