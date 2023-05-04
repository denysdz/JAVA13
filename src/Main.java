
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame {

    public MyFrame() {
        super("Меню");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu insertMenu = new JMenu("Вставка");
        JMenu nameSubMenu = new JMenu("Ім'я");
        nameSubMenu.add(new JMenuItem("Присвоїти"));
        nameSubMenu.add(new JMenuItem("Створити"));
        insertMenu.add(nameSubMenu);
        insertMenu.add(new JMenuItem("Функція"));

        JMenu formatMenu = new JMenu("Формат");
        formatMenu.add(new JMenuItem("Рядок"));
        formatMenu.addSeparator();
        formatMenu.add(new JMenuItem("Стовпець"));

        JMenu serviceMenu = new JMenu("Сервіс");
        serviceMenu.add(new JMenuItem("Захист"));
        serviceMenu.add(new JCheckBoxMenuItem("Таблиця налаштувань"));

        menuBar.add(insertMenu);
        menuBar.add(formatMenu);
        menuBar.add(serviceMenu);

        setJMenuBar(menuBar);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}

public class Main {
    public static void main(String[] args) {
        new MyFrame();
    }

}