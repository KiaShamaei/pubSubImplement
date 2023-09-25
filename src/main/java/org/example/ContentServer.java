package org.example;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ContentServer {
    private Hashtable<Topic, List<Subscriber>> subscriberLists;

    //make it singleTon
    private static ContentServer serverInstance;

    public static ContentServer getInstance() {
        if (serverInstance == null) {
            serverInstance = new ContentServer();
        }
        return serverInstance;
    }

    private ContentServer() {

        this.subscriberLists = new Hashtable<>();
    }

    public void sendMessage(Topic t, Message m) {
        List<Subscriber> subs = subscriberLists.get(t);
        for (Subscriber s : subs) {
            s.receivedMessage(t, m);
        }
    }

    public void registerSubscriber(Subscriber s, Topic t) {
        if(subscriberLists.get(t) == null){
            subscriberLists.put(t,new ArrayList<Subscriber>());
        }
        subscriberLists.get(t).add(s);
    }

}
