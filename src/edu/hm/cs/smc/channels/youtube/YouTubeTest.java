package edu.hm.cs.smc.channels.youtube;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import edu.hm.cs.smc.channels.generic.models.Request;
import edu.hm.cs.smc.channels.youtube.models.YouTubeChannel;
import edu.hm.cs.smc.channels.youtube.models.YouTubeComment;
import edu.hm.cs.smc.channels.youtube.models.YouTubeCommentThread;
import edu.hm.cs.smc.channels.youtube.models.YouTubeCommentThreads;
import edu.hm.cs.smc.channels.youtube.models.YouTubeComments;
import edu.hm.cs.smc.channels.youtube.models.YouTubePlaylist;
import edu.hm.cs.smc.channels.youtube.models.YouTubePlaylistItem;
import edu.hm.cs.smc.channels.youtube.models.YouTubePlaylistItems;
import edu.hm.cs.smc.channels.youtube.models.YouTubeVideo;

public class YouTubeTest {
	public static void test() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("/home/u1/smc.properties"));

			YouTube youTube = new YouTube(properties);

			String channelName = "Porsche";
			String channelId = youTube.getChannelId(channelName);
			YouTubeChannel channel = (YouTubeChannel) youTube.getChannel(channelId).getResponse();

			System.out.println("Channel:\n");
			System.out.println("  Name: " + channelName);
			System.out.println("  Id: " + channelId);
			System.out.println();

			String uploadPlaylistId = channel.getContentDetails().getRelatedPlaylists().getUploads();
			YouTubePlaylist playlist = (YouTubePlaylist) youTube.getPlaylist(uploadPlaylistId).getResponse();

			System.out.println("Playlist:\n");
			System.out.println("  Name: " + playlist.getSnippet().getTitle());
			System.out.println("  Id: " + uploadPlaylistId);
			System.out.println();

			YouTubePlaylistItems playlistItems = (YouTubePlaylistItems) youTube.getPlaylistItems(uploadPlaylistId, null)
					.getResponse();
			YouTubePlaylistItem playlistItem = playlistItems.getItems().get(0);
			String videoId = playlistItem.getSnippet().getResourceId().getVideoId();
			YouTubeVideo video = (YouTubeVideo) youTube.getVideo(videoId).getResponse();

			System.out.println("Video:\n");
			System.out.println("  Name: " + video.getSnippet().getTitle());
			System.out.println("  Id: " + videoId);
			System.out
					.println("  Published at: " + YouTubeUtil.dateToISO8601String(video.getSnippet().getPublishedAt()));
			System.out.println("  Views: " + video.getStatistics().getViewCount());
			System.out.println("  Likes: " + video.getStatistics().getLikeCount());
			System.out.println("  Dislikes: " + video.getStatistics().getDislikeCount());
			System.out.println("  # Comments: " + video.getStatistics().getCommentCount());
			System.out.println();

			System.out.println("Comments:\n");

			int commentNum = 1;
			for (Request cTRequest : youTube.getAllResults(youTube.getCommentThreadsOfVideo(videoId, false, null))) {
				List<YouTubeCommentThread> commentThreads = ((YouTubeCommentThreads) cTRequest.getResponse())
						.getItems();
				for (YouTubeCommentThread commentThread : commentThreads) {
					YouTubeComment topLevelComment = commentThread.getSnippet().getTopLevelComment();

					System.out.println("  --------------------------");
					System.out.println("   " + commentNum + ". " + topLevelComment.getSnippet().getAuthorDisplayName());
					System.out.println("  --------------------------");
					System.out.println("   " + topLevelComment.getSnippet().getTextDisplay());
					System.out.println("  --------------------------");
					System.out.println("   Likes: " + topLevelComment.getSnippet().getLikeCount());
					System.out.println();
					commentNum++;

					for (Request cRequest : youTube.getAllResults(youTube.getComments(topLevelComment.getId(), null))) {
						List<YouTubeComment> replies = ((YouTubeComments) cRequest.getResponse()).getItems();
						for (YouTubeComment reply : replies) {
							System.out.println("\t--------------------------");
							System.out.println("\t " + reply.getSnippet().getAuthorDisplayName());
							System.out.println("\t--------------------------");
							System.out.println("\t " + reply.getSnippet().getTextDisplay());
							System.out.println("\t--------------------------");
							System.out.println("\t Likes: " + reply.getSnippet().getLikeCount());
							System.out.println();
						}
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
