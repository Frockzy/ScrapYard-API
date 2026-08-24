//Egen klasse for scrapyard
public class Scrapyard {
    private int scrapyardid;
    private String name;
    private String adress;
    private String phonenumber;

//Genererer konstrunktør, getter og setter
    public Scrapyard(int scrapyardid, String name, String adress, String phonenumber) {
        this.scrapyardid = scrapyardid;
        this.name = name;
        this.adress = adress;
        this.phonenumber = phonenumber;
    }

    public int getScrapyardid() {
        return scrapyardid;
    }

    public void setScrapyardid(int scrapyardid) {
        this.scrapyardid = scrapyardid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
