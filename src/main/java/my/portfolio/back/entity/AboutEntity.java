package my.portfolio.back.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
}
