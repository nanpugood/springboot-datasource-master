package com.dh.ms.common;

import java.util.concurrent.atomic.AtomicInteger;

public class DSContextHolder {
    private static final ThreadLocal<DSNames> contextHolder = new ThreadLocal<>();
    private static final AtomicInteger counter = new AtomicInteger(-1);

    public static void set(DSNames dsType) {
        contextHolder.set(dsType);
    }

    public static DSNames get() {
        return contextHolder.get();
    }

    public static void master() {
        set(DSNames.MASTER);
    }

    public static void slave() {
        set(DSNames.SLAVE1);
        /*int index = counter.getAndIncrement() % 2;
        if (counter.get() > 9999) {
            counter.set(-1);
        }
        if (index == 0) {
            set(DSNames.SLAVE1);
        }else {
            set(DSNames.SLAVE2);
        }*/
    }
}
