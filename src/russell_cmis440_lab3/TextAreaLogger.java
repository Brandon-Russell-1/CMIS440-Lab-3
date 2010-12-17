package russell_cmis440_lab3;


/**
* Program Name:
* @author Brandon R Russell
* @Course CMIS440
* Date:
* Program Requirements:
* Program Design:
* Things you what me to know before I grade your work:
*/

/** What is this?*
*|----------------------------------------------------------------------------|
*|                                CRC:                                        |
*|----------------------------------------------------------------------------|
*|What it is*                            What class uses this*                |
*|----------------------------------------------------------------------------|
*/


import javax.swing.JTextArea;


public class TextAreaLogger {
    
    private JTextArea myDebugJTextArea = null;

    public TextAreaLogger(JTextArea aJTextArea){
        myDebugJTextArea = aJTextArea;
    }

    public void log(String msg){
        myDebugJTextArea.setText(msg);
    }

    public void log(String msg, int value){
        myDebugJTextArea.setText(msg + " = " + value);
    }


}
