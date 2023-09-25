package org.example;

/**
 * Publisher subscriber implement HashTable of String - List<Subscriber>
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //make a topic
        Topic t1 = new Topic("kia" , 1L ,"firstTopic");
        Topic t2 = new Topic("kia2" , 1L ,"secondTopic");
        //make subscriber
        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        Subscriber s3 = new Subscriber();
        //get broker
        var broker = ContentServer.getInstance();
        //first register topic to subscriber
        broker.registerSubscriber(s1,t1);
        broker.registerSubscriber(s2,t1);
        broker.registerSubscriber(s3,t1);
        broker.registerSubscriber(s1,t2);
        //send message to this topic via a publisher
        Message m1 = new Message(" this message receive in three subscriber");
        Message m2 = new Message(" second topic just subscriber ...");

        Publisher p = new Publisher(t1);
        Publisher p2 = new Publisher(t2);
        p.publish(m1);
        p2.publish(m2);
    }
}
