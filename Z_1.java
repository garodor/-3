public class Z_1 {
    int id;
    String name;
    int courier;
    String time;
    int type;

    public Z_1(int id, String name, int courier, String time, int type) {
        super();
        this.id = id;
        this.name = name;
        this.courier = courier;
        this.time = time;
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCourier() {
        return courier;
    }
    public void setCourier(int courier) {
        this.courier = courier;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }

    public String toString() {
        return "Z_1 [id=" + id + ", name=" + name + ", courier=" + courier + ", time=" + time + ", type=" + type
                + "]";
    }


}
