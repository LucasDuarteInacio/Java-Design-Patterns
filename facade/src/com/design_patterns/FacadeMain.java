package com.design_patterns;


import com.design_patterns.facade.VideoConversionFacade;

import java.io.File;

public class FacadeMain {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}