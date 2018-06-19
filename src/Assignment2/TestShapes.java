package Assignment2;

import java.io.*;

public class TestShapes {
    public static void main(String[] args) {
        FileReader fr;
        BufferedReader br;
        try{
            File file=new File("SquarePyramid.txt");
            System.out.println(file.getAbsolutePath());
            System.out.println("<INPUT>");
            PrintWriter pw=new PrintWriter(file);

            pw.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "x1","y1","x2","y2","side","nh","sh","area","volume");

            for(int i=0; i<3; i++){
                SquarePyramid sPyramid=new SquarePyramid();
                pw.printf("%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.2f\t%.2f\t\n",
                        sPyramid.getVertex()[0].getX(),sPyramid.getVertex()[0].getY(),
                        sPyramid.getVertex()[1].getX(),sPyramid.getVertex()[1].getY(),
                        sPyramid.getLateralArea(), sPyramid.getnHeight(), sPyramid.getsHeight(),
                        sPyramid.getArea(), sPyramid.getVolume());
                //System.out.println(sPyramid.toString());
            }
            pw.close();

            System.out.println("\n\n<OUTPUT>");
            fr=new FileReader(file);
            br=new BufferedReader(fr);
            String line=null;
            line=br.readLine(); // exclude index
            while((line=br.readLine())!=null){
                String[] str;
                str=line.split("\t");
                System.out.printf("Properties of Square Pyramid \n" +
                        "\t coordinates of upper left vertex of the square as the base of the pyramid : %.1f, %.1f\n" +
                        "\t coordinates of lower right vertex of the square as the base of the pyramid : %.1f, %.1f\n" +
                        "\t side of a square as the base of the pyramid: %.1f\n" +
                        "\t normal height of the pyramid : %.1f\n" +
                        "\t slant Height of the pyramid : %.1f\n" +
                        "\t Surface Area of the pyramid : %.2f\n" +
                        "\t volume of the pyramid : %.2f\n\n",
                        Double.parseDouble(str[0]), Double.parseDouble(str[1]), Double.parseDouble(str[2]),
                        Double.parseDouble(str[3]), Double.parseDouble(str[4]), Double.parseDouble(str[5]),
                        Double.parseDouble(str[6]), Double.parseDouble(str[7]), Double.parseDouble(str[8]));
            }
            br.close();
            fr.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
