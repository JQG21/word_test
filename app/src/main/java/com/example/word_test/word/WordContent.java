package com.example.word_test.word;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class WordContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<WordItem> ITEMS = new ArrayList<WordItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, WordItem> ITEM_MAP = new HashMap<String, WordItem>();

    private static final int COUNT = 25;

    private static void addItem(String id,String word,String meaning,String sample) {
        WordItem item = new WordItem(id,word,meaning,sample);
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class WordItem implements Serializable {
        public final String id;
        public final String word;
        public final String meaning;
        public final String sample;

        public WordItem(String id, String word, String meaning,String sample) {
            this.id = id;
            this.word = word;
            this.meaning = meaning;
            this.sample = sample;
        }
}
static {
        addItem("0","apple","苹果","I want an apple.");
        addItem("1","Orange","橙子","Would you care for some orange juice");
        addItem("2","Banana","香蕉","this is an banana.");
        addItem("3","lemon","柠檬","A lemon is a acid fruit.");
        addItem("4","pear","梨子","There are lots of pear trees near the house");
}
}