package com.fererlab.pattern.structural.proxy;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class TwitterServiceImpl implements TwitterService {

    private static final String TWITTER_CONSUMER_KEY = "fqbMFYsUozu9HhKLFQ0zzpWsZ";
    private static final String TWITTER_SECRET_KEY = "GrwHXexPdNUYBGMS5o09nWCNTqTKgS5Tz9s7woZqhyA2jia6J3";
    private static final String TWITTER_ACCESS_TOKEN = "1831718911-OM2vKmm4iHxagPG5r3N5bsWnnGfF5ECr3XKcM96";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "xDSh5S8iQbxI2log1cIaWUlDkEeXmrpyhxr2T9TShWmDF";

    @Override
    public String getTimeline(String screenName) {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        StringBuilder builder = new StringBuilder();
        try {
            Query query = new Query(screenName);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    builder.append("@").append(tweet.getUser().getScreenName()).append(" - ").append(tweet.getText());
                    builder.append("\n");
                }
            } while ((query = result.nextQuery()) != null);

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return builder.toString();
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        //we aren't going to allow this
        System.out.println("message = " + message);
    }
}