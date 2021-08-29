package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Covariant_return_types {

    static class Flower {
        String whatsYourName() {
            return "I have many names and types.";
        }
    }

    static class Jasmine extends Flower {
        @Override
        String whatsYourName() {
            return "Jasmine";
        }
    }

    static class Lily extends Flower {
        @Override
        String whatsYourName() {
            return "Lily";
        }
    }

    static class Region {
        Flower yourNationalFlower() {
            return new Flower();
        }
    }

    static class WestBengal extends Region {
        @Override
        Jasmine yourNationalFlower() {
            return new Jasmine();
        }
    }

    static class AndhraPradesh extends Region {
        @Override
        Lily yourNationalFlower() {
            return new Lily();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }

}
