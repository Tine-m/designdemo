package ISP;

/* General purpose mega interface
* Change design to 4 small dedicated interfaces instead
* */
interface SocialMediaPost {
    void like();
    void comment(String text);
    void share();
    void edit(String newText);
}
