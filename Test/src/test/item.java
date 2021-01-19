/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Ryzen5
 */
public class item {
    private String nombre;
    private BufferedImage image;
    

    public item(String nombre) throws IOException {
        this.nombre = nombre;
        this.image = ImageIO.read(new File(nombre + ".jpg"));
    }

    public String getName () {
        return nombre;
    }

    public BufferedImage getImage () {
        return image;
    }

    
    
}
