package fis.java.bigexample.enums;

public enum Rank {
    TRAINEE,JUNIOR,SENIOR,INSPECTOR,CHEF_INSPECTOR;

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
