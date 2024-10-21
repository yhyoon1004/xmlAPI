package test.xmlapi;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SampleDTO {
    private String title;
    private int count;

    public SampleDTO() {}

    public SampleDTO(String title, int count) {
        this.title = title;
        this.count = count;
    }

    @XmlElement
    public String getTitle() {
        return title;
    }
    @XmlElement
    public int getCount() {
        return count;
    }
}
