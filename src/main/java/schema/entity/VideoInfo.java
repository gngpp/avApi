package schema.entity;


/**
 * (VideoInfo)表实体类
 *
 * @author makejava
 * @since 2020-03-14 02:10:50
 */
@SuppressWarnings("serial")
public class VideoInfo {
    public Integer getId() {
        return id;
    }

    public VideoInfo setId(Integer id) {
        this.id = id;
        return this;
    }

    private Integer id;

    private Integer vid;
    
    private Integer uid;
    
    private String title;
    
    private String keyword;
    
    private String channel;
    
    private Object duration;
    
    private Object framerate;
    
    private Boolean hd;
    
    private Object addtime;
    
    private Integer viewnumber;
    
    private Integer likes;
    
    private Integer dislikes;
    
    private String videoUrl;
    
    private String embeddedUrl;
    
    private String priviewUrl;
    
    private String previewVideoUrl;
    
    private Boolean privatee;

    public Integer getVid() {
        return vid;
    }

    public VideoInfo setVid(Integer vid) {
        this.vid = vid;
        return this;
    }

    public Integer getUid() {
        return uid;
    }

    public VideoInfo setUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public VideoInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public VideoInfo setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public VideoInfo setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public Object getDuration() {
        return duration;
    }

    public VideoInfo setDuration(Object duration) {
        this.duration = duration;
        return this;
    }

    public Object getFramerate() {
        return framerate;
    }

    public VideoInfo setFramerate(Object framerate) {
        this.framerate = framerate;
        return this;
    }

    public Boolean getHd() {
        return hd;
    }

    public VideoInfo setHd(Boolean hd) {
        this.hd = hd;
        return this;
    }

    public Object getAddtime() {
        return addtime;
    }

    public VideoInfo setAddtime(Object addtime) {
        this.addtime = addtime;
        return this;
    }

    public Integer getViewnumber() {
        return viewnumber;
    }

    public VideoInfo setViewnumber(Integer viewnumber) {
        this.viewnumber = viewnumber;
        return this;
    }

    public Integer getLikes() {
        return likes;
    }

    public VideoInfo setLikes(Integer likes) {
        this.likes = likes;
        return this;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public VideoInfo setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public VideoInfo setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public String getEmbeddedUrl() {
        return embeddedUrl;
    }

    public VideoInfo setEmbeddedUrl(String embeddedUrl) {
        this.embeddedUrl = embeddedUrl;
        return this;
    }

    public String getPriviewUrl() {
        return priviewUrl;
    }

    public VideoInfo setPriviewUrl(String priviewUrl) {
        this.priviewUrl = priviewUrl;
        return this;
    }

    public String getPreviewVideoUrl() {
        return previewVideoUrl;
    }

    public VideoInfo setPreviewVideoUrl(String previewVideoUrl) {
        this.previewVideoUrl = previewVideoUrl;
        return this;
    }

    public Boolean getPrivatee() {
        return privatee;
    }

    public VideoInfo setPrivatee(Boolean privatee) {
        this.privatee = privatee;
        return this;
    }


/**
     * 获取主键值
     *
     * @return 主键值
     */

    }