package ISP;

class NewsArticle implements SocialMediaPost {
    public void like() {
        System.out.println("Article liked");
    }

    public void comment(String text) {
        System.out.println("Comment: " + text);
    }

    public void share() {
        System.out.println("Article shared");
    }

    public void edit(String newText) {
        throw new UnsupportedOperationException("Readers cannot edit articles");
    }
}