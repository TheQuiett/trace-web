package com.example.demo.util;

import java.util.UUID;

public class CommonUtils {

    public static String createObjId(){
        String objectId = "";

        UUID uuid = new UUID(0,9);
        objectId = CommonUtils.checkNull(uuid.randomUUID().toString().replaceAll("-", "").hashCode());

        return objectId;
    }

    public static String checkNull(Object o)
    {
        if (o == null|| "null".equals(o) || "".equals(o))
            return "";
        else
            return o.toString();
    }

}
