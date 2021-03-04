package company.sibirsoft.test.domain;

public class Message {
    private String word; //конкретное слово
    private String quantity;// количество конкретных слов

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
