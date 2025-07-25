package my.portfolio.back.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import my.portfolio.back.enums.JobTypes;

@Entity
@Table(name = "about")
@Getter
@Setter
public class AboutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "banner_title_uz")
    private String bannerTitleUz;

    @Column(name = "banner_title_en")
    private String bannerTitleEn;

    @Column(name = "banner_title_jp")
    private String bannerTitleJp;

    @Column(name = "banner_content_uz")
    private String bannerContentUz;

    @Column(name = "banner_content_en")
    private String bannerContentEn;

    @Column(name = "banner_content_jp")
    private String bannerContentJp;

    @Column(name = "about_content_uz")
    private String aboutContentUz;

    @Column(name = "about_content_en")
    private String aboutContentEn;

    @Column(name = "about_content_jp")
    private String aboutContentJp;

    @Column(name = "footer_text_uz")
    private String footerTextUz;

    @Column(name = "footer_text_en")
    private String footerTextEn;

    @Column(name = "footer_text_jp")
    private String footerTextJp;

    @Column(name = "about_picture")
    private String aboutPicture;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "resume_link")
    private String resumeLink;

    @Column(name = "job_type")
    @Enumerated(EnumType.STRING)
    private JobTypes jobType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannerTitleUz() {
        return bannerTitleUz;
    }

    public void setBannerTitleUz(String bannerTitleUz) {
        this.bannerTitleUz = bannerTitleUz;
    }

    public String getBannerTitleEn() {
        return bannerTitleEn;
    }

    public void setBannerTitleEn(String bannerTitleEn) {
        this.bannerTitleEn = bannerTitleEn;
    }

    public String getBannerTitleJp() {
        return bannerTitleJp;
    }

    public void setBannerTitleJp(String bannerTitleJp) {
        this.bannerTitleJp = bannerTitleJp;
    }

    public String getBannerContentUz() {
        return bannerContentUz;
    }

    public void setBannerContentUz(String bannerContentUz) {
        this.bannerContentUz = bannerContentUz;
    }

    public String getBannerContentEn() {
        return bannerContentEn;
    }

    public void setBannerContentEn(String bannerContentEn) {
        this.bannerContentEn = bannerContentEn;
    }

    public String getBannerContentJp() {
        return bannerContentJp;
    }

    public void setBannerContentJp(String bannerContentJp) {
        this.bannerContentJp = bannerContentJp;
    }

    public String getAboutContentUz() {
        return aboutContentUz;
    }

    public void setAboutContentUz(String aboutContentUz) {
        this.aboutContentUz = aboutContentUz;
    }

    public String getAboutContentEn() {
        return aboutContentEn;
    }

    public void setAboutContentEn(String aboutContentEn) {
        this.aboutContentEn = aboutContentEn;
    }

    public String getAboutContentJp() {
        return aboutContentJp;
    }

    public void setAboutContentJp(String aboutContentJp) {
        this.aboutContentJp = aboutContentJp;
    }

    public String getFooterTextUz() {
        return footerTextUz;
    }

    public void setFooterTextUz(String footerTextUz) {
        this.footerTextUz = footerTextUz;
    }

    public String getFooterTextEn() {
        return footerTextEn;
    }

    public void setFooterTextEn(String footerTextEn) {
        this.footerTextEn = footerTextEn;
    }

    public String getFooterTextJp() {
        return footerTextJp;
    }

    public void setFooterTextJp(String footerTextJp) {
        this.footerTextJp = footerTextJp;
    }

    public String getAboutPicture() {
        return aboutPicture;
    }

    public void setAboutPicture(String aboutPicture) {
        this.aboutPicture = aboutPicture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getResumeLink() {
        return resumeLink;
    }

    public void setResumeLink(String resumeLink) {
        this.resumeLink = resumeLink;
    }

    public JobTypes getJobType() {
        return jobType;
    }

    public void setJobType(JobTypes jobType) {
        this.jobType = jobType;
    }
}
