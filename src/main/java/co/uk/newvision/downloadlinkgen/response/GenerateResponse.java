package co.uk.newvision.downloadlinkgen.response;

public class GenerateResponse {

    private final String generatedLink;
    private final String usages;
    private static Integer dtExpire = 30 ;

    public GenerateResponse(String generatedLink, String usages) {
        this.generatedLink = generatedLink;
        this.usages = usages;
    }

    public String getGeneratedLink() {
        return generatedLink;
    }

    public String getUsages() {
        return usages;
    }

    public static Integer getDtExpire() {
        return dtExpire;
    }
}
