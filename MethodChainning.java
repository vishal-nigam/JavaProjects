package com.vishalnigam.methodchaining;

/**
 * Created by ShwetaVishal on 6/18/2016.
 */
public class MethodChainning {

    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger("");

    public Object getObject(int anyNumber, ObjectA a) {
        boolean isvalid = validateInputs(anyNumber, a);
        if (isvalid) {
            try {

            } catch (Exception e) {

            }
        } else {

        }
        return null;
    }

    private boolean validateInputs(int anyNumber, ObjectA a) {

        return false;
    }


    private boolean validateInputs(int anyNumber, ObjectB b) {

        return false;
    }


    public Object getObject(int anyNumber, ObjectB b) {
        boolean isvalid = validateInputs(anyNumber, b);
        if (isvalid) {
            try {

            } catch (Exception e) {

            }


        } else {

        }
        return null;
    }


}


class ObjectA {

}

class ObjectB {

}
