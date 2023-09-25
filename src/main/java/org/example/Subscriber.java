package org.example;

public class Subscriber {
    public Subscriber(Topic...topics) {
        for (Topic t : topics) {
            ContentServer.getInstance().registerSubscriber(this, t);
        }
    }
    public Subscriber(){

    }

    public void receivedMessage(Topic t, Message m) {
        System.out.println(t.getDescription() + m.getMessage());
    }
}
