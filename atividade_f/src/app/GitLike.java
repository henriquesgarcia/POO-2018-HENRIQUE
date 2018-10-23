package app;

import java.time.format.DateTimeFormatter;

public class GitLike {

    public static void main(String[] args) {

        System.out.println((java.time.LocalDate.now()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println((java.time.LocalTime.now()).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
