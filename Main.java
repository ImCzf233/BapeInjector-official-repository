package Client;

import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;
import you.cant.fucking.crack.it.verify;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Main {
    public static String path = System.getProperty("user.dir");

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Launcher");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭按钮的动作为退出窗口
        frame.setSize(700, 400);                          // 设置窗口大小
        JLabel m=new JLabel();
        Icon icon=new ImageIcon("src/img/java.png");		//获取图片
        JLabel la=new JLabel();  //标签
        la.setIcon(icon);			//将图片放在标签中
        la.setHorizontalAlignment(SwingConstants.LEFT); //设置图片在标签的最左边
        la.setBounds(10, 10,300, 150);
        Dimension displaySize = Toolkit.getDefaultToolkit().getScreenSize(); // 获得显示器大小对象
        Dimension frameSize = frame.getSize();             // 获得窗口大小对象
        if (frameSize.width > displaySize.width)
            frameSize.width = displaySize.width;           // 窗口的宽度不能大于显示器的宽度
        if (frameSize.height > displaySize.height)
            frameSize.height = displaySize.height;          // 窗口的高度不能大于显示器的高度
        frame.setLocation((displaySize.width - frameSize.width) / 2,
                (displaySize.height - frameSize.height) / 2); // 设置窗口居中显示器显示
        frame.setVisible(true);
    }
}
//verify.doVerify();