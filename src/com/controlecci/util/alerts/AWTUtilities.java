package com.controlecci.util.alerts;

import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Rojeru San
 */
public class AWTUtilities {

    public static void setOpaque(Window window, boolean opaque) {
        try {

            Class<?> awtUtilsClass = Class.forName("com.sun.awt.AWTUtilities");
            if (awtUtilsClass != null) {
                Method method = awtUtilsClass.getMethod("setWindowOpaque", Window.class, boolean.class);
                method.invoke(null, window, opaque);
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException
                | SecurityException | InvocationTargetException exp) {
        }
    }

    public static void setOpacity(Window window, float opacidad) {
        try {

            Class<?> awtUtilsClass = Class.forName("com.sun.awt.AWTUtilities");
            if (awtUtilsClass != null) {
                Method method = awtUtilsClass.getMethod("setWindowOpacity", Window.class, float.class);
                method.invoke(null, window, opacidad);
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException
                | SecurityException | InvocationTargetException exp) {
        }
    }
}
