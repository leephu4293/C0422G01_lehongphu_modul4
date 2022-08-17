package web.model;


public class Email {
    private String language;
    private String pageSize;
    private String filter;
    private String sign;

    public Email() {

    }

    public Email(String language, String pageSize, String filter, String sign) {
        this.language = language;
        this.pageSize = pageSize;
        this.filter = filter;
        this.sign = sign;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
