public class Card {
    private String name;
    private String type;
    private String manaCost;
    private String colors;
    private int toughness;
    private int power;
    private String imgLink;
    public Card(String name, String type, String manaCost, String colors, String imgLink, int toughness, int power){
        this.name=name;
        this.type=type;
        this.manaCost=manaCost;
        this.colors=colors;
        this.toughness=toughness;
        this.power=power;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", manaCost='" + manaCost + '\'' +
                ", colors='" + colors + '\'' +
                ", toughness=" + toughness +
                ", power=" + power +
                ", imgLink='" + imgLink + '\'' +
                '}';
    }
}
