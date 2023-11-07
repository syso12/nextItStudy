package ch16_network.open_api.dto;

public class MedicineDTO {

    private String entpName;
    private String itemName;
    private String efcyQesitm;

    public MedicineDTO(String entpName, String itemName, String efcyQesitm) {
        this.entpName = entpName;
        this.itemName = itemName;
        this.efcyQesitm = efcyQesitm;
    }

    public MedicineDTO() {
    }

    @Override
    public String toString() {
        return "mediDTO{" +
                "entpName='" + entpName + '\'' +
                ", itemName='" + itemName + '\'' +
                ", efcyQesitm='" + efcyQesitm + '\'' +
                '}';
    }

    public String getEntpName() {
        return entpName;
    }

    public void setEntpName(String entpName) {
        this.entpName = entpName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getEfcyQesitm() {
        return efcyQesitm;
    }

    public void setEfcyQesitm(String efcyQesitm) {
        this.efcyQesitm = efcyQesitm;
    }
}
