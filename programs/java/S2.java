package selfpractice;

import java.util.ArrayList;

public class S2 {
    private ArrayList<Integer> locationCells = new ArrayList<>(); // जहाज़ की लोकेशन
    private int numOfHits = 0; // कितने हिट हो चुके हैं

    // लोकेशन सेट करने का method
    public void setLocationCells(int[] locs) {
        for (int loc : locs) {
            locationCells.add(loc);
        }
    }

    // यूज़र का guess चेक करने का method
    public String checkYourself(int userInput) {
        String result = "miss"; // default miss

        int index = locationCells.indexOf(userInput);
        
        if (index >= 0) {
            locationCells.remove(index); // उस जगह को हटा दो
            if (locationCells.isEmpty( )) {
                result = "kill"; // सब डूब गया
            } else {
                result = "hit";  // बीच में हिट हुआ
            }
        }
        return result;
    }
}
