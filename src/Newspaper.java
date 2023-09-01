public class Newspaper extends LibraryItem {
    private int issueNumber;

    Newspaper(String title, int issueNumber) {
        super(title, null);
        this.issueNumber = issueNumber;
    }

    public Integer getIssueNumber() {
        return this.issueNumber;
    }
}
