package org.delicious.View;

import java.util.concurrent.TimeUnit;

public class AnimatedPrompts {
    public static void animatePrompt(String promptText) {

        try {
            for (char c : promptText.toCharArray()) {
                System.out.print(c);
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
