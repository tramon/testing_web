package testing_web.commons.dao.github;


public class CreateRepoJsonDao {

    private String name;
    private String description;
    private String homepage;
    private String isPrivate;
    private String has_issues;
    private String has_projects;
    private String has_wiki;


    public CreateRepoJsonDao() {
        name = "repositoryName";
        description = "Repository description";
        homepage = "https://github.com";
        isPrivate = "false";
        has_issues = "false";
        has_projects = "false";
        has_wiki = "false";
    }

    public CreateRepoJsonDao(String name) {
        this.name = name;
        description = "Repository description";
        homepage = "https://github.com";
        isPrivate = "false";
        has_issues = "false";
        has_projects = "false";
        has_wiki = "false";
    }

    public CreateRepoJsonDao(String name, String description) {
        this.name = name;
        this.description = description;
        homepage = "https://github.com";
        isPrivate = "false";
        has_issues = "false";
        has_projects = "false";
        has_wiki = "false";
    }

    public CreateRepoJsonDao setName(String repositoryName) {
        this.name = repositoryName;
        return this;
    }

    public CreateRepoJsonDao setDescription(String repositoryName) {
        this.description = repositoryName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public String getHomepage() {
        return homepage;
    }

    public CreateRepoJsonDao setHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    public String getIsPrivate() {
        return isPrivate;
    }

    public CreateRepoJsonDao setIsPrivate(String isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    public String getHas_issues() {
        return has_issues;
    }

    public CreateRepoJsonDao setHas_issues(String has_issues) {
        this.has_issues = has_issues;
        return this;
    }

    public String getHas_projects() {
        return has_projects;
    }

    public CreateRepoJsonDao setHas_projects(String has_projects) {
        this.has_projects = has_projects;
        return this;
    }

    public String getHas_wiki() {
        return has_wiki;
    }

    public CreateRepoJsonDao setHas_wiki(String has_wiki) {
        this.has_wiki = has_wiki;
        return this;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"name\": \"" + name + "\",\n" +
                "  \"description\": \"" + description + "\",\n" +
                "  \"homepage\": \"" + homepage + "\",\n" +
                "  \"private\": " + isPrivate + ",\n" +
                "  \"has_issues\": " + has_issues + ",\n" +
                "  \"has_projects\": " + has_projects + ",\n" +
                "  \"has_wiki\": " + has_wiki + "\n" +
                "}";
    }

}
