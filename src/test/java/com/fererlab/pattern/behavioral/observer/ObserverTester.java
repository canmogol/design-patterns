package com.fererlab.pattern.behavioral.observer;

import org.junit.Test;

import java.util.Observable;
import java.util.Observer;

public class ObserverTester {

    @Test
    public void testObserver() {
        /**
         * MessageStream : Concrete Subject
         */
        Subject subject = new MessageStream();
        /**
         * PhoneClient : Concrete Observer
         */
        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a new message!");
        tabletClient.addMessage("Another message");
    }

    @Test
    public void everydayExample() {
        TwitterStream messageStream = new TwitterStream();

        Client client1 = new Client("John");
        Client client2 = new Client("Wick");

        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someoneTweeted();
    }

    /**
     * Concrete Subject
     */
    private class TwitterStream extends /*Subject*/Observable {
        public void someoneTweeted() {
            setChanged();
            notifyObservers("New Tweet Here!");
        }
    }

    /**
     * Concrete Observer
     */
    private class Client implements /*Observer*/Observer {
        private final String name;

        public Client(String name) {
            this.name = name;
        }

        @Override
        public void update(Observable o, Object arg) {
            TwitterStream stream = (TwitterStream) o;
            System.out.println("stream = " + stream);
            System.out.println("arg = " + arg);
            System.out.println("Update " + name + "'s stream, someone tweeted something");
        }
    }
}
