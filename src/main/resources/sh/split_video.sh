#!/usr/bin
#use script: sudo bash ./split_video.sh $fileName $splitSize
FILE=$1
SPLIT_SIZE=$2
echo "file: $FILE"
echo "split size: $SPLIT_SIZE"

FILE_NAME=$(echo "$FILE" | cut -d . -f1)
echo "fileName: $FILE_NAME"

ffmpeg -i "$FILE" "$FILE_NAME".mp4
echo "convert $FILE to $FILE_NAME.mp4"

MP4Box -split-size "$SPLIT_SIZE" "$FILE_NAME".mp4

myArray=$(find ./ -name "$FILE_NAME*.mp4")

for i in ${myArray[@]} ;
do
    echo "$i"
    NEW_FILE_NAME=$(echo "$i" | cut -d . -f2 | cut -d / -f2 | cut -d . -f1)
    CONVERT=$NEW_FILE_NAME'.ts'
    echo "new file name: $CONVERT"
    ffmpeg -i "$i" "$CONVERT"
done