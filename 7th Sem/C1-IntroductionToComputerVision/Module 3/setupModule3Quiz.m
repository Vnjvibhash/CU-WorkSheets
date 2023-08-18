function setupModule3Quiz()
    try 
        which("venice_oli_2021310_lrg.jpg");
        loc = which("venice_oli_2021310_lrg.jpg");
        im = imread("venice_oli_2021310_lrg.jpg");
        im = im(1:1200, 1:1200, 1:3);
        im = imrotate(im, 20, "crop");
        im = im(150:800, 100:800, 1:3);
        im = imresize(im, 0.5);
        newfile = strcat(loc(1:end-15),"adj.jpg");
        imwrite(im, newfile);
    catch
        disp("Venice images could not be found. Please check that your path is set up correctly to include all course files.")
    end
end

% Copyright 2022 The MathWorks, Inc.