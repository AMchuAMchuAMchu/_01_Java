package com.atguigu.testenum;

public enum Season1002{
    SPRING("春天","雪乃"),
    SUMMER("夏天","赤瞳"),
    FALL("秋天","楪祈"),
    WINTER("冬天","校条祭");

    private final String seasonName;
    private final String seasonDESC;

    Season1002(String seasonName, String seasonDESC) {
        this.seasonName = seasonName;
        this.seasonDESC = seasonDESC;
    }

    @Override
    public String toString() {
        return "Season1002{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDESC='" + seasonDESC + '\'' +
                '}';
    }
}
