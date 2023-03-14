package com.atguigu.testenum;

import java.nio.file.FileAlreadyExistsException;

public class Season1001 {

    private final String seasonName;
    private final String seasonDesc;

    private Season1001(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public static final Season1001 SPRING = new Season1001("春天","雪乃");
    public static final Season1001 SUMMER = new Season1001("夏天","堀北铃音");
    public static final Season1001 FALL = new Season1001("秋天","樱岛麻衣");
    public static final Season1001 WINTER = new Season1001("冬天","千反田爱瑠");

    @Override
    public String toString() {
        return "Season1001{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
