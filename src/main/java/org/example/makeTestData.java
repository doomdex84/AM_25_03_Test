package org.example;

public class makeTestData {
    public static void main(String[] args) {

//        if (cmd.equals("article write")) {
            System.out.println("==게시글 작성==");
            int id = lastArticleId + 1;
            String regDate = Util.getNowStr();
            String updateDate = Util.getNowStr();
            System.out.print("제목 : ");
            String title = sc.nextLine().trim();
            System.out.print("내용 : ");
            String body = sc.nextLine().trim();
    }
}

