package ru.clevertec.ecl.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Port {
    public static final Integer PORT_NOD_FIRST = 9001;
    public static final Integer PORT_NOD_SECOND = 9002;
    public static final Integer PORT_NOD_THIRD = 9003;

    public static Integer getPort(Integer id){
        if (id % 3 == 1){
            return PORT_NOD_FIRST;
        }
        if (id % 3 == 2){
            return PORT_NOD_SECOND;
        }
        return PORT_NOD_THIRD;
    }
}
