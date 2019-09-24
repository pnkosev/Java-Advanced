import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Pr05Robotics {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<String> productQueue = new ArrayDeque<>();

        String[] robotsInput = reader.readLine().split(";");
        String[] robots = new String[robotsInput.length];
        int[] processTime = new int[robotsInput.length];
        int[] process = new int[robotsInput.length];

        for (int i = 0; i < robotsInput.length; i++) {
            String[] currentRobotTokens = robotsInput[i].split("-");
            robots[i] = currentRobotTokens[0];
            processTime[i] = Integer.parseInt(currentRobotTokens[1]);
        }

        String[] timeTokens = reader.readLine().split(":");
        int hours = Integer.parseInt(timeTokens[0]);
        int minutes = Integer.parseInt(timeTokens[1]);
        int seconds = Integer.parseInt(timeTokens[2]);

        long currentSecs = (hours * 3600) + (minutes * 60) + seconds;

        String line;

        while (!(line = reader.readLine()).equals("End")) {
            productQueue.offer(line);
        }

        while (!productQueue.isEmpty()) {
            String product = productQueue.poll();
            boolean isProcessed = false;

            currentSecs++;

            for (int i = 0; i < robots.length; i++) {
                if (process[i] == 0 && !isProcessed) {
                    process[i] = processTime[i];
                    isProcessed = true;
                    System.out.println(String.format("%s - %s %s",
                            robots[i], product, getCurrentTime(currentSecs)));
                }

                if (process[i] > 0) {
                    process[i]--;
                }
            }

            if (!isProcessed) {
                productQueue.offer(product);
            }
        }
    }

    private static String getCurrentTime(long secs) {
        int hours = (int) ((secs / 3600)) % 24;
        long remainder = secs % 3600;
        int minutes = (int) (remainder / 60);
        long seconds = remainder % 60;

        return String.format("[%02d:%02d:%02d]", hours, minutes, seconds);
    }
}
