package com.erivalaxl;

import org.bytedeco.javacv.*;
import org.bytedeco.opencv.global.opencv_imgcodecs;
import org.bytedeco.opencv.opencv_core.IplImage;

import java.awt.event.WindowEvent;


public class takepic {
    public static void main(String[] args) throws FrameGrabber.Exception, InterruptedException {
        FrameGrabber grabber = new OpenCVFrameGrabber(0);
        grabber.start();
        Frame frame = grabber.grab();

        OpenCVFrameConverter.ToIplImage converter = new OpenCVFrameConverter.ToIplImage();
        IplImage img = converter.convert(frame);
        opencv_imgcodecs.cvSaveImage("Sefie.jpg", img);

        CanvasFrame canvas = new CanvasFrame("WebCam");
        canvas.showImage(frame);

        Thread.sleep(20000);

        canvas.dispatchEvent(new WindowEvent(canvas, WindowEvent.WINDOW_CLOSING));
    }
}
