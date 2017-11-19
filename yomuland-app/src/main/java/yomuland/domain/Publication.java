package yomuland.domain;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

@Entity
public class Publication {

    public Publication(String title, Date publishDate, String publishingOrg, LanguageEnum language, StatusTypeEnum statusType, String creator) {
        this.title = title;
        this.publishDate = publishDate;
        PublishingOrg = publishingOrg;
        this.language = language;
        this.statusType = statusType;
        this.creator = creator;
    }

    Publication(){}

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

    @UpdateTimestamp
    @Temporal(TIMESTAMP)
    private Date statusDate;

    private String creator;

    @CreatedDate
    @Temporal(TIMESTAMP)
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
