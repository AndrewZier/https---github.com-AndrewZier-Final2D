package ip;

import java.awt.Color;

import helps.MutableFloat;
import helps.MutableInt;

//Many examples are guarded by if(false) statements
//This suppressed warning means that we are doing this on purpose
@SuppressWarnings("unused")

/**
 * The entry point for our program
 */
public class Main {

  public static void main(String[] args) {
    // If there are any arguments, that means we are going to be running our test
    // suite
    if (args.length > 0) {
      Test.handleArguments(args);
      return;
    }

    // If we get here, we are not doing a test run, but instead are doing things
    // manually.----------------------------------------

    // Numbers that we will pass into methods that we need updated
    MutableFloat mf = new MutableFloat(0);
    MutableInt colorCount = new MutableInt(0);
    MutableInt width = new MutableInt(-1);
    MutableInt height = new MutableInt(-1);

    // Actual image
    // processing-----------------------------------------------------------------------------------------------------
/*
    if(true){//Kernels
      float[][] identityKernel = new float[3][3];
      identityKernel[0] = new float[]{0,0,0};
      identityKernel[1] = new float[]{0,1,0};
      identityKernel[2] = new float[]{0,0,0};
      Kernel kernel = new Kernel(identityKernel);

      new ICon("./images/wolf.jpg")
      
      .exec(i->i.applyKernel(kernel))
      .save("./Wolf/wolfKernel.png");


      //Trival Box Blur
      float[][] boxKernelFloats = new float[3][3];
      boxKernelFloats[0] = new float[]{1,1,1};
      boxKernelFloats[1] = new float[]{1,1,1};
      boxKernelFloats[2] = new float[]{1,1,1};
      Kernel boxKernel = new Kernel(boxKernelFloats).normalize();

      new ICon("./images/wolf.jpg")
      
      .exec(i->i.applyKernel(boxKernel))
      .save("./Wolf/wolf_box_kernel.png");

      // Motion Blur
      float[][] motionKernelFloats = new float[9][9];
      motionKernelFloats[0] = new float[]{1,0,0,0,0,0,0,0,0};
      motionKernelFloats[1] = new float[]{0,1,0,0,0,0,0,0,0};
      motionKernelFloats[2] = new float[]{0,0,1,0,0,0,0,0,0};
      motionKernelFloats[3] = new float[]{0,0,0,1,0,0,0,0,0};
      motionKernelFloats[4] = new float[]{0,0,0,0,1,0,0,0,0};
      motionKernelFloats[5] = new float[]{0,0,0,0,0,1,0,0,0};
      motionKernelFloats[6] = new float[]{0,0,0,0,0,0,1,0,0};
      motionKernelFloats[7] = new float[]{0,0,0,0,0,0,0,1,0};
      motionKernelFloats[8] = new float[]{0,0,0,0,0,0,0,0,1};
      Kernel motionKernel = new Kernel(motionKernelFloats).normalize();

      new ICon("./images/Husker.jpg")
      
      .exec(i->i.applyKernel(motionKernel))
      .save("./Husker/Husker_motionBlur_kernel.png");

      // Excessive Edge Sharpen
      float[][] EdgeSharpenKernelFloats = new float[5][5];
      EdgeSharpenKernelFloats[0] = new float[]{1,1,1};
      EdgeSharpenKernelFloats[1] = new float[]{1,-7,1};
      EdgeSharpenKernelFloats[2] = new float[]{1,1,1};
      
      Kernel EdgeSharpenKernel = new Kernel(EdgeSharpenKernelFloats).normalize();
      new ICon("./images/Husker.jpg")
     
     
      .exec(i->i.applyKernel(EdgeSharpenKernel))
      .save("./Husker/Husker_EdgeSharpen_kernel.png");
*/
      // Emboss
      float[][] EmbossKernelFloats = new float[3][3];
      EmbossKernelFloats[0] = new float[]{-1,0,1};
      EmbossKernelFloats[1] = new float[]{-2,0,2};
      EmbossKernelFloats[2] = new float[]{-1,0,1};
      
      Kernel EmbossKernel = new Kernel(EmbossKernelFloats).normalize();

      new ICon("./images/wolf.jpg")
      
      .exec(i->i.applyKernel(EmbossKernel))
      .save("./Wolf/wolf_Emboss_kernel.png");
/*
      //Larger Box Blur
      new ICon("./images/wolf.jpg")
      
      .exec(i->i.applyKernel(boxKernel))
      .save("./Wolf/wolfkernel1.png");

      // Edge Detection
      float[][] edgeKernelVFloats = new float[3][1];
      edgeKernelVFloats[0] = new float[]{1};
      edgeKernelVFloats[1] = new float[]{0};
      edgeKernelVFloats[2] = new float[]{-1};
      Kernel edgeKernelV = new Kernel(edgeKernelVFloats);
      new ICon("./images/Husker.jpg")
      
      .exec(i->i.applyKernel(edgeKernelV))
      .save("./Husker/Husker_edge_kernelV.png");

      //Edge Detection the other way
      float[][] edgeKernelHFloats = new float[1][3];
      edgeKernelHFloats[0] = new float[]{1,0,-1};
      Kernel edgeKernelH = new Kernel(edgeKernelHFloats);
      new ICon("./images/Husker.jpg")
      
      .exec(i->i.applyKernel(edgeKernelH))
      .save("./Husker/Husker_edge_kernelH.png");

      //Sharpening
      float tune = 2f;
      float[][] sharpenKernelFloats = new float[3][3];
      sharpenKernelFloats[0] = new float[]{0,-1f/5f*tune,0};
      sharpenKernelFloats[1] = new float[]{-1f/5f*tune,1+tune-1f/5f*tune,-1f/5f*tune};
      sharpenKernelFloats[2] = new float[]{0,-1f/5f*tune,0};
      Kernel shapenKernel = new Kernel(sharpenKernelFloats);

      new ICon("./images/Husker.jpg")
      
      .exec(i->i.applyKernel(shapenKernel))
      .save("./Husker/Husker_sharpen_kernel.png");

      /*new ICon("./images/wolf.jpg")
      .exec(i->i.toGrayscale())
      .save("./newOut/_wolf_bw.png");*/

    }
*/

   /*  // Get the number of colors in the image
    new ICon("./images/wolf.jpg")
        .exec(l -> {
          colorCount.setValue(l.getColorCount());
          return null;
        });
    System.out.println();
    System.out.println("The given image has " + colorCount.getValue() + " distinct colors.");

    // Get the most common colors
    var f = new ICon("./images/wolf.jpg")
        .flatten().getColorsOrderedByFrequency(10);

    System.out.println();
    System.out.println("The following are the most common colors in the given image:");
    for (int i = 0; i < f.length && i < 10; i++) {
      Color c = f[i];
      System.out.println(c);
    }*/

    // Mix of all different things
    new ICon("./images/wolf.jpg")
        .exec(l -> {
          l.updateToPallette(l.getColorsOrderedByFrequency(100));
          l.updateToPallette(helps.MyMath.getRandomColors(100));
          l.updateToPallette(l.kMeansColors(255));
          return null;
        })
        .save("./out/mix0.png");

    // Use a reduced color palette
    new ICon("./images/wolf.jpg")
        .exec(l -> {
          l.updateToPallette(l.getColorsOrderedByFrequency(100));
          return null;
        })
        .save("./out/palette.png");

    // Use a random color palette
    new ICon("./images/moon.jpg")
        .exec(l -> {
          l.updateToPallette(helps.MyMath.getRandomColors(100));
          return null;
        })
        .save("./out/palette-random.png");

    // Use a reduced color palette based on k-means
    new ICon("./images/wolf.jpg")
        .exec(l -> {
          l.updateToPallette(l.kMeansColors(128));
          return null;
        })
        .save("./out/k_means.png");

    new ICon("./images/wolf.jpg")
        .exec(l -> {
          l.updateToPallette(new Color[]{Color.BLACK, Color.WHITE});
          return null;
        })
        .save("./out/no-dithering.png");

    new ICon("./images/wolf.jpg")
      .exec(l -> {
        l.updateToPallette(new Color[]{Color.BLACK, Color.WHITE});
         return null;
          })
        .save("./out/dithering.png");

    // Examples of useage. To save time, these are guarded by if statements.
    // ----------------------------------------------------------
    // Change the if statements to if(true) to run them.

    // Look at the error image generated by bit slicing.
    // Uncomment the save statements to save the error image.

    if (false) {
      new ICon("./images/wolf.jpg")
          .exec(i -> i.toGrayscale())
          .exec(i -> i.bitSlice(0b10000000))
          .addLayer("./images/wolf.jpg")
          .exec(i -> i.toGrayscale())
          .setLayerBlendmode(BlendMode.SubtractAbs)
          .flatten()
          .exec(l -> {
            mf.setValue(l.averagePixelError());
            return null;
          });
      // .save("./out/mf.png");

      System.out.println(Integer.toBinaryString(0b10000000));
      System.out.println(mf.value);

      // .save("./out/difference_image.png");

    }

    // Generate bit-sliced image at each distinct bit
    /*if (true) {
      for (int inc = 0; inc < 8; inc++) {
        int a = inc;
        new ICon("./images/sky.jpg")
            //.exec(i -> i.toGrayscale())
            .exec(i -> i.updateToPallette(helps.MyMath.getRandomColors(132)))
            .exec(i -> i.bitSlice((int) Math.pow(2, a)))
            .save("./Sky/bitSlicing" + a + ".png");
      }
    }*/

    // Get the error values for cummulative bit slices
    if (false) {
      for (int inc = 0; inc < 8; inc++) {
        int a = 0b11111111;
        a >>= inc;
        a <<= inc;
        int b = a;
        int c = inc;
        new ICon("./images/wolf.jpg")
            .exec(i -> i.toGrayscale())
            .exec(i -> i.bitSlice(b))
            .addLayer("./images/wolf.jpg")
            .exec(i -> i.toGrayscale())
            .setLayerBlendmode(BlendMode.SubtractAbs)
            .save("./out/bitSlicing_error_" + c + ".png")
            .flatten()
            .exec(i -> {
              mf.setValue(i.averagePixelError());
              return null;
            });

        System.out.println();
        System.out.println(b);
        System.out.println(c);
        String binaryString = Integer.toBinaryString(b);
        System.out.println(binaryString);
        System.out.println(mf);
      }

    }

    if (false) {
      for (int inc = 0; inc < 8; inc++) {
        int a = 0b11111111;
        a >>= inc;
        a <<= inc;
        int b = a;
        int c = inc;
        new ICon("./images/wolf.jpg")
            // .exec(i -> i.toGrayscale())
            .exec(i -> i.bitSlice(b))
            .save("./out/bitSlicing_" + c + ".png");

      }

    }

    // Get the cummulative bit sliced images
    if (false) {
      for (int inc = 0; inc < 8; inc++) {
        int a = (int) (Math.pow(2, inc) - 1);
        int b = a;
        int c = inc;
        new ICon("./images/wolf.jpg")
            // .exec(i -> i.toGrayscale())
            .exec(i -> i.bitSlice(b))
            .save("./out/bitSlicing__" + c + ".png");
      }

    }

    // Examples of using blend modes
    if (false) {
      new ICon("./images/moon.jpg")
          .addLayer("./images/moon.jpg")
          .setLayerAlpha(1f)
          .setLayerBlendmode(BlendMode.Divide)
          // .setAsWidth(width)
          // .setAsHeight(height)
          // .addToCanvasSize(0, 100)
          // .generateLayer(l -> l.exec(i -> i.toHistogram()))
          // .moveLayer(0, height.get())
          // .exec(ip -> ip.scaleLinear(width.get() / 255.0f, 1))
          // .setBackgroundColor(Color.MAGENTA)
          .save("./out/done.png");

    }

    // Generate images with their respective histograms appended.
    if (false)// True to generate histogram images
    {
      for (String filename : new String[] { "_test1", "_test2", "_test3", "_test4", "_test5" }) {
        new ICon("./images/" + filename + ".jpg")
            .setAsWidth(width)
            .setAsHeight(height)
            .addToCanvasSize(0, 100)
            .generateLayer(l -> l.exec(i -> i.toHistogram()))
            .moveLayer(0, height.getValue())
            .exec(ip -> ip.scaleLinear(width.getValue() / 255.0f, 1))
            .setBackgroundColor(Color.MAGENTA)
            .save("./out/" + filename + "histogram.png");
      }
    }

  }

}
