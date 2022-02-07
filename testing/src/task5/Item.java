package task5;

public class Item {
    private Integer value;
    private Integer size;
    private String name;

    Item(String name,Integer size, Integer value)
    {
        this.name=name;
        this.size=size;
        this.value=value;
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
