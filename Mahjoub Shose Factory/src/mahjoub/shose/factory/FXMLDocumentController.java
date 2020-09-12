/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjoub.shose.factory;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Mohammed A Mahjoub
 */
public class FXMLDocumentController implements Initializable {
String Model ;
    //For AnchorPane Main**
    @FXML
    private AnchorPane Main;
    @FXML
    private JFXButton btnForMen, btnForWomen;
    //***********************

    //For AnchorPane ForWomen**
    @FXML
    private AnchorPane ForWomen;
    @FXML
    private JFXButton btnWClosedSlipper, btnWSlipper, btnWBoots, btnWBack;
    //***********************

    //For AnchorPane ForMen**
    @FXML
    private AnchorPane ForMen;
    @FXML
    private JFXButton btnMBoots, btnMSlipper, btnMBack;
    //***********************

    //For AnchorPane wSlipper**
    @FXML
    private AnchorPane wSlipper;
    @FXML
    private JFXButton wsBack;
    @FXML
    private ImageView wSlipper1, wSlipper2, wSlipper3, wSlipper4, wSlipper5, wSlipper6;
    //***********************

    //For AnchorPane wClosedSlipper**
    @FXML
    private AnchorPane wClosedSlipper;
    @FXML
    private JFXButton wcsBack;
    @FXML
    private ImageView wClosedSlipper1, wClosedSlipper2, wClosedSlipper3, wClosedSlipper4, wClosedSlipper5, wClosedSlipper6;
    //***********************

    //For AnchorPane wBoots**
    @FXML
    private AnchorPane wBoots;
    @FXML
    private JFXButton wbBack, wbNext;
    @FXML
    private ImageView wBoot1, wBoot2, wBoot3, wBoot4, wBoot5, wBoot6;
    //***********************

    //For AnchorPane wBoots2**
    @FXML
    private AnchorPane wBoots2;
    @FXML
    private JFXButton wbBack2;
    @FXML
    private ImageView wBoot7, wBoot8, wBoot9, wBoot10, wBoot11, wBoot12;
    //***********************

    //For AnchorPane mBoots**
    @FXML
    private AnchorPane mBoots;
    @FXML
    private JFXButton mBBack;
    @FXML
    private ImageView mBoot1, mBoot2, mBoot3, mBoot4, mBoot5, mBoot6;
    //***********************

    //For AnchorPane mSlipper**
    @FXML
    private AnchorPane mSlipper;
    @FXML
    private JFXButton mSBack;
    @FXML
    private ImageView mSlipper1, mSlipper2, mSlipper3, mSlipper4;
    //***********************

    //For AnchorPane WomenMeasurements**
    @FXML
    private AnchorPane WomenMeasurements;
    @FXML
    private JFXButton wMeasermentSave, wMeasermentBack;
    @FXML
    private JFXRadioButton rW30, rW31, rW32, rW33, rW34, rW35, rW36, rW37, rW38, rW39, rW40, rW41, rW42, rW43;
    @FXML
    private JFXTextField WomenOrder, trW30, trW31, trW32, trW33, trW34, trW35, trW36, trW37, trW38, trW39, trW40, trW41, trW42, trW43;
    //***********************

    
    //For AnchorPane MenMeasurements**
    @FXML
    private AnchorPane MenMeasurements;
    @FXML
    private JFXButton mMeasermentSave, mMeasermentBack;
    @FXML
    private JFXRadioButton rM39, rM40, rM41, rM42, rM43, rM44, rM45, rM46, rM47, rM48;
    @FXML
    private JFXTextField MenOrder , trM39, trM40, trM41, trM42, trM43, trM44, trM45, trM46, trM47, trM48;
    //***********************

   

    @FXML
    private void btnForMen(ActionEvent event) {
        ForMen.setVisible(true);
        Main.setVisible(false);
    }

    @FXML
    private void btnForWomen(ActionEvent event) {
        ForWomen.setVisible(true);
        Main.setVisible(false);
    }

    @FXML
    private void btnWClosedSlipper(ActionEvent event) {
        wClosedSlipper.setVisible(true);
        ForWomen.setVisible(false);
    }

    @FXML
    private void btnWSlipper(ActionEvent event) {
        wSlipper.setVisible(true);
        ForWomen.setVisible(false);
    }

    @FXML
    private void btnWBoots(ActionEvent event) {
        wBoots.setVisible(true);
        ForWomen.setVisible(false);
    }

    @FXML
    private void wsBack(ActionEvent event) {
        ForWomen.setVisible(true);
        wSlipper.setVisible(false);
    }

    @FXML
    private void wcsBack(ActionEvent event) {
        ForWomen.setVisible(true);
        wClosedSlipper.setVisible(false);

    }

    @FXML
    private void wbBack(ActionEvent event) {
        ForWomen.setVisible(true);
        wBoots.setVisible(false);
    }

    @FXML
    private void btnWBack(ActionEvent event) {
        Main.setVisible(true);
        ForWomen.setVisible(false);
    }

    @FXML
    private void btnMBack(ActionEvent event) {
        Main.setVisible(true);
        ForMen.setVisible(false);
    }

    @FXML
    private void btnMSlipper(ActionEvent event) {
        mSlipper.setVisible(true);
        ForMen.setVisible(false);
    }

    @FXML
    private void btnMBoots(ActionEvent event) {
        mBoots.setVisible(true);
        ForMen.setVisible(false);
    }

    @FXML
    private void mBBack(ActionEvent event) {
        ForMen.setVisible(true);
        mBoots.setVisible(false);
    }

    @FXML
    private void mSBack(ActionEvent event) {
        ForMen.setVisible(true);
        mSlipper.setVisible(false);
    }

    @FXML
    private void wbNext(ActionEvent event) {
        wBoots.setVisible(false);
        wBoots2.setVisible(true);
    }

    @FXML
    private void wbBack2(ActionEvent event) {
        wBoots.setVisible(true);
        wBoots2.setVisible(false);
    }

    @FXML
    void WomenOrder(MouseEvent event) {
        if (event.getTarget()==wBoot1) {
            WomenMeasurements.setVisible(true);
            Model="Women Boot Model #1 !!";
        }
        if (event.getTarget()==wBoot2) {
            WomenMeasurements.setVisible(true);
            Model="Women Boot Model #2 !!";
        }
        if (event.getTarget()==wBoot3) {
            WomenMeasurements.setVisible(true);
            Model="Women Boot Model #3 !!";
        }
        if (event.getTarget()==wBoot4) {
            WomenMeasurements.setVisible(true);
            Model="Women Boot Model #4 !!";
        }
        if (event.getTarget()==wBoot5) {
            WomenMeasurements.setVisible(true);
            Model="Women Boot Model #5 !!";
        }
        if (event.getTarget()==wBoot6) {
            WomenMeasurements.setVisible(true);
            Model="Women Boot Model #6 !!";
        }
        if (event.getTarget()==wBoot7) {
            WomenMeasurements.setVisible(true);
            Model="Women Boot Model #7 !!";
        }
        if (event.getTarget()==wBoot8) {
            WomenMeasurements.setVisible(true);
            Model="Women Boot Model #8 !!";
        }
        if (event.getTarget()==wBoot9) {
            WomenMeasurements.setVisible(true);
            Model="Women Boot Model #9 !!";
        }
        if (event.getTarget()==wBoot10) {
            WomenMeasurements.setVisible(true);
            Model="Women Boot Model #10 !!";
        }
        if (event.getTarget()==wBoot11) {
            WomenMeasurements.setVisible(true);
            Model="Women Boot Model #11 !!";
        }
        if (event.getTarget()==wBoot12) {
            WomenMeasurements.setVisible(true);
            Model="Women Boot Model #12 !!";
        }
        if (event.getTarget()==wSlipper1) {
            WomenMeasurements.setVisible(true);
            Model="Women Slipper Model #1 !!";
        }
        if (event.getTarget()==wSlipper2) {
            WomenMeasurements.setVisible(true);
            Model="Women Slipper Model #2 !!";
        }
        if (event.getTarget()==wSlipper3) {
            WomenMeasurements.setVisible(true);
            Model="Women Slipper Model #3 !!";
        }
        if (event.getTarget()==wSlipper4) {
            WomenMeasurements.setVisible(true);
            Model="Women Slipper Model #4 !!";
        }
        if (event.getTarget()==wSlipper5) {
            WomenMeasurements.setVisible(true);
            Model="Women Slipper Model #5 !!";
        }
        if (event.getTarget()==wSlipper6) {
            WomenMeasurements.setVisible(true);
            Model="Women Slipper Model #6 !!";
        }
        if (event.getTarget()==wClosedSlipper1) {
            WomenMeasurements.setVisible(true);
            Model="Women Closed Slipper Model #1 !!";
        }
        if (event.getTarget()==wClosedSlipper2) {
            WomenMeasurements.setVisible(true);
            Model="Women Closed Slipper Model #2 !!";
        }
        if (event.getTarget()==wClosedSlipper3) {
            WomenMeasurements.setVisible(true);
            Model="Women Closed Slipper Model #3 !!";
        }
        if (event.getTarget()==wClosedSlipper4) {
            WomenMeasurements.setVisible(true);
            Model="Women Closed Slipper Model #4 !!";
        }
        if (event.getTarget()==wClosedSlipper5) {
            WomenMeasurements.setVisible(true);
            Model="Women Closed Slipper Model #5 !!";
        }
        if (event.getTarget()==wClosedSlipper6) {
            WomenMeasurements.setVisible(true);
            Model="Women Closed Slipper Model #6 !!";
        }
    }
//abcdef
    @FXML
    private void wMeasermentBack(ActionEvent event) {
        WomenMeasurements.setVisible(false);
        rW30.setSelected(false);
        rW31.setSelected(false);
        rW32.setSelected(false);
        rW33.setSelected(false);
        rW34.setSelected(false);
        rW35.setSelected(false);
        rW36.setSelected(false);
        rW37.setSelected(false);
        rW38.setSelected(false);
        rW39.setSelected(false);
        rW40.setSelected(false);
        rW41.setSelected(false);
        rW42.setSelected(false);
        rW43.setSelected(false);
        trW30.setText("");
        trW31.setText("");
        trW32.setText("");
        trW33.setText("");
        trW34.setText("");
        trW35.setText("");
        trW36.setText("");
        trW37.setText("");
        trW38.setText("");
        trW39.setText("");
        trW40.setText("");
        trW41.setText("");
        trW42.setText("");
        trW43.setText("");
        WomenOrder.setText("");
    }

    @FXML
    private void wMeasermentSave(ActionEvent event) throws IOException {
        File f1 = new File("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mahjoub Shose Factory\\src\\mahjoub\\" + WomenOrder.getText());
        boolean isExists = f1.exists();
        if (isExists == false) {
            f1.createNewFile();
        }
        FileWriter fr = new FileWriter(f1);
        PrintWriter pr = new PrintWriter(fr);
        pr.println(Model);
        if (rW30.isSelected() == true) {
            pr.println("30 :  " + trW30.getText());
        }
        if (rW31.isSelected() == true) {
            pr.println("31 :  " + trW31.getText());
        }
        if (rW32.isSelected() == true) {
            pr.println("32 :  " + trW32.getText());
        }
        if (rW33.isSelected() == true) {
            pr.println("33 :  " + trW33.getText());
        }
        if (rW34.isSelected() == true) {
            pr.println("34 :  " + trW34.getText());
        }
        if (rW35.isSelected() == true) {
            pr.println("35 :  " + trW35.getText());
        }
        if (rW36.isSelected() == true) {
            pr.println("36 :  " + trW36.getText());
        }
        if (rW37.isSelected() == true) {
            pr.println("37 :  " + trW37.getText());
        }
        if (rW38.isSelected() == true) {
            pr.println("38 :  " + trW38.getText());
        }
        if (rW39.isSelected() == true) {
            pr.println("39 :  " + trW39.getText());
        }
        if (rW40.isSelected() == true) {
            pr.println("40 :  " + trW40.getText());
        }
        if (rW41.isSelected() == true) {
            pr.println("41 :  " + trW41.getText());
        }
        if (rW42.isSelected() == true) {
            pr.println("42 :  " + trW42.getText());
        }
        if (rW43.isSelected() == true) {
            pr.println("43 :  " + trW43.getText());
        }
        pr.close();
        fr.close();
    }

    @FXML
    void MenOrder(MouseEvent event) {
        if (event.getTarget()==mBoot1) {
            MenMeasurements.setVisible(true);
            Model="Men Boot Model #1 !!";
        }
        if (event.getTarget()==mBoot2) {
            MenMeasurements.setVisible(true);
            Model="Men Boot Model #2 !!";
        }
        if (event.getTarget()==mBoot3) {
            MenMeasurements.setVisible(true);
            Model="Men Boot Model #3 !!";
        }
        if (event.getTarget()==mBoot4) {
            MenMeasurements.setVisible(true);
            Model="Men Boot Model #4 !!";
        }
        if (event.getTarget()==mBoot5) {
            MenMeasurements.setVisible(true);
            Model="Men Boot Model #5 !!";
        }
        if (event.getTarget()==mBoot6) {
            MenMeasurements.setVisible(true);
            Model="Men Boot Model #6 !!";
        }
        if (event.getTarget()==mSlipper1) {
            MenMeasurements.setVisible(true);
            Model="Men Slipper Model #1 !!";
        }
        if (event.getTarget()==mSlipper2) {
            MenMeasurements.setVisible(true);
            Model="Men Slipper Model #2 !!";
        }
        if (event.getTarget()==mSlipper3) {
            MenMeasurements.setVisible(true);
            Model="Men Slipper Model #3 !!";
        }
        if (event.getTarget()==mSlipper4) {
            MenMeasurements.setVisible(true);
            Model="Men Slipper Model #4 !!";
        }
    }
    
    @FXML
    private void mMeasermentBack(ActionEvent event) {
        MenMeasurements.setVisible(false);
        rM39.setSelected(false);
        rM40.setSelected(false);
        rM41.setSelected(false);
        rM42.setSelected(false);
        rM43.setSelected(false);
        rM44.setSelected(false);
        rM45.setSelected(false);
        rM46.setSelected(false);
        rM47.setSelected(false);
        rM48.setSelected(false);
        trM39.setText("");
        trM40.setText("");
        trM41.setText("");
        trM42.setText("");
        trM43.setText("");
        trM44.setText("");
        trM45.setText("");
        trM46.setText("");
        trM47.setText("");
        trM48.setText("");
        MenOrder.setText("");
    }
    
    @FXML
    private void mMeasermentSave(ActionEvent event) throws IOException {
        File f1 = new File("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mahjoub Shose Factory\\src\\mahjoub\\" + MenOrder.getText());
        boolean isExists = f1.exists();
        if (isExists == false) {
            f1.createNewFile();
        }
        FileWriter fr = new FileWriter(f1);
        PrintWriter pr = new PrintWriter(fr);
        pr.println(Model);
        if (rM39.isSelected() == true) {
            pr.println("39 :  " + trM39.getText());
        }
        if (rM40.isSelected() == true) {
            pr.println("40 :  " + trM40.getText());
        }
        if (rM41.isSelected() == true) {
            pr.println("41 :  " + trM41.getText());
        }
        if (rM42.isSelected() == true) {
            pr.println("42 :  " + trM42.getText());
        }
        if (rM43.isSelected() == true) {
            pr.println("43 :  " + trM43.getText());
        }
        if (rM44.isSelected() == true) {
            pr.println("44 :  " + trM44.getText());
        }
        if (rM45.isSelected() == true) {
            pr.println("45 :  " + trM45.getText());
        }
        if (rM46.isSelected() == true) {
            pr.println("46 :  " + trM46.getText());
        }
        if (rM47.isSelected() == true) {
            pr.println("47 :  " + trM47.getText());
        }
        if (rM48.isSelected() == true) {
            pr.println("48 :  " + trM48.getText());
        }
        pr.close();
        fr.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
