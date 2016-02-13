package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by seyfer on 2/13/16.
 */
public class ImageReaderFactory {

    public static ImageReader getReader(ImageTypes imageTypes) {

        //NullPointerException if imageTypes = null
//        switch (imageType) {
//            case JPG:
//                return new JpgReader();
//            case BMP:
//                return new BmpReader();
//            case PNG:
//                return new PngReader();
//            default:
//                throw new IllegalArgumentException("Неизвестный тип картинки");
//        }

        ImageReader reader;

        if (imageTypes == ImageTypes.JPG) {
            reader = new JpgReader();
        } else if (imageTypes == ImageTypes.BMP) {
            reader = new BmpReader();
        } else if (imageTypes == ImageTypes.PNG) {
            reader = new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        return reader;
    }
}
