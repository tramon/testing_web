package testing_web.commons.dao.github;

import com.google.gson.JsonObject;

public class CreateRepoJsonObject {

    private String name;
    private String description;
    private String homepage;
    private String isPrivate;
    private String has_issues;
    private String has_projects;
    private String has_wiki;


    public CreateRepoJsonObject() {
        name = "repositoryName";
        description = "Repository description";
        homepage = "https://github.com";
        isPrivate = "false";
        has_issues = "false";
        has_projects = "false";
        has_wiki = "false";
    }

    public CreateRepoJsonObject(String name) {
        this.name = name;
        description = "Repository description";
        homepage = "https://github.com";
        isPrivate = "false";
        has_issues = "false";
        has_projects = "false";
        has_wiki = "false";
    }

    public CreateRepoJsonObject(String name, String description) {
        this.name = name;
        this.description = description;
        homepage = "https://github.com";
        isPrivate = "false";
        has_issues = "false";
        has_projects = "false";
        has_wiki = "false";
    }


    private String getJsonStringToCreateRepoRequest(String repositoryName) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", repositoryName);
        jsonObject.addProperty("description", "This is your first repository");
        jsonObject.addProperty("homepage", "This is your first repository");
        jsonObject.addProperty("private", "false");
        jsonObject.addProperty("has_issues", "false");
        jsonObject.addProperty("has_projects", "false");
        jsonObject.addProperty("has_wiki", "false");

        return jsonObject.toString().replaceAll("\"", "\\\"");
    }


    public CreateRepoJsonObject setName(String repositoryName) {
        this.name = repositoryName;
        return this;
    }

    public CreateRepoJsonObject setDescription(String repositoryName) {
        this.description = repositoryName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public String getHomepage() {
        return homepage;
    }

    public CreateRepoJsonObject setHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    public String getIsPrivate() {
        return isPrivate;
    }

    public CreateRepoJsonObject setIsPrivate(String isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    public String getHas_issues() {
        return has_issues;
    }

    public CreateRepoJsonObject setHas_issues(String has_issues) {
        this.has_issues = has_issues;
        return this;
    }

    public String getHas_projects() {
        return has_projects;
    }

    public CreateRepoJsonObject setHas_projects(String has_projects) {
        this.has_projects = has_projects;
        return this;
    }

    public String getHas_wiki() {
        return has_wiki;
    }

    public CreateRepoJsonObject setHas_wiki(String has_wiki) {
        this.has_wiki = has_wiki;
        return this;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"name\": \"" + name + "\",\n" +
                "  \"description\": \"" + description + "\",\n" +
                "  \"homepage\": \"" + homepage + "\",\n" +
                "  \"private\": \"" + isPrivate + ",\n" +
                "  \"has_issues\": " + has_issues + ",\n" +
                "  \"has_projects\": " + has_projects + ",\n" +
                "  \"has_wiki\": " + has_wiki + "\n" +
                "}";
    }

}
