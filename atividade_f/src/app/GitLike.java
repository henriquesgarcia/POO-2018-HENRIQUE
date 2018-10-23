package app;

import model.Commit;

import java.time.format.DateTimeFormatter;

public class GitLike {

    public static void main(String[] args) {

        Commit c1 = new Commit("Henrique","Primeiro commit");
        System.out.println(c1);

    }
}
