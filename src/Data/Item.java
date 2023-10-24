package Data;

import Services.IdService;

import java.io.Serializable;

public class Item implements Serializable {
    private String name;
    private ProductCategory category;
    private StorageType storageType;

    public Item(String name, ProductCategory category, StorageType storageType) {
        this.name = name;
        this.category = category;
        this.storageType = storageType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public StorageType getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageType storageType) {
        this.storageType = storageType;
    }
    @Override
    public String toString() {
        return name +"\n" + category.toString();
    }
}

