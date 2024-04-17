import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Levels {
    ImageIcon moleIcon;
    ImageIcon plantIcon;
    Random random = new Random();

//   String mr_bean1 = "./mrBean/mr_bean1.jpeg";
//   String mr_bean2 = "./mrBean/mr_bean0.jpeg";
//   String mr_bean3 = "./mrBean/mr_bean2.jpeg";


//   String mrs_wicket2 = "./mrBean/mrs_wicket1.jpeg";
    Levels(){
        int num = random.nextInt(2);
        String mrs_wicket = "./mrBean/mrs_wicket"+num+".jpeg";
        String mr_bean = "./mrBean/mr_bean"+num+".jpeg";
        moleIcon = new ImageIcon(getClass().getResource(mr_bean));
        plantIcon = new ImageIcon(getClass().getResource(mrs_wicket));
//        if (num == 1) moleIcon = new ImageIcon(getClass().getResource(mr_bean1));
//       else if (num == 2) moleIcon = new ImageIcon(getClass().getResource(mr_bean2));
//        else if (num == 0) moleIcon = new ImageIcon(getClass().getResource(mr_bean3));
//        if (num % 2 != 0) plantIcon = new ImageIcon(getClass().getResource(mrs_wicket1));
//        else if (num % 2 == 0) plantIcon = new ImageIcon(getClass().getResource(mrs_wicket2));

//        plantIcon = new ImageIcon(getClass().getResource("./images/piranha.png"));
//        Image moleImg = new ImageIcon(getClass().getResource("./images/mole.png")).getImage();
//        moleIcon = new ImageIcon(moleImg.getScaledInstance(150,150, Image.SCALE_SMOOTH));
    }
}
