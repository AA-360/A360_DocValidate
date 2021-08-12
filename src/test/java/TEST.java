import com.automationanywhere.botcommand.samples.commands.conditionals.ValidateCPF;
import com.automationanywhere.botcommand.samples.commands.uteis.ValidaCPF;
import org.testng.annotations.Test;

import javax.swing.*;

import org.apache.commons.dbcp2.BasicDataSource;

import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TEST {
    @Test
    public void teste(){
        ValidateCPF a = new ValidateCPF();

        System.out.println(a.validate("086.396.144-40"));
    }
    private void alert(String text){
        JOptionPane.showMessageDialog(null, text, "InfoBox: Title", JOptionPane.INFORMATION_MESSAGE);
    }
}

