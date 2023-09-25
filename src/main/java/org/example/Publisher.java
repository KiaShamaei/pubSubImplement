package org.example;

public class Publisher implements PublisherContract

{
    private Topic topic;
    public Publisher(Topic t) {
        this.topic = t;
    }

    @Override
    public void publish(Message message) {
        ContentServer.getInstance().sendMessage(this.topic, message);
    }
}


