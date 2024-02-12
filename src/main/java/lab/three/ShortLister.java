package lab.three;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
public class ShortLister {
    public static void run() throws IOException {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int ret = chooser.showOpenDialog(null);
        if (ret == JFileChooser.APPROVE_OPTION) {
            ShortWordFilter filter = new ShortWordFilter();
            File choice = chooser.getSelectedFile();
            List<String> words = Files.readAllLines(choice.toPath()).stream().filter(filter::accept).toList();
            words.forEach(System.out::println);
        }
    }
}
