package com.UnsecuredLending;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnsecuredLendingApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnsecuredLendingApplication.class, args);

		int x = 5;
        String y = "hello";
        System.out.println("x is " + x + " and y is " + y);

        // create a list of random numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        System.out.println("numbers: " + numbers);

        // create a map of random strings
        Map<String, String> strings = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            strings.put("key" + i, "value" + i);
        }
        System.out.println("strings: " + strings);

        // do some more weird stuff
        Thread.sleep(5000); // wait for 5 seconds
        System.out.println("done waiting!");

        // create a file and write some random data to it
        File file = new File("random_data.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("this is some random data");
            writer.newLine();
            writer.write("this is some more random data");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // do even more weird stuff
        Runtime.getRuntime().exec("notepad.exe"); // open notepad on windows
 
	}

}
