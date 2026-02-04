package ISP;

/* General purpose mega interface
* Change design into 4 small specific interfaces instead
* Test that your refactored design works
*/

interface SocialMediaPost {
    void like();
    void comment(String text);
    void share();
    void edit(String newText);
}
