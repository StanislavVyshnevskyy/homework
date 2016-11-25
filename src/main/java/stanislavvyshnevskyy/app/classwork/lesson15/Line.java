package stanislavvyshnevskyy.app.classwork.lesson15;

/**
 * Created by Коти on 19.11.2016.
 */
public class Line {
    private Pixel[] pixels;

    public Line(){
        pixels = new Pixel[2];
    }

    public Line(Pixel first, Pixel second ){
        pixels = new Pixel[2];
        pixels[0] = first;
        pixels[1] = second;
    }

    public void add(Pixel pixel){
        Pixel[] newPixels = new Pixel[pixels.length+1];
        System.arraycopy(pixels, 0, newPixels, 0, pixels.length );
        newPixels[pixels.length] = pixel;
        pixels = newPixels;
    }
}
