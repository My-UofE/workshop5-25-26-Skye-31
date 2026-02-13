public class StringFormatApp {
    public static void main(String[] args) {
        String name = args[0];
        Integer age = Integer.parseInt(args[1]);
        float heightM = Float.parseFloat(args[2]);

        System.out.printf("name: %-20s Age: %3s Height: %.2fm%n", name, age, heightM);
    
        float spaceHeightCm = heightM * (float) 1.023 * (float) 100; // Increase by 2.3%, convert to cm
        System.out.printf("My space height would be %.1fcm%n", spaceHeightCm);

        int marsAge = Math.round(age / (float) 1.88);
        System.out.printf("On Mars I would be approximately %d years old.%n", marsAge);
    }
}