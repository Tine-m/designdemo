package ISP;

class InstagramPost implements SocialMediaPost {
    public void like() {
        System.out.println("Post liked");
    }

    public void comment(String text) {
        System.out.println("Comment: " + text);
    }

    public void share() {
        System.out.println("Post shared");
    }

    public void edit(String newText) {
        System.out.println("Post edited");
    }
}
