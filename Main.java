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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �رհ�ť�Ķ���Ϊ�˳�����
        frame.setSize(700, 400);                          // ���ô��ڴ�С
        JLabel m=new JLabel();
        Icon icon=new ImageIcon("src/img/java.png");		//��ȡͼƬ
        JLabel la=new JLabel();  //��ǩ
        la.setIcon(icon);			//��ͼƬ���ڱ�ǩ��
        la.setHorizontalAlignment(SwingConstants.LEFT); //����ͼƬ�ڱ�ǩ�������
        la.setBounds(10, 10,300, 150);
        Dimension displaySize = Toolkit.getDefaultToolkit().getScreenSize(); // �����ʾ����С����
        Dimension frameSize = frame.getSize();             // ��ô��ڴ�С����
        if (frameSize.width > displaySize.width)
            frameSize.width = displaySize.width;           // ���ڵĿ�Ȳ��ܴ�����ʾ���Ŀ��
        if (frameSize.height > displaySize.height)
            frameSize.height = displaySize.height;          // ���ڵĸ߶Ȳ��ܴ�����ʾ���ĸ߶�
        frame.setLocation((displaySize.width - frameSize.width) / 2,
                (displaySize.height - frameSize.height) / 2); // ���ô��ھ�����ʾ����ʾ
        frame.setVisible(true);
    }
}
//verify.doVerify();