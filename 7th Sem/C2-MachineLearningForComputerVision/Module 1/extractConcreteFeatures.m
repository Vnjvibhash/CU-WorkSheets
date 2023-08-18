function concreteTable = extractConcreteFeatures(ds)

intensityAvg = [];
intensitySTD = [];
imgName = [];

while hasdata(ds)

    [img,info] = read(ds);
    
    img = im2double(img);
    img = im2gray(img);
    
    intensityAvg = [intensityAvg; mean(img(:))];
    intensitySTD = [intensitySTD; std(img(:))];
    
    [~,name,ext] = fileparts(info.Filename);
    imgName = [imgName; string(name) + string(ext)];

end

label = categorical(ds.Labels);
concreteTable = table(label,imgName,intensityAvg,intensitySTD);
end

% Copyright 2022 The MathWorks, Inc.