from pytube import YouTube

# Function to download YouTube video thumbnail
def download_thumbnail(video_url, output_path):
    try:
        yt = YouTube(video_url)
        thumbnail_url = yt.thumbnail_url

        # Download the thumbnail image
        yt.thumbnail_url(output_path=output_path)

        print(f"Thumbnail downloaded to {output_path}")
    except Exception as e:
        print(f"Error: {e}")

# Example usage:
video_url = 'https://www.youtube.com/watch?v=YOUR_VIDEO_ID_HERE'
output_path = 'thumbnail.jpg'  # Provide the desired output file name

download_thumbnail(video_url, output_path)
