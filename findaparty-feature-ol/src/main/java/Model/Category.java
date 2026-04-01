package Model;

import java.security.PublicKey;

public class Category {
    public String categoryName;

    public String categoryId;

    private Club category;

    public String getCategoryName() {
        return categoryName;
    }


    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Club getCategory() {
        return category;
    }

    public void setCategory(Club category) {
        this.category = category;
    }


}
