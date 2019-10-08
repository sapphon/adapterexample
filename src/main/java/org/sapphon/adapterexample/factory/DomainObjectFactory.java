package org.sapphon.adapterexample.factory;

import org.sapphon.adapterexample.model.Apple;
import org.sapphon.adapterexample.model.Orange;
import org.sapphon.adapterexample.model.PublicUserAdapter;
import org.sapphon.adapterexample.model.User;

public class DomainObjectFactory {

    public static Apple fromOrange(Orange orange){
        return new Apple(/*orange.color, orange.taste*/);
    }

    public static PublicUserAdapter createPublicUser(User input){
        return new PublicUserAdapter(input);
    }
}
