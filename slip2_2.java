// B) Design a screen in Java to handle the Mouse Events such as MOUSE_MOVED and
// MOUSE_CLICK and display the position of the Mouse_Click in a TextField
import java.awt.*;
import java.awt.event.*;
public class slip2_2 extends Frame implements MouseListener,MouseMotionListener
{
    TextField t1;
    slip2_2()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        t1=new TextField(20);
        add(t1);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me){
        t1.setText("x pos:"+me.getX()+"y pos:"+me.getY());
       }
       public void mouseEntered(MouseEvent me){
       }
       public void mouseExited(MouseEvent me){
       }
       public void mousePressed(MouseEvent me){
       }
       public void mouseReleased(MouseEvent me){
       }
       public void mouseMoved(MouseEvent me)
       {
         t1.setText("x pos:"+me.getX()+"y pos:"+me.getY());
       }
       public void mouseDragged(MouseEvent me){
       }
       public static void main(String[] args) {
         new  slip2_2();
       }
}

