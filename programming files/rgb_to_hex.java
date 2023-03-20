public class rgb_to_hex {
    public static void main(String[] args) {
        //Initialize rgb Color:
        int r = 255;
        int g = 127;
        int b = 0;
        
        //Convert rgb to hex
        String hexColor = rgbToHex(r, g, b);
        
        //Print color
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    public static String rgbToHex(int r, int g, int b) {
        //Alter each value to hex
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        
        //concatenate into hex value
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


