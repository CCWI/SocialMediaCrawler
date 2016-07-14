
package edu.hm.bing.json;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Result {

    @SerializedName("__metadata")
    @Expose
    private edu.hm.bing.json.Metadata Metadata;
    @Expose
    private String ID;
    @Expose
    private String WebTotal;
    @Expose
    private String WebOffset;
    @Expose
    private String ImageTotal;
    @Expose
    private String ImageOffset;
    @Expose
    private String VideoTotal;
    @Expose
    private String VideoOffset;
    @Expose
    private String NewsTotal;
    @Expose
    private String NewsOffset;
    @Expose
    private String SpellingSuggestionsTotal;
    @Expose
    private String AlteredQuery;
    @Expose
    private String AlterationOverrideQuery;
    @Expose
    private List<edu.hm.bing.json.Web> Web = new ArrayList<edu.hm.bing.json.Web>();
    @Expose
    private List<Object> Image = new ArrayList<Object>();
    @Expose
    private List<Object> Video = new ArrayList<Object>();
    @Expose
    private List<Object> News = new ArrayList<Object>();
    @Expose
    private List<Object> RelatedSearch = new ArrayList<Object>();
    @Expose
    private List<Object> SpellingSuggestions = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The Metadata
     */
    public edu.hm.bing.json.Metadata getMetadata() {
        return Metadata;
    }

    /**
     * 
     * @param Metadata
     *     The __metadata
     */
    public void setMetadata(edu.hm.bing.json.Metadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * 
     * @return
     *     The ID
     */
    public String getID() {
        return ID;
    }

    /**
     * 
     * @param ID
     *     The ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * 
     * @return
     *     The WebTotal
     */
    public String getWebTotal() {
        return WebTotal;
    }

    /**
     * 
     * @param WebTotal
     *     The WebTotal
     */
    public void setWebTotal(String WebTotal) {
        this.WebTotal = WebTotal;
    }

    /**
     * 
     * @return
     *     The WebOffset
     */
    public String getWebOffset() {
        return WebOffset;
    }

    /**
     * 
     * @param WebOffset
     *     The WebOffset
     */
    public void setWebOffset(String WebOffset) {
        this.WebOffset = WebOffset;
    }

    /**
     * 
     * @return
     *     The ImageTotal
     */
    public String getImageTotal() {
        return ImageTotal;
    }

    /**
     * 
     * @param ImageTotal
     *     The ImageTotal
     */
    public void setImageTotal(String ImageTotal) {
        this.ImageTotal = ImageTotal;
    }

    /**
     * 
     * @return
     *     The ImageOffset
     */
    public String getImageOffset() {
        return ImageOffset;
    }

    /**
     * 
     * @param ImageOffset
     *     The ImageOffset
     */
    public void setImageOffset(String ImageOffset) {
        this.ImageOffset = ImageOffset;
    }

    /**
     * 
     * @return
     *     The VideoTotal
     */
    public String getVideoTotal() {
        return VideoTotal;
    }

    /**
     * 
     * @param VideoTotal
     *     The VideoTotal
     */
    public void setVideoTotal(String VideoTotal) {
        this.VideoTotal = VideoTotal;
    }

    /**
     * 
     * @return
     *     The VideoOffset
     */
    public String getVideoOffset() {
        return VideoOffset;
    }

    /**
     * 
     * @param VideoOffset
     *     The VideoOffset
     */
    public void setVideoOffset(String VideoOffset) {
        this.VideoOffset = VideoOffset;
    }

    /**
     * 
     * @return
     *     The NewsTotal
     */
    public String getNewsTotal() {
        return NewsTotal;
    }

    /**
     * 
     * @param NewsTotal
     *     The NewsTotal
     */
    public void setNewsTotal(String NewsTotal) {
        this.NewsTotal = NewsTotal;
    }

    /**
     * 
     * @return
     *     The NewsOffset
     */
    public String getNewsOffset() {
        return NewsOffset;
    }

    /**
     * 
     * @param NewsOffset
     *     The NewsOffset
     */
    public void setNewsOffset(String NewsOffset) {
        this.NewsOffset = NewsOffset;
    }

    /**
     * 
     * @return
     *     The SpellingSuggestionsTotal
     */
    public String getSpellingSuggestionsTotal() {
        return SpellingSuggestionsTotal;
    }

    /**
     * 
     * @param SpellingSuggestionsTotal
     *     The SpellingSuggestionsTotal
     */
    public void setSpellingSuggestionsTotal(String SpellingSuggestionsTotal) {
        this.SpellingSuggestionsTotal = SpellingSuggestionsTotal;
    }

    /**
     * 
     * @return
     *     The AlteredQuery
     */
    public String getAlteredQuery() {
        return AlteredQuery;
    }

    /**
     * 
     * @param AlteredQuery
     *     The AlteredQuery
     */
    public void setAlteredQuery(String AlteredQuery) {
        this.AlteredQuery = AlteredQuery;
    }

    /**
     * 
     * @return
     *     The AlterationOverrideQuery
     */
    public String getAlterationOverrideQuery() {
        return AlterationOverrideQuery;
    }

    /**
     * 
     * @param AlterationOverrideQuery
     *     The AlterationOverrideQuery
     */
    public void setAlterationOverrideQuery(String AlterationOverrideQuery) {
        this.AlterationOverrideQuery = AlterationOverrideQuery;
    }

    /**
     * 
     * @return
     *     The Web
     */
    public List<edu.hm.bing.json.Web> getWeb() {
        return Web;
    }

    /**
     * 
     * @param Web
     *     The Web
     */
    public void setWeb(List<edu.hm.bing.json.Web> Web) {
        this.Web = Web;
    }

    /**
     * 
     * @return
     *     The Image
     */
    public List<Object> getImage() {
        return Image;
    }

    /**
     * 
     * @param Image
     *     The Image
     */
    public void setImage(List<Object> Image) {
        this.Image = Image;
    }

    /**
     * 
     * @return
     *     The Video
     */
    public List<Object> getVideo() {
        return Video;
    }

    /**
     * 
     * @param Video
     *     The Video
     */
    public void setVideo(List<Object> Video) {
        this.Video = Video;
    }

    /**
     * 
     * @return
     *     The News
     */
    public List<Object> getNews() {
        return News;
    }

    /**
     * 
     * @param News
     *     The News
     */
    public void setNews(List<Object> News) {
        this.News = News;
    }

    /**
     * 
     * @return
     *     The RelatedSearch
     */
    public List<Object> getRelatedSearch() {
        return RelatedSearch;
    }

    /**
     * 
     * @param RelatedSearch
     *     The RelatedSearch
     */
    public void setRelatedSearch(List<Object> RelatedSearch) {
        this.RelatedSearch = RelatedSearch;
    }

    /**
     * 
     * @return
     *     The SpellingSuggestions
     */
    public List<Object> getSpellingSuggestions() {
        return SpellingSuggestions;
    }

    /**
     * 
     * @param SpellingSuggestions
     *     The SpellingSuggestions
     */
    public void setSpellingSuggestions(List<Object> SpellingSuggestions) {
        this.SpellingSuggestions = SpellingSuggestions;
    }

}
