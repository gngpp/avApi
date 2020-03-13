package schema;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "video_info", schema = "av_video")
public class VideoInfo {
    private int vid;
    private Integer uid;
    private String title;
    private String keyword;
    private String channel;
    private Double duration;
    private Double framerate;
    private Byte hd;
    private Date addtime;
    private Integer viewnumber;
    private Integer likes;
    private Integer dislikes;
    private String videoUrl;
    private String embeddedUrl;
    private String priviewUrl;
    private String previewVideoUrl;
    private Byte privatee;

    @Id
    @Column(name = "vid", nullable = false)
    public int getVid() {
        return vid;
    }

    public VideoInfo setVid(int vid) {
        this.vid = vid;
        return this;
    }

    @Basic
    @Column(name = "uid", nullable = true)
    public Integer getUid() {
        return uid;
    }

    public VideoInfo setUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 255)
    public String getTitle() {
        return title;
    }

    public VideoInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    @Basic
    @Column(name = "keyword", nullable = true, length = 255)
    public String getKeyword() {
        return keyword;
    }

    public VideoInfo setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    @Basic
    @Column(name = "channel", nullable = true, length = 255)
    public String getChannel() {
        return channel;
    }

    public VideoInfo setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    @Basic
    @Column(name = "duration", nullable = true, precision = 0)
    public Double getDuration() {
        return duration;
    }

    public VideoInfo setDuration(Double duration) {
        this.duration = duration;
        return this;
    }

    @Basic
    @Column(name = "framerate", nullable = true, precision = 0)
    public Double getFramerate() {
        return framerate;
    }

    public VideoInfo setFramerate(Double framerate) {
        this.framerate = framerate;
        return this;
    }

    @Basic
    @Column(name = "hd", nullable = true)
    public Byte getHd() {
        return hd;
    }

    public VideoInfo setHd(Byte hd) {
        this.hd = hd;
        return this;
    }

    @Basic
    @Column(name = "addtime", nullable = true)
    public Date getAddtime() {
        return addtime;
    }

    public VideoInfo setAddtime(Date addtime) {
        this.addtime = addtime;
        return this;
    }

    @Basic
    @Column(name = "viewnumber", nullable = true)
    public Integer getViewnumber() {
        return viewnumber;
    }

    public VideoInfo setViewnumber(Integer viewnumber) {
        this.viewnumber = viewnumber;
        return this;
    }

    @Basic
    @Column(name = "likes", nullable = true)
    public Integer getLikes() {
        return likes;
    }

    public VideoInfo setLikes(Integer likes) {
        this.likes = likes;
        return this;
    }

    @Basic
    @Column(name = "dislikes", nullable = true)
    public Integer getDislikes() {
        return dislikes;
    }

    public VideoInfo setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
        return this;
    }

    @Basic
    @Column(name = "video_url", nullable = true, length = 255)
    public String getVideoUrl() {
        return videoUrl;
    }

    public VideoInfo setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    @Basic
    @Column(name = "embedded_url", nullable = true, length = 255)
    public String getEmbeddedUrl() {
        return embeddedUrl;
    }

    public VideoInfo setEmbeddedUrl(String embeddedUrl) {
        this.embeddedUrl = embeddedUrl;
        return this;
    }

    @Basic
    @Column(name = "priview_url", nullable = true, length = 255)
    public String getPriviewUrl() {
        return priviewUrl;
    }

    public VideoInfo setPriviewUrl(String priviewUrl) {
        this.priviewUrl = priviewUrl;
        return this;
    }

    @Basic
    @Column(name = "preview_video_url", nullable = true, length = 255)
    public String getPreviewVideoUrl() {
        return previewVideoUrl;
    }

    public VideoInfo setPreviewVideoUrl(String previewVideoUrl) {
        this.previewVideoUrl = previewVideoUrl;
        return this;
    }

    @Basic
    @Column(name = "privatee", nullable = true)
    public Byte getPrivatee() {
        return privatee;
    }

    public VideoInfo setPrivatee(Byte privatee) {
        this.privatee = privatee;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoInfo videoInfo = (VideoInfo) o;
        return vid == videoInfo.vid &&
                Objects.equals(uid, videoInfo.uid) &&
                Objects.equals(title, videoInfo.title) &&
                Objects.equals(keyword, videoInfo.keyword) &&
                Objects.equals(channel, videoInfo.channel) &&
                Objects.equals(duration, videoInfo.duration) &&
                Objects.equals(framerate, videoInfo.framerate) &&
                Objects.equals(hd, videoInfo.hd) &&
                Objects.equals(addtime, videoInfo.addtime) &&
                Objects.equals(viewnumber, videoInfo.viewnumber) &&
                Objects.equals(likes, videoInfo.likes) &&
                Objects.equals(dislikes, videoInfo.dislikes) &&
                Objects.equals(videoUrl, videoInfo.videoUrl) &&
                Objects.equals(embeddedUrl, videoInfo.embeddedUrl) &&
                Objects.equals(priviewUrl, videoInfo.priviewUrl) &&
                Objects.equals(previewVideoUrl, videoInfo.previewVideoUrl) &&
                Objects.equals(privatee, videoInfo.privatee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vid, uid, title, keyword, channel, duration, framerate, hd, addtime, viewnumber, likes, dislikes, videoUrl, embeddedUrl, priviewUrl, previewVideoUrl, privatee);
    }
}
