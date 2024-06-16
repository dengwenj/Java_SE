package pm;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

class ItemDTO {
    private Long id;
    private String name;
    private Integer price;
    private Integer stock;
    private String image;
    private String category;
    private String brand;
    private String spec;
    private Integer sold;
    private Integer commentCount;
    private Boolean isAD;
    private Integer status;


    public ItemDTO() {
    }

    public ItemDTO(Long id, String name, Integer price, Integer stock, String image, String category, String brand, String spec, Integer sold, Integer commentCount, Boolean isAD, Integer status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.image = image;
        this.category = category;
        this.brand = brand;
        this.spec = spec;
        this.sold = sold;
        this.commentCount = commentCount;
        this.isAD = isAD;
        this.status = status;
    }

    /**
     * 获取
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 获取
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return spec
     */
    public String getSpec() {
        return spec;
    }

    /**
     * 设置
     * @param spec
     */
    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * 获取
     * @return sold
     */
    public Integer getSold() {
        return sold;
    }

    /**
     * 设置
     * @param sold
     */
    public void setSold(Integer sold) {
        this.sold = sold;
    }

    /**
     * 获取
     * @return commentCount
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 设置
     * @param commentCount
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 获取
     * @return isAD
     */
    public Boolean getIsAD() {
        return isAD;
    }

    /**
     * 设置
     * @param isAD
     */
    public void setIsAD(Boolean isAD) {
        this.isAD = isAD;
    }

    /**
     * 获取
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}


class GenericTypeReference<T, B> {
    private final Class<T> type;

    protected GenericTypeReference() {
        Type superClass = getClass().getGenericSuperclass();
        this.type = (Class<T>) ((ParameterizedType) superClass).getActualTypeArguments()[0];
    }

    public Class<T> getType() {
        return this.type;
    }

    public static void main(String[] args) {
        // 匿名内部类，所以也会获取父类的泛型
        // 和 RestTemplate 的有一个获取类型参数一行的思想
        GenericTypeReference<ItemDTO, String> stringTypeRef = new GenericTypeReference<ItemDTO, String>() {};
        System.out.println("Generic type: " + stringTypeRef.getType());
    }
}

// 和 MybatisPlus一样的思想，BaseMapper<ItemDTO>
class MyList extends ArrayList<ItemDTO> {
    // ...
}
class Ww {
    public static void main(String[] args) {
        MyList myList = new MyList();

        Type type = myList.getClass().getGenericSuperclass();
        ParameterizedType p = (ParameterizedType) type;
        Type[] actualTypeArguments = p.getActualTypeArguments();
        Class<?> actualTypeArgument = (Class<?>) actualTypeArguments[0];
        Field[] fields = actualTypeArgument.getDeclaredFields();
        System.out.println(Arrays.toString(fields));
    }
}