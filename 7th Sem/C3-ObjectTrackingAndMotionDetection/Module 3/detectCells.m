function detections = detectCells(frame) 

    mask = segmentCells(frame); 
    % Filter based on region size
    filteredMask = bwpropfilt(mask,"Area",[50,400]); 
    % Get the centroid and bounding box of remaining regions
    props = regionprops("table",filteredMask,["Centroid","BoundingBox"]); 
    centroids = props.Centroid; 
    bboxes = props.BoundingBox; 
    detections = table(centroids,bboxes);
end

function BW = segmentCells(I)
% First part of segmentCells code was copied from the Color Thresholder app

    % Define thresholds for channel 1 
    channel1Min = 0.000;
    channel1Max = 255.000;
    
    % Define thresholds for channel 2 
    channel2Min = 175.000;
    channel2Max = 255.000;
    
    % Define thresholds for channel 3 
    channel3Min = 0.000;
    channel3Max = 255.000;
    
    % Create mask 
    BW = (I(:,:,1) >= channel1Min ) & (I(:,:,1) <= channel1Max) & ...
        (I(:,:,2) >= channel2Min ) & (I(:,:,2) <= channel2Max) & ...
        (I(:,:,3) >= channel3Min ) & (I(:,:,3) <= channel3Max);
    
    % Refine mask returned from the Color Thresholder app
    BW = imfill(BW,'holes');
    
    radius = 4;
    se = strel('disk',radius,0);
    BW = imerode(BW,se);

end
% Copyright 2022 The MathWorks, Inc.