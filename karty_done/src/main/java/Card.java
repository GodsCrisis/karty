public class Card {
    private String name;
    private String type;
    private String manaCost;
    private String colors;
    private String toughness;
    private String power;
    private String imgLink;
    public Card(String name, String type, String manaCost, String colors, String imgLink, String toughness, String power){
        this.name=name;
        this.type=type;
        this.manaCost=manaCost;
        this.colors=colors;
        if(toughness.equals("*")){
            this.toughness="\"*\"";
        }
        else{
            this.toughness=toughness;
        }
        if(power.equals("*")){
            this.power="\"*\"";
        }
        else{
            this.power=power;
        }
        this.imgLink=imgLink;
    }
    public Card(String name, String type, String manaCost, String colors, String imgLink){
        this.name=name;
        this.type=type;
        this.manaCost=manaCost;
        this.colors=colors;
        this.imgLink=imgLink;
    }

    public String getName() {
        return "{" +
                "\"name\":\"" + name + '\"';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return "\"type\":\"" + type + "\"}";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManaCost() {
        return "\"manaCost\":\"" + manaCost + '\"'+"}";
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getColors() {
        return "\"colors\":\"" + colors + "\"}";
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getToughness() {
        return "\"toughness\":\"" + toughness + "\"}";
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public String getPower() {
        return "\"power\":\"" + power + "\"}";
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getImgLink() {
        return "\"imgLink\":\"" + imgLink + "\"}";
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\":\"" + name + '\"' +
                ",\"type\":\"" + type + '\"' +
                ",\"manaCost\":\"" + manaCost + '\"' +
                ",\"colors\":" + colors +
                ",\"toughness\":" + toughness +
                ",\"power\":" + power +
                ",\"imgLink\":\"" + imgLink + '\"' +
                '}';
    }
}
