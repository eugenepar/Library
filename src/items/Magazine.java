package items;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    public Integer getIssueNumber() {
        return this.issueNumber;
    }
}
