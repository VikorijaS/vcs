package vcs;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cb-vice on 2016.10.14.
 */
public class Data {

    public static void main(String[] args) {

        //-----------------------------------------------------------

        Date data =  new Date();
        String formatas = "'data:' yyyy-MM-dd '---' 'laikas:' HH:mm:ss";
        SimpleDateFormat adf = new SimpleDateFormat(formatas);
        String musuData = adf.format(data);

        System.out.println(musuData);


        //----------------------------------------------------------
}// main end
}

