package yomuland.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String subTitle;
    private Date publishDate;
    private boolean deleted;
    private boolean internal;
    private String PublishingOrg;

    @Enumerated(EnumType.ORDINAL)
    private LanguageEnum language;

    @Enumerated(EnumType.STRING)
    private StatusTypeEnum statusType;
    private Date statusDate;
    private String creator;
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public String getPublishingOrg() {
        return PublishingOrg;
    }

    public void setPublishingOrg(String publishingOrg) {
        PublishingOrg = publishingOrg;
    }

    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public StatusTypeEnum getStatusType() {
        return statusType;
    }

    public void setStatusType(StatusTypeEnum statusType) {
        this.statusType = statusType;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
